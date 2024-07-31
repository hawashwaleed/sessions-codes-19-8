package PackageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static StepDefinition.Hooks.driver;


public class P02_OutPatientBillingPage {



    public WebElement searchOutPatientChargingScreen (WebDriver driver){return driver.findElement(By.cssSelector("#quicklinksfilter"));}

    public WebElement openTheOutPatientChargingScreen (WebDriver driver){return driver.findElement(By.xpath("(//a[@data-search='out patient charging'])[1]"));}

    public WebElement mrnInfo (WebDriver driver){return driver .findElement(By.xpath("//*[@id=\"opbpin\"]"));}

    public WebElement searchDoctor (WebDriver driver){return driver.findElement(By.xpath("//*[@id=\"ConsultationDoctorList_filter\"]/label/input"));}

    public WebElement editSearchNameDo (WebDriver driver){return driver .findElement(By.xpath("(//input[@aria-controls='ConsultationDoctorList'])[1]"));}

    public void doubleClickWithJSExecutor(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].dispatchEvent(new MouseEvent('dblclick', { bubbles: true }));", element);
    }


}

