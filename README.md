This project is a hybrid test automation framework built using Selenium with Java for frontend testing and RestAssured with Postman collection support for backend API testing.

UI Automation: Uses Selenium WebDriver, TestNG, and Page Object Model (POM) to validate UI elements, navigation, and workflows on analyticsvidhya.com/datahack/ website.

API Automation: Uses RestAssured to validate API responses, status codes, headers, and payloads.

Build & Execution: Managed with Maven, supports execution via command line or IDE.

Reports: Generates TestNG default reports, with options to integrate Extent/Allure reports.

Structure: Clearly separated into base/, pages/, ui/, and api/ packages for better maintainability.

Scalability: Supports regression, sanity, and integration with CI/CD (Jenkins, GitHub Actions).

Setup Instructions
1️)Clone Repository
git clone https://github.com/Riya-git11/SDET.git
cd SDET

2️)Install Java & Maven

Make sure Java (11/17) and Maven are installed:

java -version
mvn -version

3️)Install Dependencies

Run:

mvn clean install

This will download Selenium, RestAssured, TestNG, and other dependencies.

Running Tests
Run UI Tests (Selenium)
mvn test -Dtest=ui.DataHackUITests

Run API Tests (RestAssured)
mvn test -Dtest=api.DataHackAPITests

Run All Tests
mvn test

Reports

TestNG Reports: Found under target/surefire-reports/

Extent / Allure Reports: Can be integrated for advanced reporting

Sample Tests
UI (Selenium)

Verify DataHack page title

Verify Hero section text

Verify “Test Now” button navigation

API

Validate Login API returns 200 and token

Setup & Execution Points

Clone Project

git clone <repo-url>
cd automation-framework


Install Prerequisites

Java 11 or 17

Maven 3.x+

IDE (IntelliJ / Eclipse)

Install Dependencies

mvn clean install


Run UI Tests (Selenium)

mvn test -Dtest=ui.DataHackUITests


Run API Tests (RestAssured)

mvn test -Dtest=api.DataHackAPITests

Run All Tests

mvn test
Reports

TestNG Reports → target/surefire-reports/

Extent/Allure Reports (if configured)

Project Structure

base/ → WebDriver setup

pages/ → Page Objects

ui/ → Selenium Tests

api/ → API Tests (RestAssured)

Configurable Settings

Browser setup → BaseTest.java

API Base URL → DataHackAPITests.java

Future Enhancements

CI/CD (Jenkins, GitHub Actions)

Parallel Execution (TestNG XML)

Selenium Grid / Docker
