def label = "PipeTest"

pipeline {

    agent none

    options {
        timeout(time: 1, unit: 'MINUTES')
    }

    environment {
        PROJECT_NAME = "ololosha ololo"
    }

    stages {
        stage('build') {
            steps {
                node('123') {
                    script {
                        echo "hello again ${PROJECT_NAME}"
                        sh 'mvn --version'
                    }
                }
            }
        }
    }
}