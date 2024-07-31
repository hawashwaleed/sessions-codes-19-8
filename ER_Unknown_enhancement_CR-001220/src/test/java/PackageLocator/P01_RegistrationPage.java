package PackageLocator;

import StepDefinition.T02_NewUnknownBillStepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P01_RegistrationPage {


    public WebElement username (WebDriver driver){return driver .findElement(By.xpath("(//input[@id='txtusername'])[1]"));}
    public WebElement password (WebDriver driver){return driver.findElement(By.id("txtpassword"));}
    public WebElement loginButton (WebDriver driver){return driver.findElement(By.id("btn-login"));}
    public WebElement searchFrontOffice (WebDriver driver){return driver .findElement(By.id("txtfind"));}

    public WebElement selectFrontOfficeModule (WebDriver driver,int i)
    {
        List<WebElement> elements = driver.findElements(By.className("text-center"));
        return elements.get(i);
    }
    public WebElement editStationName (WebDriver driver){return driver .findElement(By.linkText("Select Station..."));}
    public WebElement searchStationName (WebDriver driver){return driver .findElement(By.id("s2id_autogen1_search"));}
    public WebElement SelectStation (WebDriver driver,int z)
    {
        List<WebElement> station = driver .findElements(By.className("select2-result-label"));
        return station.get(z);
    }
    public WebElement clickSetStationButton (WebDriver driver){return driver .findElement(By.id("btn_change_station"));}
    public WebElement clickSuccessButton (WebDriver driver){return driver .findElement(By.cssSelector("button[class=\"btn btn-success btn-sm\"]"));}

    //editAndSearchRegistrationScreen
    public WebElement editNameRegistrationScreen (WebDriver driver){return driver.findElement(By.cssSelector("#quicklinksfilter"));}
    //selectTheRegistrationScreen
    public WebElement clickOntheRegistrationScreen (WebDriver driver){return driver.findElement(By.xpath("(//a[@data-search='patient registration'])[1]"));}


    public WebElement ClickUnknownButton (WebDriver driver){return driver .findElement(By.id("btn_unknowpatientregistration"));}

    public WebElement editFirstName (WebDriver driver){return driver .findElement(By.id("unknownptfname"));}

    public WebElement editFamilyName (WebDriver driver){return driver .findElement(By.id("unknownptlname"));}

    public WebElement ClickOneOkButton (WebDriver driver){return driver.findElement(By.xpath("(//button[@class='btn btn-success btn-sm'])[1]"));}

    public WebElement clickCancetButton (WebDriver driver){return driver.findElement(By.xpath("(//button[@id='btnCancelUnknowPatientRegistration'])[1]"));}

    public WebElement asserNweMRNIsDisplay (WebDriver driver){return driver.findElement(By.cssSelector("#unknownPatientMRN"));}






}
