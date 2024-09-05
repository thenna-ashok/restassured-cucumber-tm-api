# RestAssured-Cucumber-API

## **Overview:**
API is the acronym for Application Programming Interface, which is a software intermediary that allows two applications to talk to each other.  This API framework is developed using REST Assured and Cucumber.  REST Assured is a Java library that provides a domain-specific language (DSL) for writing powerful, maintainable tests for RESTful APIs. Cucumber is an open source library, which supports behavior driven development. To be more precise, Cucumber can be defined as a testing framework, driven by plain English text. It serves as documentation, automated tests, and a development aid – all in one.


### **Some of the key features of this framework:**

1. It generates Extent report with all the step details. Report will be generated both HTML & PDF file format
2. Generates execution logs, with detailed request and response details
3. This also has an example to validate response body using json schema and java pojo classes
4. Test execution can be triggered from command line
5. Can be easily integrated to CI/CD pipeline

## **Required Setup :**

- [Java](https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-install-Java-21) should be installed and configured.
- [Maven](https://mkyong.com/maven/how-to-install-maven-in-windows/) should be installed and configured.
- Download the files from Git repository either as zip file OR using [Git](https://phoenixnap.com/kb/how-to-install-git-windows).

## **Running Test:**

Open the command prompt and navigate to the folder in which pom.xml file is present.
Run the below Maven command.

    mvn clean test


Once the execution completes report & log will be generated in below folder.

**Report:** 		*target/report*<br>
**Log:** 		*target/logs*