pipeline {
    agent any

    tools {
        jdk "Java8"
        maven "DefaultMAven"
    }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/avamsykiran/spring-dummy-repo.git'
                
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
