package PackageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class P03_NursingPage {
    public WebElement searchNursingModule (WebDriver driver){return driver.findElement(By.cssSelector("#txtfind"));}

    public WebElement selectNursingModule (WebDriver driver){return driver.findElement(By.cssSelector(".col-12.col-sm-6.col-md-4.imgModule[data-urlink='http://130.1.2.33/HISNURSE/NURSE/Main']"));}

    public WebElement searchErPage (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='featsearch'])[1]"));}
    public WebElement openERPage (WebDriver driver){return driver.findElement(By.cssSelector("a[href='/HISNURSE/NURSE/NursingForms/ERNursingForms']"));}


}
