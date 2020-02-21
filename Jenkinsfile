pipline{
    agent any
    stages{
        stage('Setup Docker containers ') {
            steps {
                sh label: '', script: 'docker-compose up -d'
            }
        }
    }

    stage('Run Regression Suite') {
        steps {
            sh label: '', script: 'gradle clean test'
        }
    }

    stage('Close Docker containers'){
        steps {
            sh label: '', script: 'docker-compose down'
        }
    }
}