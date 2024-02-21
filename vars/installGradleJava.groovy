def call() {
  node {
    stage('Install Gradle') {
      // Install Gradle
      sh 'wget https://services.gradle.org/distributions/gradle-7.6.4-bin.zip'
      sh 'unzip -d /opt/gradle gradle-7.6.4-bin.zip'
      sh 'export PATH=$PATH:/opt/gradle/gradle-7.6.4/bin'
    }

    stage('Install Java') {
      // Install Java
      // sh 'yum install -y java-1.8.0'
         sh 'amazon-linux-extras install java-openjdk11 -y'
    }
  }
}
