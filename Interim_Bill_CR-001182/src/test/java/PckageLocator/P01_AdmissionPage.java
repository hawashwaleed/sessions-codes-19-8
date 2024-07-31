package PckageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P01_AdmissionPage {
    public WebElement LoginUserName (WebDriver driver){return driver.findElement(By.xpath("//input[@id='txtusername']"));}
    public WebElement LoginPassWord (WebDriver driver){return driver.findElement(By.xpath("//input[@id='txtpassword']"));}
    public WebElement LoginButton (WebDriver driver){return driver.findElement(By.xpath("//button[@id='btn-login']"));}
    public WebElement SearchingAdmissionModule (WebDriver driver){return driver.findElement(By.xpath("//input[@id='txtfind']"));}
    public WebElement selectAdmissionModule (WebDriver driver,int i)
    {
        List<WebElement> elements = driver.findElements(By.className("text-center"));
        return elements.get(i);
    }

    public WebElement editMRN (WebDriver driver){return driver.findElement(By.xpath("//input[@id='txtpin']"));}
    public WebElement selectBedType (WebDriver driver){return driver.findElement(By.xpath("//div[@id=\"select2-drop\"]/descendant::input"));}
    public WebElement selectPrimaryDoc (WebDriver driver){return driver.findElement(By.xpath("//div[@id=\"select2-drop\"]/descendant::input"));}
    public WebElement admissionType (WebDriver driver){return driver.findElement(By.xpath("//div[@id=\"select2-drop\"]/descendant::input"));}
    public WebElement ICDList (WebDriver driver){return driver.findElement(By.xpath("//div[@id=\"select2-drop\"]/descendant::input"));}
    public WebElement RoomType (WebDriver driver){return driver.findElement(By.xpath("//div[@id=\"select2-drop\"]/descendant::input"));}
    public WebElement wardlist (WebDriver driver){return driver.findElement(By.xpath("//div[@id=\"select2-drop\"]/descendant::input"));}
}
