# SimpleTags
## Create a variety of tags simply and easily

![](demo.png)

## Step 1. Add the JitPack repository to your build file

#### setting.gradle
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

## Step 2. Add the dependency

#### build.gradle
```
dependencies {
        implementation 'com.github.compose-museum:SimpleTags:1.0.0'
}
```
