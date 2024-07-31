package StepDefinition;


import PackageLocator.P01_RegistrationPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;

import static StepDefinition.Hooks.driver;


public class T01_NewFileUnknownStepDefinition {

    P01_RegistrationPage UnknownNewFile = new P01_RegistrationPage();



    @Given("user login  user name")
    public void user_login_user_name(){
        driver.navigate().to("http://130.1.2.33/HISLOGIN/Login?ReturnUrl=%2fHISLOGIN%2f");

        UnknownNewFile .username(driver).sendKeys("1824046");
    }

    @When("user edit valid password")
    public void userEditValidPassword(){ UnknownNewFile .password(driver).sendKeys("EXPIRED");}

    @And("user click login button")
    public void userClickLoginButton(){ UnknownNewFile .loginButton(driver).click();}

    @And("user from home page search for front office module")
    public void userFromHomePageSearchForFrontOfficeModule(){ UnknownNewFile .searchFrontOffice(driver).sendKeys("FRONT OFFICE");}

    @And("user select the front office module")
    public void userSelectTheFrontOfficeModule(){ UnknownNewFile .selectFrontOfficeModule(driver,18).click();}

    @And("user edit the station name")
    public void userEditTheStationName() {UnknownNewFile .editStationName(driver).click();}

    @And("user search the station name")
    public void userSearchTheStationName() {UnknownNewFile .searchStationName(driver).sendKeys("OP EMERGENCY");}

    @And("the user select the station")
    public void theUserSelectTheStation() {UnknownNewFile .SelectStation(driver,0).click();}

    @And("the user click the set station button")
    public void theUserClickTheSetStationButton() {UnknownNewFile .clickSetStationButton(driver).click();}

    @And("the user click the success message")
    public void theUserClickTheSuccessMessage() {
        UnknownNewFile .clickSuccessButton(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
    }

    @And("the user searching by the screen Registration name")
    public void theUserSearchingByTheScreenRegistrationName() {
        //editAndSearchRegistrationScreen
        UnknownNewFile.editNameRegistrationScreen(driver).sendKeys("patient Registration");
    }

    @And("user select Registration screen")
    public void userSelectRegistrationScreen()
    {

        //selectTheRegistrationScreen
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        UnknownNewFile.clickOntheRegistrationScreen(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        //switching to new window
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("SAUDI GERMAN HOSPITALS GROUP | Patient Registration")) {
                break;
            }
        }
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));


    }



    @And("user click the registration unknown patient button")
    public void userClickTheRegistrationUnknownPatientButton() {
        UnknownNewFile .ClickUnknownButton(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));


    }

    @And("user edit the mandatory field First Name")
    public void userEditTheMandatoryFieldFirstName() {UnknownNewFile .editFirstName(driver).sendKeys("test1");}

    @And("user edit the mandatory field the Family Name")
    public void userEditTheMandatoryFieldTheFamilyName() {UnknownNewFile .editFamilyName(driver).sendKeys("test10");}

    @And("user click the Save and Generate MRN button")
    public void userClickTheSaveAndGenerateMRNButton() {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.id("btnSaveUnknowPatient"));

        je.executeScript("arguments[0].scrollIntoView(true);",element);
        element .click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));


    }

    @And("user click the OK button")
    public void userClickTheOKButton() {
        UnknownNewFile.ClickOneOkButton(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
    }

    @Then("user click the close button for new MRN unknown number")
    public void userClickTheCloseButtonForNewMRNUnknownNumber() {
        UnknownNewFile.asserNweMRNIsDisplay(driver).isDisplayed();
        Assert.assertTrue(UnknownNewFile.asserNweMRNIsDisplay(driver).isDisplayed(),"The New Unknown MRN Is Generated Successfully");
        UnknownNewFile.clickCancetButton(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        driver.close();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        driver.quit();

    }








}
