pipeline {
    agent any
    stages {
        stage ('Clean Previous Build') {
            steps {
                withMaven(maven: 'mvn') {
                    sh 'mvn clean'
                }
            }
        }
        stage ('Compile Code') {
            steps {
                withMaven(maven: 'mvn') {
                    sh 'mvn compile'
                }
            }
        }
        stage ('Test Code') {
            steps {
                withMaven(maven: 'mvn') {
                    sh 'mvn test'
                }
            }
        }
    }
}