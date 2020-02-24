pipeline {
    agent any
       tools {
       gradle 'GRADLE_HOME' 
    }
    stages {
        stage('Build') {
        steps {
            sh "cd"
            sh "docker-compose up -d"
            echo 'Building..'
        }
    }
       stage('Integration Test') {
             steps {
                 script {
             def GRADLE_Home = tool 'GRADLE_HOME'
                 checkout([$class: 'GitSCM', branches: [[name: 'master']], doGenerateSubmoduleConfigurations: false, extensions: [],submoduleCfg: [], userRemoteConfigs: [[url:'https://github.com/Vladyslavtovkun/Test-Framework.git']]])
                withGradle(gradle : 'gradle-5.4.1')
                 sh "${GRADLE_HOME}/bin/gradle clean test"
             }
         }
    }
    stage('close') {
        steps {
            sh "docker-compose down"
            echo 'Deploying....'
        }
    }
  }
}