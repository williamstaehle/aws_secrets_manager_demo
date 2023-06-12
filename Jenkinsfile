pipeline {
    agent any

    tools {
        maven 'MavenOnJenkins'
    }

    stages {
        stage("Test") {
            steps {
                echo 'Testing..'
                sh 'mvn test'
            }
        }
    }
}