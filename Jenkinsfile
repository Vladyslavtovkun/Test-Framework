node {
    stage('Setup Docker containers ') {
        steps {
            sh "docker-compose up -d"
        }
    }
}
stage('Run Regression Suite') {
    steps {
        withGradle(gradle: 'GRADLE_HOME')
        sh 'gradle clean test'
    }
}

post {
    always {
        sh "docker-compose down || true"
    }
}