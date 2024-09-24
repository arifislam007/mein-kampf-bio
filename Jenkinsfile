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
        sh 'echo passed'
        git branch: 'pipeline', url: 'https://github.com/arifislam007/mein-kampf-bio.git'
      }
    }
    stage('Java Build') {
      steps {
        sh 'mvn clean install'
      }
    }
  }
}
