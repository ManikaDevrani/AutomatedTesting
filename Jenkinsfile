
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building Java project...'
                sh 'mvn -B clean compile'
            }
        }

        stage('Unit and Integration Tests') {
            steps {
                echo 'Running automated tests...'
                sh 'mvn -B test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        success {
            echo 'All tests passed successfully!'
        }
        failure {
            echo 'Build or tests failed!'
        }
    }
}
