def call() {
  //sh '/var/lib/jenkins/workspace/android-app/./gradlew clean'
  //sh '/var/lib/jenkins/workspace/android-app/./gradlew assembleDebug --info'
    sh '/var/lib/jenkins/workspace/android-app/./gradlew assembleDebug --stacktrace'
}
