import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        //find element not in view and moving focus to it
        WebElement name=((ChromeDriver) driver).findElement(By.id("name"));
        Actions actions=new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Aarti Sridhar");

        //input text in date field
        WebElement date=driver.findElement(By.id("date"));
        date.sendKeys("12/31/2014");
        Thread.sleep(2000);

        driver.quit();
    }
}
