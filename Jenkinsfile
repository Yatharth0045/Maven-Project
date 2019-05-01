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
		    parallel {
		        stage ('Test Addition') {
		            steps {
		                withMaven(maven: 'maven3') {
		                    sh 'mvn -Dtest=AdditionTest test'
		                }
		            }
		        }
		        stage ('Test Subtraction') {
		            steps {
		                withMaven(maven: 'maven3') {
		                    sh 'mvn -Dtest=SubtractionTest test'
		                }
		            }
		        }
		    }
		}
		stage ('Generate Artifact') {
			steps {
				withMaven(maven: 'maven3') {
					sh 'mvn package'
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
