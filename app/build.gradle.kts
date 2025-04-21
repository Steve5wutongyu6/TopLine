plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.itheima.topline"
    compileSdk = 34
    useLibrary("org.apache.http.legacy")

    defaultConfig {
        applicationId = "com.itheima.topline"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    android {
        sourceSets {
            named("main") {
                jniLibs.srcDirs("libs")
            }
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
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(project(":PullToRefresh"))
    implementation(project(":boommenu"))
    implementation(project(":hellocharts-library"))
    implementation(libs.gson)
    implementation(libs.glide)
    implementation(libs.okhttp)
    implementation(libs.design)
    implementation(files("libs\\CCSDK.jar"))
    implementation("com.google.android.material:material:1.12.0")
    implementation("org.apache.httpcomponents:httpclient-android:4.3.5.1")
}