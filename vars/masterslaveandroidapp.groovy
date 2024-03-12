def call() {
  //sh '/var/lib/jenkins/workspace/android-app/./gradlew clean'
  //sh '/var/lib/jenkins/workspace/android-app/./gradlew assembleDebug --info'
    sh 'chmod 777 -R /opt/build/workspace/master-slave-app-test/*'
    sh 'sudo -u ec2-user bash -c "whoami && cd /opt/build/workspace/master-slave-app-test && sudo ./gradlew assembleDebug"'
}
