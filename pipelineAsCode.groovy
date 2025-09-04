pipeline{
    agent any
    stages{
        stage('All in one'){
            steps{
                git 'https://github.com/rohanpathak333/java-project-maven-new.git'
                sh 'mvn compile'
                sh 'mvn test'
                sh 'mvn package'
            }
        }
    }
}
