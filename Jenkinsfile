pipeline {
    agent any
    tools{
         maven "maven3"
     }
     stages{
         stage('Build Maven'){
             steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/ReactAppImage']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/NirajKhyade/devops.git']]])
                sh 'mvn clean install'
             }
        }
         stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t nirajkhyade/springreactimage .'
                }
             }
            }
         stage('Push Selenium Docker Image'){
             steps{
                 script{
                      withCredentials([string(credentialsId: 'userid', variable: 'uid'), string(credentialsId: 'password', variable: 'pass')]) {
                      sh 'docker login -u ${uid} -p ${pass}'
                      sh 'docker push ${uid}/springreactimage'
}

                 }
             }
         }
        }
}