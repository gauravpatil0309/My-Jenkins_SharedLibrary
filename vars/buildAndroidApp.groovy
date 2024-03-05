def call() {
  sh 'cd /var/lib/jenkins/workspace/android-app && \ ./gradlew clean'
  sh 'cd /var/lib/jenkins/workspace/android-app && \ ./gradlew assembleDebug'
}
