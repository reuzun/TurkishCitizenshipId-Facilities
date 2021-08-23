# TurkishCitizenshipId-Facilities

This is a library that does some jobs about Turkish id. What it can do it listed as below:
- Can validate given Id.
- Can create a random validated Id.
- Can list possible Id's due to unknown digits.
## Requirements
- Maven
- JDK
## How to install (Locally)
- Download the project via github.
- Go to parent directory and open cmd/terminal write ```mvn clean package```
- After that one the target directory will be created. Use below command to install it in a way that maven can use it.(Dont forget to edit below command due to file locations in your computer.)
``` 
mvn install:install-file -Dfile=<LOCATION_TO_YOUR_JAR> -DgroupId=org.example -DartifactId=TurkishCitizenshipId -Dversion=1.0 -Dpackaging=jar -Dsources=<LOCATION_TO_...-SOURCES.JAR FILE>
```
- After above process is completed succesfully. You can add it to any maven project like below. (In your local computer.)
```
<dependency>  
 <groupId>org.example</groupId>  
 <artifactId>TurkishCitizenshipId</artifactId>  
 <version>1.0</version>  
</dependency>
```
## How to use
- To validate:
```
TurkishCitizenshipId validator = new TurkishCitizenshipIdBuilder()  
        .build(BUILDER_TYPE.VALIDATOR);
validator.validate("11111111111");
```
- To create random validated Id:
```
TurkishCitizenshipId creator = new TurkishCitizenshipIdBuilder()  
        .build(BUILDER_TYPE.CREATOR);
String randomId = creator .create();
```
- To find all possible Id's:
```
TurkishCitizenshipId finder = new TurkishCitizenshipIdBuilder()  
        .build(BUILDER_TYPE.FINDER);
List<String> possibleIds = finder.listAvailableIds("111---1--11"); // - means unknown value.
```
## License
Licensed under [GPL-3.0 License](LICENSE).
