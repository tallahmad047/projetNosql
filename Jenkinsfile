pipeline {
    agent any
    tools{
           maven '3.8.6'
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
         stage('Deploy') {
                    steps {
                        ansiblePlaybook colorized: true, playbook: 'deploy.yml'
                    }
                }


    }
}
