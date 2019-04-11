pipeline{
    agent any

    stages{
        stage('Compile Stage'){
            steps{
                withMaven(maven : 'maven'){
                    sh 'hello'
                    sh 'pwd'
                    sh 'mvn -version'
                    sh 'mvn compile'

                }
            }
        }
          stage('Build Stage'){
                    steps{
                        withMaven(maven : 'maven'){
                            sh 'Build time'
                            sh 'pwd'
                            sh 'mvn package'

                        }
                    }
                }

    }



}