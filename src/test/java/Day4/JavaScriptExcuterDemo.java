package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcuterDemo{
    static WebDriver driver =null;
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://saucelabs.com/request-demo");

        WebElement interestDropdown = driver.findElement(By.id("Solution_Interest__c"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("argument[0].value='Visual Testing';", interestDropdown);

        Thread.sleep(2000);

        String selectedValue = interestDropdown.getAttribute("value");
        System.out.println("Selected value from dropdownlist"+selectedValue);
}
}