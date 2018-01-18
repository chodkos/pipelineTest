
pipeline {
     agent any
     tools{
     maven 'Maven 3.5.2'
     jdk 'JDK 9.0.1'
     }
     stages {
         stage ('Initialize') {

             steps {
                 bat '''
                        echo "PATH = ${PATH}"
                        echo "M2_HOME = ${M2_HOME}"
                        '''
                 }
             }

               stage ('Test Stage') {

                          steps {
                             bat 'mvn test'
                              }
                          }


         stage ('Compile Stage') {

             steps {
                bat 'mvn install'
                 }
             }
          }
      }