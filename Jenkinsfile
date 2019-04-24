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
        stage ('Compile Code') {
            steps {
                withMaven(maven: 'maven3') {
                    sh 'mvn compile'
                }
            }
        }
        stage ('Test Code') {
            steps {
                withMaven(maven: 'maven3') {
                    sh 'mvn test'
                }
            }
        }
        stage ('Package Code') {
            steps {
                withMaven(maven: 'maven3') {
                    sh 'mvn package'
                }
            }
        }
        stage ('Generate Artifact') {
            steps {
                withMaven(maven: 'maven3') {
                    sh 'mvn install'
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