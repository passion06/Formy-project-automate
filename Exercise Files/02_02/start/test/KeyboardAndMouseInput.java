import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement element=driver.findElement(By.id("name"));
        element.click();
        element.sendKeys("Aarti Sridhar");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebElement button=driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
