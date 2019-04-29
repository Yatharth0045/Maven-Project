pipeline {
	agent any
	environment {
		HELLO_MESSAGE = "Welcome to Demo CapStone Project"
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
		stage ('Jacoco Coverage Report') {
			steps {
				jacoco exclusionPattern: 'Main.class', sourceExclusionPattern: 'Main.java'
			}
		}
		stage ('Archive Artifact') {
			steps {
				archiveArtifacts 'target/SampleMavenProject-1.0-SNAPSHOT-shaded.jar'
			}
		}
	}
	post {
		success {
			mail bcc: '', body: 'The build is successful', cc: '', from: '', replyTo: '', subject: 'Build Success', to: 'yatharth0045@gmail.com'
		}
		unsuccessful {
			mail bcc: '', body: 'The build is unsuccessful', cc: '', from: '', replyTo: '', subject: 'Build Success', to: 'yatharth0045@gmail.com'
		}
	}
}