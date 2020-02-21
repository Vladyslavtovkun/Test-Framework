pipline{
    agent any
    stages{
        stage('Setup Docker containers ') {
            steps {
                sh 'docker-compose up -d'
            }
        }
    }

    stage('Run Regression Suite') {
        steps {
            sh 'gradle clean test'
        }
    }

    stage('Close Docker containers'){
        steps {
            sh 'docker-compose down'
        }
    }
}