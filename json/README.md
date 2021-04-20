## Required Libraries

This example doesn't include the required libraries. They can be downloaded at the links below.

* [jackson-annotations](https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.12.3/jackson-annotations-2.12.3.jar)
* [jackson-core](https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.12.3/jackson-core-2.12.3.jar)
* [jackson-databind](https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.12.3/jackson-databind-2.12.3.jar)

Place the JAR files in this directory.

Alternatively, this code could be copied into a Gradle project. In that case, integrate the following into the `build.gradle` file. 

```groovy
// Required to match Jackson versions in Spring
ext['jackson.version'] = '2.12.2'

dependencies {
    // other sections omitted
    
    implementation 'com.fasterxml.jackson.core:jackson-databind:2.12.2'
}
```

## Compiling and Running

The following commands can be used to compile and run this project:

```bash
javac -cp jackson-core-2.12.3.jar:jackson-databind-2.12.3.jar:./ *.java
```

```bash
java -cp jackson-core-2.12.3.jar:jackson-databind-2.12.3.jar:jackson-annotations-2.12.3.jar:./ SaveJson
java -cp jackson-core-2.12.3.jar:jackson-databind-2.12.3.jar:jackson-annotations-2.12.3.jar:./ LoadJson
```