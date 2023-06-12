pipeline {
    agent any

    tools {
        maven 'MavenOnJenkins'
    }

    stages {
        stage("Test") {
            steps {
                withAWS(credentials, 'aws-poc', region, 'us-east-1') {
                    echo 'Testing..'
                    sh 'mvn test'
                }
            }
        }
    }
}