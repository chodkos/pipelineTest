pipeline {
    agent any

    stages{
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