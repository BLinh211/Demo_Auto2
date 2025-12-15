import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    static WebDriver driver =null;
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        Thread.sleep(3000);

        Actions action = new Actions(driver);
        WebElement button = driver.findElement(By.xpath("//button[@ondblclick = 'myFunction()']"));
        action.doubleClick(button).perform();

        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);

        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        driver.quit();
    }
}
