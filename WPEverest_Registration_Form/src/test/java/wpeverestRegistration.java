import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class wpeverestRegistration {
    WebDriver driver;
    @BeforeAll
    public void setup(){
        driver= new ChromeDriver();
        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @Test
    public void registration() throws InterruptedException {
        List<WebElement> radiobtn= driver.findElements(By.cssSelector("[type=radio]"));
        driver.findElement(By.id("first_name")).sendKeys("Sanjida");
        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).sendKeys("Samanta");
        Thread.sleep(2000);
        driver.findElement(By.name("user_email")).sendKeys("ajshdhfgtv12@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("!@#SGG123");
        Thread.sleep(2000);
        WebElement gender = radiobtn.get(1);
        gender.click();
        Thread.sleep(2000);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.id("input_box_1665629217")).sendKeys("Bangladeshi");
        List<WebElement> date= driver.findElements(By.cssSelector("[data-id=date_box_1665628538]"));
        date.get(0).click();

        List<WebElement> year= driver.findElements(By.className("numInput"));
        year.get(0).sendKeys(Keys.CONTROL+"a");
        year.get(0).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        year.get(0).sendKeys("2001");
        year.get(0).sendKeys(Keys.ENTER);
        List<WebElement> month = driver.findElements(By.cssSelector("[aria-label=Month]"));
        Select monthD = new Select(month.get(0));
        monthD.selectByValue("10");
        Thread.sleep(1000);
        WebElement day = driver.findElement(By.cssSelector("span[aria-label='November 2, 2001']"));
        day.click();
        Thread.sleep(2000);
        List<WebElement> phone = driver.findElements(By.id("phone_1665627880"));
        phone.get(1).sendKeys("9999999999");
        Thread.sleep(2000);
        List<WebElement> emrgencyphone = driver.findElements(By.id("phone_1665627865"));
        emrgencyphone.get(1).sendKeys("9999999999");
        Thread.sleep(2000);
        List<WebElement> dropdown = driver.findElements(By.tagName("select"));
        WebElement country = driver.findElement(By.id("country_1665629257"));

        Select countryD = new Select(country);
        countryD.selectByValue("BD");
        Thread.sleep(2000);

        driver.findElements(By.cssSelector("[data-id=date_box_1665629845]")).get(0).click();
        year.get(1).sendKeys(Keys.CONTROL+"a");
        year.get(1).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        year.get(1).sendKeys("2025");
        year.get(1).sendKeys(Keys.ENTER);
        Select monthofarrival = new Select(month.get(1));
        monthofarrival.selectByValue("7");
        Thread.sleep(1000);
        WebElement dayofarrival = driver.findElement(By.cssSelector("span[aria-label='August 14, 2025']"));
        dayofarrival.click();
        Thread.sleep(2000);

        driver.findElement(By.id("number_box_1665629930")).sendKeys("2");
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.name("input_box_1665630010")).sendKeys("3");
        Thread.sleep(2000);
        driver.findElement(By.name("textarea_1665630078")).sendKeys("Occupation: Student");

        Thread.sleep(2000);
        WebElement parking = radiobtn.get(3);
        parking.click();
        Thread.sleep(2000);
        WebElement room = radiobtn.get(5);
        room.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,700)");

        WebElement dietary_restriction  = radiobtn.get(8);
        dietary_restriction.click();
        Thread.sleep(2000);

        WebElement activities = driver.findElement(By.id("select_1665628361"));
        Select activitiesD = new Select(activities);
        activitiesD.selectByValue("Town Hall");
        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.cssSelector("[type=checkbox]")).click();
        Thread.sleep(2000);
        List<WebElement> submit= driver.findElements(By.cssSelector("[type=submit]"));
        submit.get(2).click();
        Thread.sleep(3000);
        List<WebElement> txt= driver.findElements(By.cssSelector("ul"));
        String actual = txt.get(9).getText();
        System.out.println(actual);
        Assertions.assertEquals("User successfully registered.", actual);
    }
    @AfterAll
    public void closeDriver(){
        driver.quit();
    }
}
