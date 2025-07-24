# Automated Functional Testing for DailyFinance Website

## Project Description

This project demonstrates Selenium WebDriver automation with TestNG for automating various user and admin functionalities on the website [DailyFinance](https://dailyfinance.roadtocareer.net/). The goal is to simulate user registration, password reset, item addition, profile update, and admin functionalities, ensuring all processes work as expected.

### Key Functionalities Automated:
1. **User Registration and Email Verification**
2. **Password Reset with Valid and Invalid Scenarios**
3. **Login with New Password**
4. **Item Addition (Mandatory vs. All Fields)**
5. **User Profile Update**
6. **Admin Login and Search Functionality**
7. **CSV-based User Registration**
8. **Admin Export of User Data**

## Prerequisites

- **Java**
- **TestNG**
- **Maven**
- **Selenium WebDriver**
- **Allure Reports**
- **Gmail**
- **CSV File**


## Project Setup

## 1. Clone this repository:
```
   git clone 
   cd Dailyfinance
 ```
## 2. Gradle Dependencies
Ensure you have Gradle installed. The necessary dependencies will be downloaded when you run the project. If Gradle is not installed, follow the [Gradle Installation Guide](https://gradle.org/install/).

## 3. IDE Setup
Import this project into your preferred IDE (Eclipse, IntelliJ IDEA, etc.) or run from the terminal.

## 4. Allure Reporting

### Install Allure Command Line
Install Allure by following the [Allure Installation Guide](https://docs.qameta.io/allure/).

Run the Allure report after executing tests.

## 5. Running the Tests
```bash
gradle clean test
```
## 6.Allure Report
After running the tests, generate an Allure report:

```bash
allure serve build/allure-results
```
## Demo Vide0 :

## Test Cases :


