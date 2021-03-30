def label = "PipeTest"

pipeline {

    agent none

    options {
        timeout(time: 1, unit: 'MINUTES')
    }

    environment {
        PROJECT_NAME = "ololosha ololo"
    }

    node {
        stage('SCM') {
            git 'https://github.com/Ulledar/SelenidePractice.git'
        }

        stage('Compile-Package') {
            def mvnHome = tool name: '3.6.3', type: 'maven'
            sh "${mvnHome}/bin/mvn package"
        }
    }
}