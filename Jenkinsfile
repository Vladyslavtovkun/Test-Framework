pipeline {
    agent any
    stages {
        stage('build and run')
                {
                    steps {
                        bat "c:/Users/Vladyslav_Tovkun/Downloads/Test-Framework/startAndRun.bat"
                    }
                }
        stage('stop the process')
                {
                    steps {
                        sh "c:/Users/Vladyslav_Tovkun/Downloads/Test-Framework/stop.bat"
                    }
                }
    }
}