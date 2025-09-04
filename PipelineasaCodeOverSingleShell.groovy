pipeline{
    agent any
    stages{
        stage('checkout'){
            steps{
                git 'https://github.com/rohanpathak333/java-project-maven-new.git'
                sh '''
                mvn compile
                mvn test
                mvn package
                '''
            }
        }
    }
}
