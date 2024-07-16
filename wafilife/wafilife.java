package AutomationTesting;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class wafilife extends BaseDrive{
String url="https://www.wafilife.com/";
@Test
public void name() throws InterruptedException {
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get(url);

    WebElement account = driver.findElement(By.xpath("//a[@title='আমার অ্যাকাউন্ট'][contains(text(),'লগইন / রেজিস্টার')]"));
    account.click();
    Thread.sleep(2000);
    
    WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
    user.sendKeys("samayrajahan02@gmail.com");
    Thread.sleep(2000);

    WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
    pass.sendKeys("samanta");
    Thread.sleep(2000);

    WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
    login.click();
    Thread.sleep(2000);
    
    WebElement lekhok = driver.findElement(By.xpath("//span[contains(text(),'লেখক')]"));
    lekhok.click();
    Thread.sleep(2000);
    
    WebElement author = driver.findElement(By.xpath("//h3[normalize-space()='Dr. Abul Hossain']"));
    author.click();
    Thread.sleep(2000);
    
    WebElement bookname = driver.findElement(By.xpath("//a[contains(text(),'Hidden Economy of Bangladesh and Its Policy Implic')]"));
    bookname.click();
    Thread.sleep(2000);
    
    WebElement cart = driver.findElement(By.xpath("//div[@class='body-wrapper']//button[2]"));
    cart.click();
    Thread.sleep(2000);
    
    WebElement order = driver.findElement(By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]"));
    order.click();
    Thread.sleep(2000);
    // Close the browser
    driver.quit();
}
}
