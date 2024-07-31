package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

    public static ChromeDriver driver;
    public static String zoomJS;






    @Before
    public void setup (){
        driver = new ChromeDriver();
        driver .manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        zoomJS = "document.body.style.zoom='0.8'";
        js.executeScript(zoomJS);

//        driver.navigate().to("http://130.1.2.33/HISLOGIN/Login?ReturnUrl=%2fHISLOGIN%2f");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.navigate().refresh();

    }

    @After
    public void close (){
//        if (driver == null) {
//            driver.quit();
//        }


    }

}
