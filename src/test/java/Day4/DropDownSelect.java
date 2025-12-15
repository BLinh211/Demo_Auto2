package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {
    static WebDriver driver = null;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucelabs.com/request-demo");

        Select select = new Select(driver.findElement(By.id("Solution_Interest__c")));
//        select.selectByValue("1");
//        select.selectByValue("Scalable Test Automation");
        select.selectByVisibleText("Scalable Test Automation ");
    }
}
