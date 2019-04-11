pipeline{
 environment {
    registry = "rowanf/jenkins"
    registryCredential = "docker"
     dockerImage = ""
  }
    agent any

    stages{
        stage('Compile Stage'){
            steps{
                withMaven(maven : 'maven'){
                    sh 'echo hello'
                    sh 'pwd'
                    sh 'mvn -version'
                    sh 'mvn compile'

                }
            }
        }

    stage('Build Stage'){
            steps{
                withMaven(maven : 'maven'){
                    sh 'echo Build time'
                    sh 'pwd'
                    sh 'mvn package'

                }
            }
        }

    stage('DOCKER TIME'){
        steps{
            script {
                dockerImage =  docker.build(registry)
                docker.build registry + ":$BUILD_NUMBER"
                sh 'pwd'
            }
        }
    }

    stage('DEPLOY '){
        steps{
            script {
                docker.withRegistry( '', registryCredential ) {
                           dockerImage.push()
                }
            }
        }
    }



    }





}