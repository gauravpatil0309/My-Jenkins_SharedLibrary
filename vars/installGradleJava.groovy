def call() {
  node {
    stage('Check if gradle is already Installed') {
      // Choose a different directory where the Jenkins user has write permissions
      def gradleDir = ("/home/ec2-user")
      def isGradleInstalled = sh(returnStatus: true, script: 'which gradle')
      //def isGradleInstalled = sh(returnStdout: true, script: 'which gradle')

      if (isGradleInstalled == 0) {
        echo "Gradle is already installed"
      } else {
      sh "mkdir -p ${gradleDir}"
      sh "wget https://services.gradle.org/distributions/gradle-7.6.4-bin.zip -d ${gradleDir}"
      sh "unzip -d ${gradleDir} ${gradleDir}/gradle-7.6.4-bin.zip"
      //sh "cp ${gradleDir}/gradle-7.6.4/bin/gradle /usr/local/bin"
      sh "export PATH=$PATH:${gradleDir}/gradle-7.6.4/bin"
        }
      }    

    stage('Install Java') {
      // Install Java
      //sh 'yum install -y java-1.8.0'
      sh 'sudo amazon-linux-extras install java-openjdk11 -y'
    }
  }
}
