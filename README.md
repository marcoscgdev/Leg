# Leg
Say goodbye to log tags!

---

## Releases:

#### Current release: 1.0.0.

You can see all the library releases [here](https://github.com/marcoscgdev/Leg/releases).

---

## Usage:

### Adding the depencency

Add this to your root *build.gradle* file:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Now add the dependency to your app build.gradle file:

```
implementation 'com.github.marcoscgdev:Leg:1.0.0'
```

### Start logging

```java
Leg.e("Do not worry, this is not an error.");

testFunction();

Leg.d("Say goodbye to log tags!")
```

```java
private void testFunction() {
    Leg.d("Say goodbye to log tags!");
}
```

Output:

<img src="https://raw.githubusercontent.com/marcoscgdev/Leg/master/screenshot.png" width="350">
