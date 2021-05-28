import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverAPIBasics {
    public static void main(String[] args) throws InterruptedException {
             ChromeDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://seleniumhg.org");
        
        driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='slave-1-1']"));
        WebElement searchInput = driver.findElement(By.xpath("//input[@title='Enter a search']"));
        searchInput.sendKeys("selenium java");

        WebElement searchBtn;
        driver.findElement(By.className("sbb")).click();

        WebElement sale_banner_orange = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.className("sale_banner_orange")));
        driver.findElement(By.className("sale_banner_orange")).click();
        Thread.sleep(2000);
        driver.quit();
    };

}
