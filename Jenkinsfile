pipeline {
    agent any
    stages {
        stage ('Clean Code') {
            steps {
                    sh 'mvn clean'
            }
        }
        stage ('Compile Code') {
            steps {
                    sh 'mvn compile'
            }
        }
        stage ('Test Code') {
            steps {
                    sh 'test'
            }
        }
    }
}