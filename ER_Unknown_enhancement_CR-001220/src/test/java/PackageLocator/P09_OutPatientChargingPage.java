package PackageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hooks.driver;

public class P09_OutPatientChargingPage {

    public WebElement doctorList (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='s2id_autogen18_search'])[1]"));}

    public void doubleClickOrderItems(WebElement element) {
        JavascriptExecutor executorItems = (JavascriptExecutor) driver;
        executorItems.executeScript("arguments[0].dispatchEvent(new MouseEvent('dblclick', { bubbles: true }));",element);
    }
    public WebElement popupMessage (WebDriver driver){return driver.findElement(By.xpath("(//button[@class='btn btn-danger btn-sm'])[1]"));}

}
