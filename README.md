# Calculator REST API

The goal is to implement some Calculator REST API.


## 1.1	Environment
- Java 		8
- Maven 	3
- Npm (raml2Html@latest)
- IDE like Eclipse/IntelliJ
- Tomcat 8.0.36

## 1.2 Dependencies

The calculator application is composed by 2 modules:
- calculator-core (it defines core services)
- calculator-webapp (it defines REST API)

Main dependencies for JAVA are:
- Spring Boot
- Spring Web MVC
- Bean Validation
- Jackson 2
- jUnit


## 1.3 Configuration

After repository clone, move to root folder of project /calculator

**mvn clean install**

**mvn clean package -Pdev**

deploy .war in Tomcat/Jetty and start container.


## 1.4 API

Once started the container, navigate through

- http://localhost:8080/calculator-webapp/statics/standard.html
- http://localhost:8080/calculator-webapp/statics/scientific.html

to read REST API documentation.


## 1.5 Documentation maintenance

It's possible generate again the API documentation executing 

**mvn package -Praml2html -DskipTests**

The RAML 1.0 definition is in calculator-webapp/src/main/raml/

It's requested to have npm installed and raml2html module in local machine

https://www.npmjs.com/package/raml2html


## 1.6 Test

You can import and run **postman** project located in calculator-webapp/src/main/postman/
in order to test REST API.
