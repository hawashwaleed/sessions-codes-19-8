package PackageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P12_OrderMappingScreen {
    public WebElement searchMappingScreen (WebDriver driver){return driver.findElement(By.xpath("//input[@id='quicklinksfilter']"));}
    public WebElement editMRNMapping (WebDriver driver){return driver.findElement(By.xpath("//input[@id='patientmrn']"));}
    public WebElement visitFrom (WebDriver driver){return driver.findElement(By.xpath("//div[@id=\"select2-drop\"]/descendant::input"));}
    public WebElement visitTo (WebDriver driver){return driver.findElement(By.xpath("//div[@id=\"select2-drop\"]/descendant::input"));}
    public WebElement reason (WebDriver driver){return driver.findElement(By.xpath("//div[@id=\"select2-drop\"]/descendant::input"));}
    public WebElement approve (WebDriver driver){return driver.findElement(By.xpath("//div[@id=\"select2-drop\"]/descendant::input"));}





}
