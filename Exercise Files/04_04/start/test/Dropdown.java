import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        //Click drop down button
        WebElement dropdownButton=driver.findElement(By.id("dropdownMenuButton"));
        dropdownButton.click();
        //Click option
        WebElement option=driver.findElement(By.id("autocomplete"));
        option.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
