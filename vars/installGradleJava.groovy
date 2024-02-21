def call() {
  node {
    stage('Install Gradle') {
      // Choose a different directory where the Jenkins user has write permissions
      def gradleDir = "${workspace}/gradle"

      // Install Gradle
      sh "mkdir -p ${gradleDir}"
      sh "wget https://services.gradle.org/distributions/gradle-7.6.4-bin.zip -P ${gradleDir}"
      sh "unzip -d ${gradleDir} ${gradleDir}/gradle-7.6.4-bin.zip"
      sh "export PATH=$PATH:${gradleDir}/gradle-7.6.4/bin"
    }

    stage('Install Java') {
      // Install Java
      //sh 'yum install -y java-1.8.0'
      sh 'sudo amazon-linux-extras install java-openjdk11 -y'
    }
  }
}
