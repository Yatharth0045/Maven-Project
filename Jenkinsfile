pipeline {
    agent any
    stages {
        stage ('Compile Code') {
            steps {
                withMaven(maven: 'maven3') {
                    sh 'mvn clean compile'
                }
            }
        }
        stage ('Test Code') {
            steps {
                withMaven(maven: 'maven3') {
                    sh 'test'
                }
            }
        }
    }
}