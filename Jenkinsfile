
pipeline {
    agent any

    environment {
        JAVA_HOME = '/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home'
        PATH = "/opt/homebrew/bin:/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin:${env.PATH}"
    }

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
            junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
        }
        success {
            echo 'All tests passed successfully!'
        }
        failure {
            echo 'Build or tests failed!'
        }
    }
}
