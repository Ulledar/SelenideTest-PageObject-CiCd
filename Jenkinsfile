pipeline {
    agent none
    stages {
        stage('build') {
            steps {
                node {
                    script {
                        echo 'hello again'
                        sh 'mvn --version'
                    }
                }
            }
        }
    }
}