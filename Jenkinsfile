pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/technical-tiwari/blog-backend.git'
            }
        }
        stage('Build') {
            steps {
                script {
                    if (isUnix()) {
                        sh './mvnw clean package'
                    } else {
                        bat 'mvnw.cmd clean package'
                    }
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    if (isUnix()) {
                        sh './mvnw test'
                    } else {
                        bat 'mvnw.cmd test'
                    }
                }
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
