def call(Map config) {
    pipeline {
        agent any

        stages {

            stage('Build') {
                steps {
                    echo "Building ${config.appName}"
                }
            }

            stage('Test') {
                steps {
                    echo "Testing ${config.appName}"
                }
            }

            stage('Scan') {
                steps {
                    echo "Scanning ${config.appName}"
                }
            }

            stage('Deploy') {
                steps {
                    echo "Deploying ${config.appName}"
                }
            }
        }
    }
}
