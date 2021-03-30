def label = "PipeTest"

node {

    environment {
        PROJECT_NAME = "ololosha ololo"
    }

    stage('cron'){
            cron('H/3 * * * *')
    }

    stage('SCM') {
        git 'https://github.com/Ulledar/SelenidePractice.git'
    }

    stage('Compile-Package') {
        def mvnHome = tool name: '3.6.3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }

    stage('Reports') {
        script {
            allure([
                includeProperties: false,
                jdk: '',
                properties: [],
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'target/allure-results']]
            ])
        }
    }
}

// pipeline {
//
//     agent none
//
//     options {
//         timeout(time: 1, unit: 'MINUTES')
//     }
//
//     environment {
//         PROJECT_NAME = "ololosha ololo"
//     }
//
//     stages {
//          stage('SCM') {
//                     git 'https://github.com/Ulledar/SelenidePractice.git'
//                 }
//
//                 stage('Compile-Package') {
//                     def mvnHome = tool name: '3.6.3', type: 'maven'
//                     sh "${mvnHome}/bin/mvn package"
//                 }
//
//                 stage('Reports') {
//                     script {
//                         allure([
//                             includeProperties: false,
//                             jdk: '',
//                             properties: [],
//                             reportBuildPolicy: 'ALWAYS',
//                             results: [[path: 'target/allure-results']]
//                         ])
//                     }
//                 }
//          }
//     }

