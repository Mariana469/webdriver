import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver;
            System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();

        driver.get("http://seleniumhg.org");
        Thread.sleep(2000);
        driver.quit();
    }
}
