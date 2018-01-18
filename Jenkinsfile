pipeline {
    agent any
     tools {
            maven 'Maven 3.5.2'
        }

    stages{

        stage('Hello World Stage'){
                steps{
                withMaven(maven : 'Maven 3.5.2'){
                        echo 'Hello World'
                        }
                     }

                }

                stage ('Initialize') {
                            steps {
                                sh '''
                                    echo "PATH = ${PATH}"
                                    echo "M2_HOME = ${M2_HOME}"
                                '''
                            }
                        }

 stage('Compile Stage'){
        steps{

                sh 'mvn -Dmaven.test.failure.ignore=true install'

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