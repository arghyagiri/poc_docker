pipeline {
    agent { dockerfile true }

    tools {
        maven 'maven3'
      }
    stages {
        stage ('Build') {
          steps {
            sh 'mvn clean package'
          }
        }
        stage('Test') {
            steps {
                sh 'node --version'
                sh 'svn --version'
            }
        }
    }
}