#!groovy

pipeline {
    agent any
    stages{
        stage("verify tooling"){
            steps{
                sh '''
                    docker version
                    docker info
                    docker-compose version
                '''
            }
        }

        stage('Prune Docker Data'){
            steps{
                sh 'docker system prune -a --volumes -f'
            }
        }

        stage('Start Container'){
            steps{
                sh 'docker compose up -d --no-color --wait'
                sh 'docker compose ps'
            }
        }

        stage('Run tests against the container'){
            steps{
                sh 'curl http://localhost:9999/user'
            }
        }
    }

    post{
        always{
            sh 'docker compose down --remove-orphans -v'
            sh 'docker compose ps'
        }
    }
}
