package Exercise3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UnHappyCase {
    static WebDriver driver = null;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucelabs.com/request-demo");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String pageTitle1 = driver.getTitle();

        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("Email")));
        emailField.sendKeys("John@yourcompany.com");

        WebElement inputFirstName = wait.until(ExpectedConditions.elementToBeClickable(By.id("FirstName")));
        inputFirstName.sendKeys("John");

        WebElement inputLastName = wait.until(ExpectedConditions.elementToBeClickable(By.id("LastName")));
        inputLastName.sendKeys("Wick");

        WebElement inputPhoneNumber = wait.until(ExpectedConditions.elementToBeClickable(By.id("Phone")));
        inputPhoneNumber.sendKeys("+91123456789");

        WebElement companyName = wait.until(ExpectedConditions.elementToBeClickable(By.id("Company")));
        companyName.sendKeys("JSC Company");

        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("LblmktoCheckbox_47208_0")));
        checkbox.click();

        Select select2 = new Select(driver.findElement(By.id("Country")));
        select2.selectByValue("Afghanistan");

        driver.findElement(By.xpath("//span[@class='mktoButtonWrap mktoSimple']")).click();

        try {
            wait.until(ExpectedConditions.or(
                    ExpectedConditions.urlContains("thank"),
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[contains(text(),'Thank')]")
                    )
            ));

            System.out.println("\tHappy Case PASSED – Form submitted successfully!");

        } catch (Exception e) {
            System.out.println("\tHappy Case FAILED – Submit not successful");

            // Chờ message lỗi hiển thị
            WebElement errorMsg = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.id("ValidMsgSolution_Interest__c")
                    )
            );

            System.out.println("\tError message: " + errorMsg.getText());
        }

    }
}
