package PckageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P02_IPBillingPage {

    public WebElement searchMRN (WebDriver driver){return driver.findElement(By.xpath("//input[@id='txtpatientID']"));}

    public WebElement selectIPBilling (WebDriver driver){return driver.findElement(By.xpath("(//div[@class='info-box-content'])[22]"));}

}
