pipeline{
    agent any
    stages{
        stage('checkout'){
            steps{
                git 'https://github.com/rohanpathak333/java-project-maven-new.git'
            }
        }
        stage('compile'){
            steps{
                sh 'mvn compile'
            }
        }
        stage('test'){
            steps{
                sh 'mvn test'
            }
        }
        stage('artifacts'){
            steps{
                sh 'mvn clean package'
            }
        }
        stage('deploy'){
            steps{
                echo 'code is deployed in Tomcat'
            }
        }
    }
}
