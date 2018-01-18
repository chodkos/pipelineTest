
pipeline {
     agent any
     def mvnTool = tool 'Maven_3_3_9'

     stages {
         stage ('Initialize') {

             steps {
                 bat '''
                        echo "PATH = ${PATH}"
                        echo "M2_HOME = ${M2_HOME}"
                        '''
                 }
             }


         stage ('Compile Stage') {

             steps {
                sh "${mvnTool}/bin/mvn clean install"
                 }
             }
          }
      }