package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        action.contextClick(element).perform();

        WebElement option = driver.findElement(By.xpath("//span[text()='Copy']"));
        option.click();


        String alertText = driver.switchTo().alert().getText();
        System.out.println("Alert text after right click is: " + alertText);

        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        driver.quit();

    }
}
