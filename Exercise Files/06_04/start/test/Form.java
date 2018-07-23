import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/Srikkanth/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        //Submit Form
        Formpage formpage=new Formpage();
        formpage.submitForm(driver);


        //Get alert text from confirmation page and assert Text
        confirmationPage cfpage=new confirmationPage();
        cfpage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", cfpage.getAlertBannerText(driver));

        driver.quit();
    }




}
