pipeline {
    agent any
    stages {
        stage('build')
                {
                    steps {
                        bat "c:/Users/Vladyslav_Tovkun/Downloads/Test-Framework/runner.bat"
                    }
                }
        stage('docker-compose')
                {
                    steps {
                        sh "docker-compose down || true"
                    }
                }
    }
}