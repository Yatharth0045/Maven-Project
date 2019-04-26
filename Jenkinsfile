pipeline {
    agent any
    stages {
        stage ('Clean Code') {
            steps {
                withMaven(maven: 'maven3') {
                    sh 'mvn clean'
                }
            }
        }
        stage ('Generate Artifact') {
            steps {
                withMaven(maven: 'maven3') {
                    sh 'mvn clean install'
                }
            }
        }
        stage ('Jacoco Coverage Report') {
            steps {
                jacoco exclusionPattern: 'Main.class'
            }
        }
    }
}