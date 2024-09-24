pipeline {
  agent {
    docker {
      image 'maven:3.8.5-openjdk-17'
      args '--user root -v /var/run/docker.sock:/var/run/docker.sock' // mount Docker socket to access the host's Docker daemon
    }
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
