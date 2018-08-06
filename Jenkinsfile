pipeline {
  agent any
  stages {
    stage('junit5-jupiter-starter-gradle') {
      tools {
        jdk 'JDK 9'
      }
      steps {
        sh './gradlew --no-daemon clean build'
      }
      post {
        always {
          junit 'build/test-results/test/*.xml'
          jacoco()
        }
      }
    }
  }
}
