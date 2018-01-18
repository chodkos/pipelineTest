
pipeline {
     agent any
     tools{
     maven 'Maven 3.5.2'
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
         }

         stage ('Compile Stage') {

             steps {
                 bat 'mvn complile'
                 }
             }
          }
      }