def call() {
  //sh '/var/lib/jenkins/workspace/android-app/./gradlew clean'
  //sh '/var/lib/jenkins/workspace/android-app/./gradlew assembleDebug --info'
    sh '/bin/su -c "whoami && ./var/lib/jenkins/workspace/android-app/gradlew assembleDebug --stacktrace" - ec2-user'
}
