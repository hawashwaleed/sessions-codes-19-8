package PackageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P06_ERRadiologyPage {
    public WebElement searchXrayModule (WebDriver driver){return driver.findElement(By.cssSelector("#txtfind"));}
    public WebElement selectXrayModule (WebDriver driver){return driver.findElement(By.xpath("(//div[@class='info-box mb-3'])[53]"));}
    public WebElement selectMenuBar (WebDriver driver){return driver.findElement(By.cssSelector("a[id='parentLinkHome'] i[class='right fas fa-angle-left']"));}
    public WebElement searchXRayMRN (WebDriver driver){return driver.findElement(By.cssSelector(".form-control.tb-pin"));}
    //public WebElement selectXRayMRN (WebDriver driver){return driver.findElement(By.cssSelector("td:nth-child(7)"));}
    public WebElement dropListTemplate (WebDriver driver){return driver.findElement(By.xpath("(//select[@id='ddlCriteria'])[1]"));}

}
