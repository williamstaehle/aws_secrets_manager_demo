pipeline {
    agent any

    stages {
        stage("Test") {
            steps {
                echo 'Testing..'
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
                sh 'mvn test'
            }
        }
    }
}