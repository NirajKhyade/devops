pipeline {
    agent any
    stages{
       
        stage('build docker image'){
            steps{
                script{
                    checkout([$class: 'GitSCM', branches: [[name: '*/ReactImage']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/NirajKhyade/devops.git']]])
                    withCredentials([string(credentialsId: 'dockerUser', variable: 'UserID')]){
                    sh 'docker build -f Dockerfile -t ${UserID}/reactapp .'
}
                }
            }
        }
        stage('push docker image to docker hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerUser', variable: 'UserID'), string(credentialsId: 'dockerhub-pwd', variable: 'Password')]) {
                    sh 'docker login -u ${UserID} -p ${Password}'
                    sh 'docker push ${UserID}/reactapp'
}
                }
            }
        }
    }
}