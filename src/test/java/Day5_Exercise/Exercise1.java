package Day5_Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ExcelUtils;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Exercise1 {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucelabs.com/request-demo");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //  Doc data
        List<Map<String, String>> data =
                ExcelUtils.readExcel("src/test/resources/testdata.xlsx", "BookDemo");

        for (Map<String, String> row : data) {

            //Email
            WebElement email = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("Email"))
            );
            email.sendKeys(row.get("Business Email"));

            //FirstName
            WebElement firstName = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("FirstName"))
            );
            firstName.sendKeys(row.get("First Name"));

            driver.findElement(By.id("LastName"))
                    .sendKeys(row.get("Last Name"));

            driver.findElement(By.id("Phone"))
                    .sendKeys(row.get("Phone"));

            driver.findElement(By.id("Company"))
                    .sendKeys(row.get("Company"));

            //Dropdown Interest
            Select interestSelect = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.id("Solution_Interest__c"))));
            interestSelect.selectByVisibleText(row.get("Interest"));

            //Checkbox Agree
            if (row.get("Agree").equalsIgnoreCase("true")) {
                WebElement checkbox = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.id("LblmktoCheckbox_47208_0"))
                );
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }
            }

            //Dropdown Country
            Select countrySelect = new Select(
                    wait.until(ExpectedConditions.elementToBeClickable(
                            By.id("Country")))
            );
            countrySelect.selectByVisibleText(row.get("Country"));

            //Submit
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(@class,'mktoButton')]")
            )).click();
        }

    }
}
