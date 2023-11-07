# Building

## Building the Java jar
### Prerequisites
* Java
* Maven
* Python3

### Steps
```shell
./build --jar --fast
```

## Building the Java Client
### Prerequisites
* nodejs
* node global isntall of `uglify-js`

### Steps
```shell
./build --client
```

## Documentation (local)
### Prerequisites
* mdbook

### Steps
```shell
cd reference
./local.sh
```

## Build and Run Tests
### Prerequisites
* Everything to above to build the jar
* MySQL
* An AWS account with access to S3

### Steps
```shell
./build --jar
```
