pipeline {
  agent { any
  }
  tools {
    jdk 'jdk'
    maven 'mvn'
  }
  stages {
    stage('Checkout') {
      steps {
        git branch: 'pipeline', url: 'https://github.com/arifislam007/mein-kampf-bio.git'
      }
    }
    stage('Java Complie') {
      steps {
        sh 'mvn compile'
      }
    }
    stage('Java Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Java Package') {
      steps {
        sh 'mvn package'
      }
    }
    stage('Docker Imgae Build') {
      steps {
        sh'''
           docker build -t arifislam/java-cde-19:${BUILD_BUMBER} .
        '''
      }
    }
  }
}
