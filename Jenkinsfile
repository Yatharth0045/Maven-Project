pipeline {
	agent any
	environment {
		HELLO_MESSAGE = "${hello}"
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
				jacoco changeBuildStatus: true, exclusionPattern: '**/*Main.class'
			}
		}
		stage ('Archive Artifact') {
			steps {
				archiveArtifacts 'target/SampleMavenProject-1.0-SNAPSHOT-shaded.jar'
			}
		}
		stage ('Deploy on ec2 instance') {
			when {
				branch 'master'
			}
			steps {
				
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
