Overview
This is a Selenium-based automation testing framework developed using Java, TestNG, and Maven. It follows the Page Object Model (POM) design pattern to ensure clean separation between test code and page-specific code, making the framework scalable and easy to maintain.

Features
Java + Selenium WebDriver
TestNG for test execution and reporting
Maven for project build and dependency management
Page Object Model (POM) design pattern
ExtentReports integration for HTML reporting
Log4j for logging
Automatic screenshot capture on test failures
Project Structure
├── src │ └── test │ ├── java │ │ ├── base │ │ ├── pages │ │ ├── tests │ │ └── utils │ └── resources ├── test-output ├── pom.xml └── README.md

Prerequisites
Java 11 or higher
Maven 3.x
ChromeDriver / GeckoDriver
IDE (Eclipse, IntelliJ IDEA, etc.)
