pipeline {
	agent any
	environment {
		HELLO_MESSAGE = ""Welcome to Demo CapStone Project""
	}
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
	}
}