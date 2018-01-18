
pipeline {
     agent any
     tools{
     maven 'Maven 3.5.2'
     jdk 'JDK 9.0.1'
     }
     stages {


               stage ('First Test Stage') {

                          steps {
                             bat 'mvn test'
                              }
                          }


               stage ('Second Test Stage') {

                                         steps {
                                            bat 'mvn clean install -Dsurefire.suiteXmlFiles=anotherTest.xml'
                                             }
                                         }


         stage ('Compile Stage') {

             steps {
                bat 'mvn install'
                 }
             }
          }
      }