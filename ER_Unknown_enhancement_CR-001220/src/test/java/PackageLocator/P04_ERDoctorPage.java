package PackageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static StepDefinition.Hooks.driver;

public class P04_ERDoctorPage {
    public WebElement ERDousername (WebDriver driver){return driver .findElement(By.id("txtusername"));}
    public WebElement ERDOpassword (WebDriver driver){return driver.findElement(By.id("txtpassword"));}
    public WebElement ERDOloginButton (WebDriver driver){return driver.findElement(By.id("btn-login"));}
    public WebElement ERSelectPayLaterPatient (WebDriver driver){return driver.findElement(By.cssSelector("#tblERPyLtrApprvl tbody>tr>th:nth-child(1)"));}
    public WebElement ERDropListDepartment (WebDriver driver){return driver.findElement(By.xpath("(//select[@id='_s_emergencydisposition_hist'])[1]"));}
    public WebElement diagnosisList (WebDriver driver){return driver.findElement(By.xpath("//div[@id=\"select2-drop\"]/descendant::input"));}
    public WebElement ERMedicationList (WebDriver driver){return driver.findElement(By.xpath("//div[@id=\"select2-drop\"]/descendant::input"));}

    public WebElement frequency (WebDriver driver){return driver.findElement(By.xpath("//select[@id='_meds_freq']"));}
    public WebElement startMonth (WebDriver driver){return driver.findElement(By.xpath("//select[@id='_meds_durdays']"));}
    public WebElement activeDiagnoses (WebDriver driver){return driver.findElement(By.xpath("//select[@id='_meds_activediag']"));}

}
