pipeline {
    agent any
    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-17' // Update with your Java path
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
    }
    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Mohammad-Arafath/JUnit_Math.git'
            }
        }

        stage('Compile') {
            steps {
                script {
                    bat '''
                    cd JUnit_Java
                    if not exist bin mkdir bin
                    javac -cp ".;lib\\junit-jupiter-api-5.11.4.jar;lib\\junit-jupiter-engine-5.11.4.jar;lib\\junit-platform-console-standalone-1.11.0.jar" -d bin JUinit_Test\\MathUtils.java JUinit_Test\\MathUtilsTest.java
                    '''
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    bat '''
                    cd JUnit_Java
                    java -jar lib\\junit-platform-console-standalone-1.11.4.jar --class-path bin --scan-class-path
                    '''
                }
            }
        }
    }
    post {
        always {
            junit '**/JUnit_Java/bin/*.xml'
        }
    }
}
