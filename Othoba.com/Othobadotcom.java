package AutomationTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Othobadotcom extends BaseDrive {
    String url = "https://www.othoba.com/register";

    @Test
    public void name() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);

        WebElement phone = driver.findElement(By.id("Phone"));
        phone.sendKeys("01712301644");
        Thread.sleep(2000);

        WebElement gender = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
        gender.click();
        Thread.sleep(2000);

        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys("abc");
        Thread.sleep(2000);

        WebElement lastname = driver.findElement(By.id("LastName"));
        lastname.sendKeys("abc");
        Thread.sleep(2000);

        // Locate the day dropdown and select 17
        WebElement dayDropdownElement = driver.findElement(By.name("DateOfBirthDay"));
        Select dayDropdown = new Select(dayDropdownElement);
        dayDropdown.selectByVisibleText("17");

        // Locate the month dropdown and select April
        WebElement monthDropdownElement = driver.findElement(By.name("DateOfBirthMonth"));
        Select monthDropdown = new Select(monthDropdownElement);
        monthDropdown.selectByVisibleText("April");

        // Locate the year dropdown and select 2001
        WebElement yearDropdownElement = driver.findElement(By.name("DateOfBirthYear"));
        Select yearDropdown = new Select(yearDropdownElement);
        yearDropdown.selectByVisibleText("2001");
        
        WebElement pass = driver.findElement(By.id("Password"));
        pass.sendKeys("123456");
        Thread.sleep(2000);
        
        WebElement cpass = driver.findElement(By.id("ConfirmPassword"));
        cpass.sendKeys("123456");
        Thread.sleep(2000);
        
        WebElement submit = driver.findElement(By.id("register-button"));
        submit.click();
        Thread.sleep(2000);
        
        //OTP
        WebElement OTP = driver.findElement(By.id("ValidationOtp"));
        OTP.sendKeys("123456");
        Thread.sleep(2000);
        
        WebElement result = driver.findElement(By.name("register-continue"));
        result.click();
        Thread.sleep(2000);
        
        driver.quit();
    }
}
