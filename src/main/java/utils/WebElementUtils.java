package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUtils {

    WebDriver driver;

    public WebElementUtils(WebDriver driver) {
        this.driver = driver;
    }

    // Trả về By theo locatorType
    public By getBy(String locatorType, String locatorValue) {
        switch (locatorType.toLowerCase()) {
            case "id":
                return By.id(locatorValue);
            case "name":
                return By.name(locatorValue);
            case "xpath":
                return By.xpath(locatorValue);
            case "css":
                return By.cssSelector(locatorValue);
            case "class":
                return By.className(locatorValue);
            default:
                throw new IllegalArgumentException("Locator type không hợp lệ: " + locatorType);
        }
    }

    // Trả về WebElement
    public WebElement getElement(String locatorType, String locatorValue) {
        return driver.findElement(getBy(locatorType, locatorValue));
    }
}
