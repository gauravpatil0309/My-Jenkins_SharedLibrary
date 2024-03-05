def call() {
  //sh '/var/lib/jenkins/workspace/android-app/./gradlew clean'
  //sh '/var/lib/jenkins/workspace/android-app/./gradlew assembleDebug --info'
    sh 'sudo su ec2-user && \ 
        cd /var/lib/jenkins/workspace/android-app && \ 
        ./gradlew assembleDebug --stacktrace'
}
