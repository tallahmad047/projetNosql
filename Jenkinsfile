pipeline {
    agent any
    tools{
           maven '3.6.3'
       }

    stages {
        stage("source"){
              steps{
                 git branch: 'master' ,url:'https://github.com/tallahmad047/projetNosql.git'
                 }
            }
        stage('Build') {
            steps {
                // Build steps for your application

                bat 'mvn package'
            }
        }
        


    }
}
