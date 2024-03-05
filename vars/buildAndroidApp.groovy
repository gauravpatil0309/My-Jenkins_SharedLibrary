def call() {
  //sh '/var/lib/jenkins/workspace/android-app/./gradlew clean'
  //sh '/var/lib/jenkins/workspace/android-app/./gradlew assembleDebug --info'
    sh 'sudo -H -u ec2-user bash -c 'whoami && cd /var/lib/jenkins/workspace/android-app && ./gradlew assembleDebug --stacktrace'
}
