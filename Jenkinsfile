def label = "PipeTest"

pipeline {

    agent none

    options {
        timeout(time: 1, unit: 'MINUTES')
    }

    environment {
        PROJECT_NAME = "ololosha ololo"
    }

    tools {
            maven '3.6.3'
    }

    stages {
        stage('build') {
            steps {
                echo "hello again ${PROJECT_NAME}"
                sh 'mvn -Dmaven.test.failure.ignore=true install'
            }
        }

        stage('Publish') {
            steps {
                echo 'Publish Allure report'
                publishHTML(
                        target: [
                                allowMissing         : false,
                                alwaysLinkToLastBuild: false,
                                keepAll              : true,
                                reportDir            : 'target/site/allure-maven-plugin',
                                reportFiles          : 'index.html',
                                reportName           : "Allure Report"
                        ]
                )
            }
        }
    }
}