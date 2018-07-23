import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        driver.manage().window().maximize();

        //radio button 1
        WebElement radioButton1=driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        Thread.sleep(1000);

        //radio button 2
        WebElement radioButton2=driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        Thread.sleep(1000);

        //radioButton3
        WebElement radioButton3=driver.findElement(By.cssSelector("input[value='option3']"));
        radioButton3.click();
        Thread.sleep(1000);

        //checkboxes
        driver.get("http://formy-project.herokuapp.com/checkbox");
        driver.manage().window().maximize();

        //checkbox1
        WebElement checkBox1=driver.findElement(By.id("checkbox-1"));
        checkBox1.click();
        Thread.sleep(1000);

        //checkBox2
        WebElement checkBox2=driver.findElement(By.id("checkbox-2"));
        checkBox2.click();
        Thread.sleep(1000);

        //checkBox3
        WebElement checkBox3=driver.findElement(By.id("checkbox-3"));
        checkBox3.click();
        Thread.sleep(1000);

        driver.quit();
    }
}
