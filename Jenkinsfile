#!groovy

pipeline {
    environment {
        JAVA_TOOL_OPTIONS = "-Duser.home=/var/lib/jenkins"
    }
    agent {
        dockerfile {
            label "docker"
            args "-v /tmp/maven:/var/lib/jenkins/.m2 -e MAVEN_CONFIG=/var/lib/jenkins/.m2"
        }
    }

    stages {
        stage("Build") {
            steps {
                sh "ssh -V"
                sh "mvn -version"
                sh "mvn clean install"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}