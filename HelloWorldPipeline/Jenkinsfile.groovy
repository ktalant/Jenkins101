pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                echo 'Hello world!'
            }
        }
        stage ("Build"){
          steps {
              echo "Building"
          }
        }
    }
}
