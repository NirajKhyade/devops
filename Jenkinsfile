pipeline {
    agent any
    stages{
       
        stage('build docker image'){
            steps{
                script{
                    checkout([$class: 'GitSCM', branches: [[name: '*/ReactImage']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/NirajKhyade/devops.git']]])
                    withCredentials([string(credentialsId: 'dockerUser', variable: 'UserID')]){
                    sh 'docker build -f Dockerfile -t ${UserID}/react-app .'
}
                }
            }
        }
        stage('push docker image to docker hub'){
            steps{
                script{
                     withCredentials([string(credentialsId: 'userid', variable: 'uid'), string(credentialsId: 'password', variable: 'pass')]) {
                      sh 'docker login -u ${uid} -p ${pass}'
                      sh 'docker push ${uid}/react-app'
}
                }
            }
        }
    }
}