pipeline {
    agent any

    tools {
        mvn 'MavenOnJenkins'
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