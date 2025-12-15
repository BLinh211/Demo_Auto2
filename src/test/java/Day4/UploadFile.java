package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class UploadFile {
    static WebDriver driver = null;
    public static void main(String[]args){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/upload/");
        String filePath = new File("Hello_Selenium.docx").getAbsolutePath();

        WebElement uploadfile1 = driver.findElement(By.name("uploadfile_0"));
        uploadfile1.sendKeys(filePath);
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).click();

        WebElement result = driver.findElement(By.id("res"));
        System.out.println(result.getText());
    }
}
