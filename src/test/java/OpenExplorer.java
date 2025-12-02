import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenExplorer {
    static WebDriver driver = null;
    public static void main(String[]args)throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://serenity-bdd.github.io/");
        Thread.sleep(1000);
        driver.quit();
    }
}
