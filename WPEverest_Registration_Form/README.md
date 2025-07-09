## WPEverest_Registration_Form

This project automates the **WP Everest Guest Registration Form** using **Selenium WebDriver** and **JUnit** in **Java**. The script fills out form fields with valid data, submits the form, and verifies a successful submission using assertions.

---
## 🌐 Target Website
https://demo.wpeverest.com/user-registration/guest-registration-form/

## ✅ Automated Form Fields

The automation script interacts with the following fields:

- 📝 First Name  
- 📝 Last Name  
- 📧 User Email  
- ⚥ Gender (Radio Button)  
- 🎂 Date of Birth (Date Picker)  
- 🌍 Nationality (Text Input)  
- 📞 Phone Number  
- 🗺️ Country (Dropdown - selected Bangladesh)  
- ☑️ Terms & Conditions (Checkbox)  
- 🚀 Submit Button  


## 📷 Test Report Screenshot

![image](https://github.com/user-attachments/assets/0e7aa96d-5b34-486b-a727-b3e7767fc843)

---

## 🎥 Demo Video

https://github.com/user-attachments/assets/61c3b05e-0124-4cf2-baff-0d9387595751

---

## 📁 Project Structure

```
wpeverest-registration/
│
├── src/
│   └── test/
│       └── java/
│           └── wpeverestRegistration.java
├── .gitignore
├── README.md
└── build.gradle
```

---

## ⚙️ Technologies Used

- Java  
- JUnit  
- Selenium WebDriver  
- IntelliJ IDEA  
- Chrome WebDriver  
- Git & GitHub  

---

## ▶️ How to Run the Test

### 1. Clone or Download the Project

```bash
git clone https://github.com/Hima0X2/WEBAutomationTesting.git
cd WEBAutomationTesting/WPEverest_Registration_Form
```

### 2. Open the Project

- Open the folder in **IntelliJ IDEA** or your preferred Java IDE.
- Make sure it detects it as a **Gradle project**.

### 3. Install Dependencies

- Ensure you have the following in your `build.gradle` file under `dependencies`:

```
dependencies {
    testImplementation platform('org.junit:junit-bom:5.10.0')
    testImplementation 'org.junit.jupiter:junit-jupiter'
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:4.34.0")

}
```

- Sync Gradle to download the dependencies.

### 4. Run the Automation Script

From IntelliJ:

- Navigate to `wpeverestRegistration.java` in `src/test/java`.
- Right-click the file and select **Run**.

*(Make sure the test task is configured to run your test class.)*

### 5. Watch the Automation

- A Chrome browser window will open and fill in the WP Everest Guest Registration form.
- A **screenshot** and a **video** will be given in ths README.md file.

---

## 👩‍💻 Author

**Samanta**  
