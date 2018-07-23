import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        //Trigger the modal
        WebElement modalButton=driver.findElement(By.id("modal-button"));
        modalButton.click();

        //Click on the close button using Javascript executor
        WebElement okButton=driver.findElement(By.id("ok-button"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //js.executeScript("arguments[0].click();",closeButton);
        js.executeScript("arguments[0].click();",okButton);

        Thread.sleep(1000);

        driver.quit();
    }
}
