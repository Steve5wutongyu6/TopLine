plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.itheima.topline"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.itheima.topline"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        ndk {
            // 指定需要支持的 ABI 架构
            abiFilters.addAll(listOf("armeabi-v7a", "arm64-v8a", "x86", "x86_64"))
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
<<<<<<< HEAD
<<<<<<< HEAD
=======
    implementation(project(":bubbleviews"))
    implementation(project(":calendarview"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
>>>>>>> e5250ed2bdfb22365e6c91a7c86f4ce0482094b7
=======
>>>>>>> parent of c6ff706 (实验五)
    implementation(project(":PullToRefresh"))
    implementation(project(":boommenu"))
    implementation(project(":hellocharts-library"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.gson)
    implementation(libs.glide)
    implementation(libs.okhttp)
<<<<<<< HEAD
<<<<<<< HEAD
=======
    implementation(libs.design)
    implementation(files("libs/CCSDK.jar"))
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.core:core:1.10.1")
    implementation (libs.xdmap.location.search)
    implementation("de.hdodenhof:circleimageview:3.1.0")
>>>>>>> e5250ed2bdfb22365e6c91a7c86f4ce0482094b7
=======
>>>>>>> parent of c6ff706 (实验五)

}