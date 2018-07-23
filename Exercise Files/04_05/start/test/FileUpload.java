import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        driver.manage().window().maximize();

        //Get fileupload field and send keys
        WebElement fileuploadField=driver.findElement(By.id("file-upload-field"));
        fileuploadField.sendKeys("/Users/srikkanth/Downloads/Test_Case__41_-60.xlsx");
        Thread.sleep(1000);

        driver.quit();
    }
}
