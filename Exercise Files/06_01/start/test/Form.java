import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        //Fill out all the fields
        WebElement firstName= driver.findElement(By.id("first-name"));
        firstName.sendKeys("Aarti");
        WebElement lastName=driver.findElement(By.id("last-name"));
        lastName.sendKeys("Sridhar");
        WebElement jobTitle=driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Test Engineer");
        WebElement educationLevel=driver.findElement(By.id("radio-button-2"));
        educationLevel.click();
        WebElement sexChoice=driver.findElement(By.id("checkbox-2"));
        sexChoice.click();
        Select select=new Select(driver.findElement(By.id("select-menu")));
        select.selectByValue("2");
        WebElement datePicker=driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("07/22/2018");
        datePicker.sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector("a.btn.btn-lg.btn-primary")).click();

        //adding Implicit Wait
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);


        driver.quit();
    }
}
