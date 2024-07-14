package AutomationTesting;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrangeHRM extends BaseDrive {

    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Test
    public void name() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(url);

        WebElement user = driver.findElement(By.name("username"));
        user.sendKeys("Admin");
        Thread.sleep(2000);

        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("admin123");
        Thread.sleep(2000);

        WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        login.click();
        Thread.sleep(2000);

        WebElement a = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
        a.click();
        Thread.sleep(2000);

        WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
        logout.click();
        Thread.sleep(2000);

//        WebElement realweb = driver.findElement(By.xpath());
//        realweb.click();
//        Thread.sleep(2000);

        // Social icons' XPaths
        String[] socialIconsXPaths = {
        		"//a[normalize-space()='OrangeHRM, Inc']",
            "//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']"
//            "//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']//*[name()='g' and contains(@fill,'currentCol')]//*[name()='path' and contains(@class,'st0')]",
//            "//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']//*[name()='g' and contains(@fill,'currentCol')]//*[name()='path' and contains(@class,'st0')]",
//            "//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']//*[name()='g' and contains(@fill,'currentCol')]//*[name()='path' and contains(@class,'st0')]"
        };

        for (String iconXPath : socialIconsXPaths) {
            // Locate and click on the social icon
            WebElement socialIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(iconXPath)));
            socialIcon.click();
            Thread.sleep(2000);

            // Get the list of tabs
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

            // Switch to the new tab
            driver.switchTo().window(tabs.get(1));

            // Print the title of the new tab (optional)
            System.out.println("New tab title: " + driver.getTitle());

            // Close the new tab
            driver.close();

            // Switch back to the original tab
            driver.switchTo().window(tabs.get(0));
        }

        // Verify we are back on the main page after all operations
        System.out.println("Main page title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
