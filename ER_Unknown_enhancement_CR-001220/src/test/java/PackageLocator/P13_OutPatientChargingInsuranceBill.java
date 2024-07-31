package PackageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P13_OutPatientChargingInsuranceBill {
    public WebElement editMRNInsuranceOrder (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='opbpin'])[1]"));}
    public WebElement searchUCAFModule (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='txtfind'])[1]"));}
    public WebElement selectUCAFModule (WebDriver driver){return driver.findElement(By.xpath("(//div[@class='info-box-content'])[59]"));}
    public WebElement editStation (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='s2id_autogen1_search'])[1]"));}
    public WebElement searchUCAFMRN (WebDriver driver){return driver.findElement(By.xpath("(//input[@aria-controls='tblapprovalrequest'])[1]"));}
    public WebElement approveList (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='s2id_autogen3_search'])[1]"));}
}
