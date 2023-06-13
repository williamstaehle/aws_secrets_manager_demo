pipeline {
    agent any

    tools {
        maven 'MavenOnJenkins'
    }

    stages {
        stage("Test") {
            steps {
                echo 'Testing..'
                withAWS(credentials: "aws-poc") {
                    sh 'mvn test'
                }
            }
        }
    }
}