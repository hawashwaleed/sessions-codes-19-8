package PackageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hooks.driver;

public class P10_ChangeCompanyPage {
    public WebElement searchingChangeScreen (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='quicklinksfilter'])[1]"));}
    public WebElement editUnknownMRN (WebDriver driver){return driver.findElement(By.xpath("//input[@id='pin']"));}
    public WebElement editCodeCompany (WebDriver driver){return driver.findElement(By.xpath("//input[@id='scode']"));}


    public void doubleClickCompany(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].dispatchEvent(new MouseEvent('dblclick', { bubbles: true }));", element);
    }

    public WebElement selectGrade(WebDriver driver){return driver.findElement(By.xpath("(//input[@id='s2id_autogen5_search'])[1]"));}
    public WebElement searchPassScreen (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='quicklinksfilter'])[1]"));}
    public WebElement searchPassMRN (WebDriver driver){return driver.findElement(By.xpath("//input[@id='eligpin']"));}
    public WebElement selectPassDoctor (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='s2id_autogen1_search'])[1]"));}



}
