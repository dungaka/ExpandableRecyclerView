plugins {
    `kotlin-dsl`
}
repositories {
    jcenter()
}

dependencies {
    implementation(gradleApi())
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")
    implementation("com.google.code.gson:gson:2.8.7")
}
