# scalajs-spring-marriage
A simple setup showing (a dirty) way of marring scala & scala js to a java spring (boot) application using maven for the build.

## Building
`mvn package`

## Running
`mvn package spring-boot:run`
The package action here is required so the javascript is regenerated. 
Running using the spring boot main methode is also possible but then you're missing the javascript regeneration as well.
