def call() {
  //sh '/var/lib/jenkins/workspace/android-app/./gradlew clean'
  //sh '/var/lib/jenkins/workspace/android-app/./gradlew assembleDebug --info'
    sh 'sudo -u ec2-user bash -c "whoami && cd /opt/build/workspace/master-slave-app-test && ./gradlew assembleDebug"'
}
