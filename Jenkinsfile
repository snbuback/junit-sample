pipeline {
  agent { label 'hi-speed' }
  stages {
    stage('junit5-jupiter-starter-gradle') {
      tools {
        jdk 'Oracle JDK 8 (latest)'
      }
      steps {
        sh 'cd junit5-jupiter-starter-gradle && ./gradlew --no-daemon clean build'
      }
      post {
        always {
          junit 'build/test-results/test/*.xml'
        }
      }
    }
  }
}
