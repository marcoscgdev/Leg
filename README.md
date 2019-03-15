# Leg
Say goodbye to log tags!


## Releases:

#### Current release: 1.0.0.

You can see all the library releases [here](https://github.com/marcoscgdev/Leg/releases).


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

Leg.i("extra info here", "You can add extra info too.")
```

```java
private void testFunction() {
    Leg.d("Say goodbye to log tags!");
}
```

Output:

<img src="https://raw.githubusercontent.com/marcoscgdev/Leg/master/screenshot.png">


## License

```
Copyright 2019 Marcos Calvo García

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
