pipeline {
    agent any
    tools {
        maven 'Maven 3' // Replace with the correct name of the Maven tool configured in Jenkins
    }

    stages {
        stage('Example') {
            steps {
                // Use 'withMaven' block to automatically set up Maven for the build
                withMaven(maven: 'Maven 3') {
                    // Run Maven commands within this block
                    bat 'mvn clean test'
                }
            }
        }
    }
}
