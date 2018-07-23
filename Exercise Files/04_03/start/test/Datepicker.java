import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Datepicker {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        driver.manage().window().maximize();

        //find datepicker element
        WebElement datePicker=driver.findElement(By.id("datepicker"));
        datePicker.click();

        //enter date
        /*datePicker.sendKeys("03/08/2017");
        datePicker.sendKeys(Keys.ENTER);*/

        //enter date with mouse
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[4]")).click();

        driver.quit();
    }
}