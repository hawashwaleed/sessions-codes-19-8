package PackageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P08_MRDPage {
    public WebElement searchMRDModule (WebDriver driver){return driver.findElement(By.cssSelector("#txtfind"));}
    public WebElement selectMRdModule (WebDriver driver){return driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@class='content-wrapper']/div[@class='content']/section[@class='content']/div[@class='container-fluid']/div[@class='row']/div[36]/div[1]"));}
    public WebElement searchByMRN (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='txt_main_pin_no'])[1]"));}
    public WebElement titleList (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='s2id_autogen17_search'])[1]"));}
    public WebElement MaritalList (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='s2id_autogen18_search'])[1]"));}
    public WebElement genderList (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='s2id_autogen20_search'])[1]"));}
    public WebElement dateOfBirth (WebDriver driver){return driver.findElement(By.xpath("(//select[@class='yearselect'])[1]"));}
    public WebElement nationalityList (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='s2id_autogen26_search'])[1]"));}
    public WebElement religionList (WebDriver driver){return driver.findElement(By.xpath("(//input[@id='s2id_autogen28_search'])[1]"));}
}
