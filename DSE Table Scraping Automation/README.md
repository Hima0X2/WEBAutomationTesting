# 📊 DSE Table Data Scraping Automation

This project automates the process of scraping **latest share price data** from the Dhaka Stock Exchange (DSE) using **Java Selenium WebDriver**. The script prints all table cell values from the DSE page and saves them into a text file.

---

## 🌐 Target Website

🔗 [DSE Latest Share Prices (Scroll by Value)](https://dsebd.org/latest_share_price_scroll_by_value.php)

---

## 🛠️ Automation Steps

1. ✅ Open the DSE page in a browser.
2. ✅ Extract all table cell (`<td>`) values.
3. ✅ Print all the cell values in the console.
4. ✅ Save all the cell values into a text file (`output.txt`).

---


---

## ⚙️ Technologies Used

- ☕ Java  
- 🌐 Selenium WebDriver  
- 🧪 JUnit  
- 💻 IntelliJ IDEA  
- 🌍 Chrome WebDriver  
- 🔗 Jsoup (optional for parsing)  
- 📂 Git & GitHub  

---

## ▶️ How to Run the Test

### 1. Clone the Repository

```
git clone https://github.com/YOUR_USERNAME/DSE_Scraper_Automation.git
cd DSE_Scraper_Automation
```
### 2. Open in IntelliJ IDEA
Open the project in IntelliJ IDEA

Ensure it’s recognized as a Gradle project

### 3. Install Dependencies
Add the following to your build.gradle file:
```
dependencies {
    implementation 'org.seleniumhq.selenium:selenium-java:4.34.0'
    testImplementation 'org.junit.jupiter:junit-jupiter:5.10.0'
}
```
### 4. Run the Script
Navigate to:
```
src/test/java/DSEDataScraper.java
```

Right-click the file and select Run.

A browser window will open, scrape the table, and store data in output.txt.

## 📷 Test Report Screenshot


## 🎥 Demo Video


## 👩‍💻 Author

**Samanta**  

