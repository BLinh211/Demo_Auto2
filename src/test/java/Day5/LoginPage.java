package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.ExcelUtils;

import java.util.List;
import java.util.Map;

public class LoginPage {
    public static void main(String[] args) {
        String excelFilePath = "data.xlxs";
        String sheetName = "Login";

        //đọc dữ liệu
        List<Map<String, String>> excelData = ExcelUtils.readExcel(excelFilePath, sheetName);
        //THiết lp webdriver
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();

        //Duyệt qua từng bản ghi
        for (Map<String, String> row : excelData) {
            System.out.println("Dữ liệu hàng: "+ row);
            String user = row.get("username");
            String pass = row.get("password");
            driver.get("https://www.saucedemo.com/");
            WebElement usernameInput = driver.findElement(By.id("user-name"));
            usernameInput.sendKeys(user);
            WebElement passwordInput = driver.findElement(By.id("password"));
            passwordInput.sendKeys(pass);
        }
        driver.quit();
    }
}
