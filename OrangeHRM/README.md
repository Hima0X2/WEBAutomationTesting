# OrangeHRM

This project demonstrates automation testing of the OrangeHRM login functionality using Selenium WebDriver and TestNG. The automation script logs into the OrangeHRM demo site, navigates through the application, clicks on social media icons, handles new tabs, and returns to the original tab.

## Features



## Technologies Used

- Selenium Webdriver
- TestNG
- Java
- Maven

## Prerequisites

Before running the application, make sure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Maven
- Chrome Browser
- ChromeDriver (WebDriverManager will handle this)

## Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/Hima0X2/OrangeHRM.git
    ```
    
2. **Update WebDriver:**
   This project uses WebDriverManager to automatically manage the WebDriver binaries.
   
3. **Update pom.xml:**
    - Ensure the following dependencies are included in your pom.xml:

    ```<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.10.0</version>
    </dependency>
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.4.1</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.7.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
    ```
    
5. **Run the application:**

   1. Using Maven
      Run the following command to execute the test:
       ```
        mvn test
        ```
   2. Using an IDE
    - Import the project into your IDE (e.g., IntelliJ IDEA, Eclipse).
    - Navigate to the OrangeHRM.java file.
    - Right-click and select Run.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please create an issue or submit a pull request.
