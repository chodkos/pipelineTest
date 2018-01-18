pipeline {
    agent any

    stages{

        stage('Hello World Stage'){
                steps{
                withMaven(maven : 'Maven 3.5.2'){
                        echo 'Hello World'
                        }
                     }

                }


        stage('Compile Stage'){
        steps{
        withMaven(maven : 'Maven 3.5.2'){
                sh 'mvn clean compile'
                }
             }

        }

        stage('Test Stage'){
        steps{
         withMaven(maven : 'Maven 3.5.2'){
                sh 'mvn test'
                 }
            }
        }


    }

}