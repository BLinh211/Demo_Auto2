package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ImplicitWaitExample {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));;
        try{driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        action.contextClick(element).perform();
        } catch (Exception e){
            System.out.println(" Khong tim thay phan tu" + e.getMessage());
        }finally {
            driver.quit();
        }
        }

}
