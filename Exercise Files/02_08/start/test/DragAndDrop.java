import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        //get the source element
        WebElement source=driver.findElement(By.id("image"));

        //get the target element
        WebElement target=driver.findElement(By.id("box"));

        //drag and drop
        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,target).build().perform();
        Thread.sleep(2000);

        //verify drag and drop complete
        WebElement image=driver.findElement(By.xpath("//*[@id=\"image\"]"));
        if(image.isDisplayed()) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        driver.quit();
    }
}

