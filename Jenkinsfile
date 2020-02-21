
pipline{
    agent {
        docker { image '53a24db657dd'
            image 'c4ca190f88a7'}
    }
    stages{
        stage('Setup Docker containers ') {
            steps {
                sh "docker-compose up -d"
            }
        }
    }

    environment {
        COMPOSE_FILE = "docker-compose.yml"
    }

    stage('Run Regression Suite') {
        steps {
            withGradle(gradle : 'GRADLE_HOME')
            sh 'gradle clean test'
        }
    }

    post {
        always {
            sh "docker-compose down || true"
        }
    }
}