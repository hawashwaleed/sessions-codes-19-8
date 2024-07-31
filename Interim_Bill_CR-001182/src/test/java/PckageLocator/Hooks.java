package PckageLocator;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {
    public static ChromeDriver driver;
    public static String zoomJS;

    @Before
    public void setup (){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        zoomJS = "document.body.style.zoom='0.7'";
        js.executeScript(zoomJS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.navigate().refresh();
    }

    @After
    public void close (){

        if (driver == null) {
            driver.quit();
        }

    }
}
