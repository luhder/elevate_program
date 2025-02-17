﻿# Elevate Program
 
 **Overview**

This is a Selenium-based test automation project that utilizes TestNG for running automated tests on web applications. The project includes various test scripts for handling different web automation scenarios such as form handling, alerts, multiple windows, file upload/download, and more.

Project Structure
```
├── README.md             # Project documentation
├── pom.xml               # Maven project configuration
├── testng.xml            # TestNG suite configuration
├── doc/                  # Generated documentation for tests
├── src/                  # Source code for test cases
│   └── test/
│       └── java/         # Java test scripts
├── test-output/          # Test reports and logs
└── resources/            # Additional resources (if applicable)
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
