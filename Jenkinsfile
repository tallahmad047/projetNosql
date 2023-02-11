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

                sh 'mvn package -DskipTests'
            }
        }
        stage('Deploy') {
                steps {
                     ansiblePlaybook colorized: true, playbook: 'deploy.yml', extraVars: '{"ansible_user": "nambe", "ansible_inventory": "host.yml"}'
                        //ansiblePlaybook colorized: true, playbook: 'deploy.yml', extraVars: ['-u': 'nambe', '-i': 'host.yml']
                         //ansiblePlaybook(colorized: true, playbook: 'deploy.yml', extraVars: ['-u', 'nambe', '-i', 'host.yml'])
                    // ansible-playbook -i host.yml  deploy.yml -u nambe -k -e 'ansible_python_interpreter=/usr/bin/python3'

                  }
                }
        


    }
}
