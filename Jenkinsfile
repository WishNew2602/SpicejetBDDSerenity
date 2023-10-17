pipeline {
    agent any // You can specify a specific agent here

    stages {
        stage('Checkout') {
            steps {
                git(url: 'https://github.com/WishNew2602/SpicejetBDDSerenity.git')
            }
        }

        stage('Clean') {
            steps {
                // Execute the Gradle clean task
                sh './gradlew clean'
            }
        }

        stage('Test') {
            steps {
                // Execute the Gradle Test task
                sh './gradlew test'
            }
        }

        stage('Aggregate') {
            steps {
                // Execute the Gradle Aggregate task (replace with the actual command)
                sh './gradlew aggregate'
            }
        }

        stage('Deploy') {
            steps {
                // Add deployment steps if needed
            }
        }
    }
}
