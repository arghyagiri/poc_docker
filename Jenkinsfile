pipeline {
    agent { dockerfile true }

    tools {
        maven 'maven3'
        jdk 'openJdk11'
      }

    stages {
        stage ('Initialize') {
                              steps {
                                  sh '''
                                      echo "PATH = ${PATH}"
                                      echo "M2_HOME = ${M2_HOME}"
                                  '''
                              }
                          }

                          stage ('Build') {
                              steps {
                                  sh 'mvn -Dmaven.test.failure.ignore=true install'
                              }
                              post {
                                  success {
                                      junit 'target/surefire-reports/**/*.xml'
                                  }
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