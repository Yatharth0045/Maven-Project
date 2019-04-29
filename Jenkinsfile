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
                    sh 'mvn install'
                }
            }
        }
        stage ('Jacoco Coverage Report') {
            steps {
                jacoco exclusionPattern: 'Main.class'
            }
        }
        stage ('Publish HTML Reports') {
            steps {
                publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: '/target/site/jacoco', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: ''])
            }
        }
    }
}