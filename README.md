# Elevate Program
 
 **Overview**

This is a Selenium-based test automation project that utilizes TestNG for running automated tests on web applications. The project includes various test scripts for handling different web automation scenarios such as form handling, alerts, multiple windows, file upload/download, and more.

Project Structure
```
Directory structure:
└── luhder-elevate_program/
    ├── README.md
    ├── pom.xml
    ├── testng.xml
    ├── src/
    │   └── test/
    │       └── java/
    │           ├── ActionsSelenium.java
    │           ├── Alert.java
    │           ├── AumationDemoSiteForm.java
    │           ├── BrokenURL.java
    │           ├── DataDriven.java
    │           ├── OrangeHRM.java
    │           ├── crossBrowser.java
    │           ├── demoWebShop.java
    │           ├── fileUploadDownload.java
    │           ├── formHandling.java
    │           ├── login.java
    │           └── multipleWindow.java
    └── test-output/
        ├── emailable-report.html
        ├── index.html
        ├── testng-failed.xml
        ├── testng-reports.css
        ├── testng-reports.js
        ├── testng-reports1.css
        ├── testng-reports2.js
        ├── testng-results.xml
        ├── testng.css
        ├── Default suite/
        │   ├── Default test.html
        │   ├── Default test.xml
        │   └── testng-failed.xml
        ├── junitreports/
        │   ├── TEST-ActionsSelenium.xml
        │   ├── TEST-endtoend.xml
        │   ├── TEST-fileUploadDownload.xml
        │   ├── TEST-login.xml
        │   └── TEST-search.xml
        └── old/
            ├── index.html
            └── Default suite/
                ├── Default test.properties
                ├── classes.html
                ├── groups.html
                ├── index.html
                ├── main.html
                ├── methods-alphabetical.html
                ├── methods-not-run.html
                ├── methods.html
                ├── reporter-output.html
                ├── testng.xml.html
                └── toc.html

```
**Prerequisites**


Before running the tests, ensure you have the following installed:

Java (JDK 8 or higher)

Maven

TestNG

Selenium WebDriver

A supported web browser (Chrome, Firefox, Edge, etc.)

**Installation**

Clone the repository:

git clone https://github.com/your-repo/luhder-elevate_program.git

Navigate to the project directory:

cd luhder-elevate_program

Install dependencies using Maven: 

mvn clean install

Running Tests

Running all tests

Execute all TestNG test cases using the following command:

mvn test

Running specific test suites

You can execute a specific test suite by using:

mvn test -DsuiteXmlFile=testng.xml

Test Reports

After execution, the test reports will be generated in the test-output/ directory. You can open test-output/index.html in a browser to view the detailed test report.
