def call() {
    def gradleInstallationDir = "/usr/local/gradle"
    def javaInstallationDir = "/usr/local/java"

    // Check if Gradle is already installed
    def gradleInstalled = fileExists(gradleInstallationDir)

    // Check if Java 11 is already installed
    def javaInstalled = sh(returnStdout: true, script: "java -version 2>&1 | grep '11'") == 0

    if (!gradleInstalled) {
        // Install Gradle
        sh "wget https://services.gradle.org/distributions/gradle-7.6.4-bin.zip -P ${gradleInstallationDir}"
        sh "unzip ${gradleInstallationDir}/gradle-7.6.4-bin.zip -d ${gradleInstallationDir}"
        sh "ln -s ${gradleInstallationDir}/gradle-7.6.4 ${gradleInstallationDir}/gradle-7.6.4"
        sh "export PATH=${gradleInstallationDir}/gradle-7.6.4/bin:$PATH"
    }

    if (!javaInstalled) {
        // Install Java 11
        //sh "yum install -y java-11-openjdk-devel"
          sh "sudo amazon-linux-extras install java-openjdk11 -y"
    }
}

