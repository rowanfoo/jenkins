pipeline{
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
                docker.build('helo.image')
                  sh 'pwd'
            }
        }
    }

}


}