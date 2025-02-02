pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/Mohammad-Arafath/JUnit_Math.git'
            }
        }

        stage('Compile') {
            steps {
                script {
                    bat '''
                        cd JUnit_Java
                        if not exist bin mkdir bin
                        javac -cp ".;lib\\junit-jupiter-api-5.11.4.jar;lib\\junit-jupiter-engine-5.11.4.jar;lib\\junit-platform-console-standalone-1.11.4.jar" -d bin JUinit_Test\\MathUtils.java JUinit_Test\\MathUtilsTest.java
                    '''
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    bat '''
                        cd JUnit_Java
                        if not exist test-reports mkdir test-reports
                        java -jar lib\\junit-platform-console-standalone-1.11.4.jar --class-path bin --scan-class-path --reports-dir=test-reports
                    '''
                }
            }
        }
    }

    post {
        always {
            junit 'JUnit_Java/test-reports/TEST-*.xml'
        }
    }
}