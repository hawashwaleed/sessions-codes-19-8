package PackageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P11_OutPatientChargingPage {
    public WebElement editMRN (WebDriver driver){return driver.findElement(By.xpath("//input[@id='opbpin']"));}
}
