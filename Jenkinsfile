pipline{
    agent {
        docker { image '53a24db657dd'
            image 'c4ca190f88a7'}
    }
    stages{
        stage('Setup Docker containers ') {
            steps {
                sh 'docker-compose up -d'
            }
        }
    }

    stage('Run Regression Suite') {
        steps {
            withGradle(gradle : 'GRADLE_HOME')
            sh 'gradle clean test'
        }
    }

    stage('Close Docker containers'){
        steps {
            sh 'docker-compose down'
        }
    }
}