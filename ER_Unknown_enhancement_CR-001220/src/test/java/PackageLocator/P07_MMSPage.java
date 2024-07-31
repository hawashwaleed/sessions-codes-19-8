package PackageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P07_MMSPage {
    public WebElement mmsLoginUser (WebDriver driver){return driver.findElement(By.cssSelector("#txtusername"));}
    public WebElement mmsLoginPassword (WebDriver driver){return driver.findElement(By.xpath("//input[@id='txtpassword']"));}
    public WebElement searchMMSModule (WebDriver driver){return driver.findElement(By.xpath("//input[@id='txtfind']"));}
    public WebElement stationID (WebDriver driver){return driver.findElement(By.xpath("//select[@id='selectedStationID']"));}
    public WebElement dispensingDoctor (WebDriver driver){return driver.findElement(By.xpath("//div[@class=\"select2-search\"]/descendant::input"));}
    public WebElement clearZero (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='ReqQty'])[1]"));}
    public WebElement clearZero1 (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='ReqQty'])[2]"));}


}
