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
        git branch: 'tomcat-deploy', url: 'https://github.com/arifislam007/mein-kampf-bio.git'
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
    stage('Deploy to Tomcat Server') {
      steps {
        deploy adapters: [tomcat9(credentialsId: 'tomcat-access', path: '', url: 'http://192.168.207.132:8080')], contextPath: null, onFailure: false, war: '**/*.war'
      }
    }
  }
}
