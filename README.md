# Potemkin Faking Library

🏢🏠🏠⛪🏠🏢🏦🏠🏠🏠🏦⛪🏠🏠🏠

[![Build Status](https://travis-ci.org/folkengine/potemkin.svg?branch=master)](https://travis-ci.org/folkengine/potemkin)

Named after [Prince Grigory Aleksandrovich Potemkin-Tavricheski](https://en.wikipedia.org/wiki/Grigory_Potemkin)'s [villages](https://en.wikipedia.org/wiki/Potemkin_village).

Currently the Library is made up of the following components:

* Haist - An auto-serializable Hashed List. This is a port of my [Harshed Ruby library](https://github.com/folkengine/harshed).

## Dependencies

* [Jackson](http://wiki.fasterxml.com/JacksonHome)
* [Dagger2](https://google.github.io/dagger/)
* [Apache Ignite's HDFS](https://ignite.apache.org/use-cases/hadoop/hdfs-cache) (Optional)

## Test Dependencies

This project has the following test dependencies:

* [JUnit5](http://junit.org/junit5/)
* [Immutables](https://immutables.github.io/)
* [Java Faker](https://github.com/DiUS/java-faker)

## IntellliJ Idea Setup

This project uses Immutables in order to generate test example code. In order for it to compile correctly inside IntelliJ Idea 
you will need to enable annotation processing. Be sure to set the "Store generated sources relative to" flag to "Module Content Root".
 
![Annotation Processors Setting](docs/img/idea-immutables-config.png)

## Reading

* [GSON vs Jackson](http://programmerbruce.blogspot.com/2011/06/gson-v-jackson.html)

