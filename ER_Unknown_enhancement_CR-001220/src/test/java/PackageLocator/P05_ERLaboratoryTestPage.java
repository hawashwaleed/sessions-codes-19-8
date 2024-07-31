package PackageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P05_ERLaboratoryTestPage {
    public WebElement searchLabModule (WebDriver driver){return driver.findElement(By.cssSelector("#txtfind"));}
    public WebElement selectLabModule (WebDriver driver){return driver.findElement(By.xpath("(//div[contains(@class,'info-box mb-3')])[28]"));}
    public WebElement labDoSearchMRN (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='tbPinMain'])[1]"));}



}
