import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        //Click on New tab button
        WebElement newtabbutton=driver.findElement(By.id("new-tab-button"));
        newtabbutton.click();

        //Get original window Handle
        String orgwindowhandle=driver.getWindowHandle();

        //Run for loop to iterate through the open windows and swtich to new tab
        for(String handle:driver.getWindowHandles())
        {
            driver.switchTo().window(handle);
        }
        Thread.sleep(1000);
        //Switch to original window
        driver.switchTo().window(orgwindowhandle);
        Thread.sleep(2000);




        driver.quit();
    }
}
