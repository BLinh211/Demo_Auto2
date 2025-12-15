import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class CheckBox {
    static WebDriver driver =null;
    public static void main(String args[]) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");

        List<WebElement> checkboxes = new ArrayList<>();
        checkboxes.add(driver.findElement(By.id("vfb-6-0")));
        checkboxes.add(driver.findElement(By.id("vfb-6-1")));

        Thread.sleep(3000);

        for (WebElement checkbox : checkboxes){
            checkbox.click();
            System.out.println("Checkbox value selected is: "+ checkbox.getAttribute("value"));
            System.out.println("Is selected? " + checkbox.isSelected());
        }

    }
}
