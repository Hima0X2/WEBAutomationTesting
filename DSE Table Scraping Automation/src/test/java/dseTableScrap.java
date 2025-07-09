import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class dseTableScrap {
    WebDriver driver;
    @BeforeAll
    public void setup(){
        driver= new ChromeDriver();
        driver.get("https://dsebd.org/latest_share_price_scroll_by_value.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @Test
    @DisplayName("Scrap all data")
    public void scapTableText() throws IOException {
        FileWriter writer = new FileWriter("./src/test/resources/data.txt");
        WebElement table =  driver.findElement(By.className("floatThead-wrapper"));
        List <WebElement> allRow
                = table.findElements(By.tagName("tr"));
        for(WebElement row : allRow){
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for(WebElement cellValue : cells){
                System.out.print(cellValue.getText() + "  ");
                writer.write(cellValue.getText() + "  ");
            }
            System.out.println();
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    }

    @AfterAll
    public void closeDriver(){
        driver.quit();
    }
}
