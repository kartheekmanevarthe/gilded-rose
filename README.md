# gilded-rose

gilded-rose project is built using the framework Spring boot 3.2.10 which uses Java 17 and maven 3.9.8

The base logic for this requirement is taken from https://github.com/emilybache/GildedRose-Refactoring-Kata. I have 
modified the structure of the code and covered test cases. This code can be further refactored and improved to have more robust 
test cases.

# Instructions to launch the application and test :

* Run a command "mvn clean install" in the directory where we have pom.xml to build the jar file locally
* Navigate to GRApplication.java file in an IDE of your choice and run the main method inside this.
* The above step starts the spring boot server on you local machine with a host 8080 (default)
* Call a Post end-point http://localhost:8080/update from a Rest API client. I have used the Postman for example. 
  * you can pass a json payload taken from the location src/test/resources/input.json to see the expected result
  * post request will be processed with a 201 response code and the expected result will displayed on the console


