import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        //Trigger alert
        WebElement alertBtn=driver.findElement(By.id("alert-button"));
        alertBtn.click();

        //Get orginal window handle
        String orgWindow=driver.getWindowHandle();

        //Switch to alert window
        Alert alert=driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();
        Thread.sleep(2000);

        driver.switchTo().window(orgWindow);
        Thread.sleep(1000);

        driver.quit();
    }
}
