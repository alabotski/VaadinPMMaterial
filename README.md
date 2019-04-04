# VaadinPMMaterial

# Gradle
- compiling the whole project
  - run `./gradlew clean build` in parent project
- developing the application
  - edit code in the ui module
  - run `./gradlew appRun` in ui module
  - open http://localhost:8080/

# Maven 
- getting started
- compiling the whole project
  - run `mvn install` in parent project
- developing the application
  - edit code in the ui module
  - run `mvn jetty:run` in ui module
  - open http://localhost:8080/
- creating a production mode war
  - run `mvn package -Dvaadin.productionMode ` in the ui module or in the parent module
- running in production mode
  - run `mvn jetty:run -Dvaadin.productionMode` in ui module
  - open http://localhost:8080/
