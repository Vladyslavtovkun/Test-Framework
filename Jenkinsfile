node {
    stage('Setup Docker containers ') {
        sh "docker-compose up -d"
    }
}
stage('Run Regression Suite') {
    withGradle(gradle: 'GRADLE_HOME')
    sh 'gradle clean test'

}

stage('Stop Docker containers') {
    sh "docker-compose down"

}