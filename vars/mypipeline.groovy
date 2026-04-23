def call(Map config) {

    stage('Build') {
        echo "Building ${config.appName}"
    }

    stage('Test') {
        echo "Testing ${config.appName}"
    }

    stage('Scan') {
        echo "Scanning ${config.appName}"
    }

    stage('Deploy') {
        echo "Deploying ${config.appName}"
    }
}
