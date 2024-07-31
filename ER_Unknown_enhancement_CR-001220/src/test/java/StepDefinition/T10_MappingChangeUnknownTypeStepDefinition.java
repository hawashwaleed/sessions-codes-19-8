package StepDefinition;

import PackageLocator.P01_RegistrationPage;
import PackageLocator.P10_ChangeCompanyPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static StepDefinition.Hooks.driver;

public class T10_MappingChangeUnknownTypeStepDefinition {
    P01_RegistrationPage UnknownNewFile = new P01_RegistrationPage();
    P10_ChangeCompanyPage ChangeCompany = new P10_ChangeCompanyPage();


    @Given("Reception Team Opening The Change Company Screen")
    public void ReceptionTeamOpeningTheChangeCompanyScreen(){
        driver.navigate().to("http://130.1.2.33/HISFRONTOFFICE");
        UnknownNewFile .username(driver).sendKeys("1824046");
        UnknownNewFile .password(driver).sendKeys("EXPIRED");
        UnknownNewFile .loginButton(driver).click();
        UnknownNewFile .searchFrontOffice(driver).sendKeys("FRONT OFFICE");
        UnknownNewFile .selectFrontOfficeModule(driver,18).click();
        UnknownNewFile .editStationName(driver).click();
        UnknownNewFile .searchStationName(driver).sendKeys("OP EMERGENCY");
        UnknownNewFile .SelectStation(driver,0).click();
        UnknownNewFile .clickSetStationButton(driver).click();
        UnknownNewFile .clickSuccessButton(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ChangeCompany.searchingChangeScreen(driver).sendKeys("Change Company");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(6) > div:nth-child(2)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("Claim File Maintenance")) {
                break;
            }
        }
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
    }

    @And("Reception Team Searching By The Unknown MRN")
    public void receptionTeamSearchingByTheUnknownMRN() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'");
        ChangeCompany.editUnknownMRN(driver).sendKeys("1840210" + Keys.ENTER);
    }

    @And("Reception Team Select The Company")
    public void receptionTeamSelectTheCompany() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn_searchcomp\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ChangeCompany.editCodeCompany(driver).sendKeys("301C" + Keys.ENTER);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        WebElement selectCompany = driver.findElement(By.cssSelector("tr[role='row'] td:nth-child(1)"));
        ChangeCompany.doubleClickCompany(selectCompany);
    }

    @And("Reception Team Select The Grade")
    public void receptionTeamSelectTheGrade() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("var requestingDoctorElement = document.getElementById('s2id_gra');\n" +
                "$(requestingDoctorElement).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ChangeCompany.selectGrade(driver).sendKeys(Keys.ARROW_DOWN);
        ChangeCompany.selectGrade(driver).sendKeys(Keys.RETURN);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#medid\").value='140'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));

    }

    @And("Reception Team Click The Save Button")
    public void receptionTeamClickTheSaveButton() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btnSaveClaimFile\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-info btn-sm']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-success btn-sm']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(7));
        driver.close();
    }

    @And("Reception Team Create The Eligibility ByPass")
    public void receptionTeamCreateTheEligibilityByPass() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("SAUDI GERMAN HOSPITALS GROUP | Home")) {
                break;
            }
        }
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ChangeCompany.searchPassScreen(driver).clear();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ChangeCompany.searchPassScreen(driver).sendKeys("Eligibility ByPass");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".quick_div.ql_blue[href='/HISFRONTOFFICE/EligibilityByPass']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("SAUDI GERMAN HOSPITALS GROUP | Eligibility ByPass")) {
                break;
            }
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[title='Add New']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ///edite The MRN number///
        ChangeCompany.searchPassMRN(driver).sendKeys("1840210" + Keys.ENTER);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("var requestingDoctorList = document.getElementById('s2id_eligdoctor');\n" +
                "$(requestingDoctorList).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ChangeCompany.selectPassDoctor(driver).sendKeys("ER87 - NADA JAMAL ABDULQADER" + Keys.ARROW_DOWN);
        ChangeCompany.selectPassDoctor(driver).sendKeys(Keys.RETURN);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#eligibilitycode\").value='Test'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#eligibilityreferenceurl\").value='Test'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#eligrespremarks\").value='Test'");
        ///click save Button///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn_eligibilitysubmit\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-info btn-sm']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-success btn-sm']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));

    }
}
