import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        //Locate autocomplete field
        WebElement autocomplete=driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1257 Willow Pass Road,Concord");
        Thread.sleep(2000);
        //Locate autocomplete result container
        WebElement autocompleteResult=driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        Thread.sleep(1000);

        driver.quit();
    }
}
