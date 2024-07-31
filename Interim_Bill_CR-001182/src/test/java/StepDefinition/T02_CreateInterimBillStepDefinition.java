package StepDefinition;

import PckageLocator.P01_AdmissionPage;
import PckageLocator.P02_IPBillingPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static PckageLocator.Hooks.driver;

public class T02_CreateInterimBillStepDefinition {
    P01_AdmissionPage AdmissionInsurancePatient = new P01_AdmissionPage();
    P02_IPBillingPage CreateInterimBill = new P02_IPBillingPage();

    @Given("The Admission Office Team Open The IPBilling Module")
    public void theAdmissionOfficeTeamOpenTheIPBillingModule() {
        driver.navigate().to("http://130.1.118.32/HISLOGIN/Login");
        AdmissionInsurancePatient.LoginUserName(driver).sendKeys("1824046");
        AdmissionInsurancePatient.LoginPassWord(driver).sendKeys("EXPIRED");
        AdmissionInsurancePatient.LoginButton(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.SearchingAdmissionModule(driver).sendKeys("ip - Billing");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        CreateInterimBill.selectIPBilling(driver).click();

        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.7'");
    }

    @And("The Admission Office Team Opening The InPaten Bill Screen")
    public void theAdmissionOfficeTeamOpeningTheInPatenBillScreen() {
        ///Confirm Message///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".confirm\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#url-menu > li.treeview._parentlink._parentlink_1 > a\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#url-menu > li.treeview._parentlink._parentlink_1.active > ul > li:nth-child(1) > a\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.7'");
        ///hide Notification///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn-hidenotif\").click()");
    }

    @And("The Admission Office Team Searching MRN")
    public void theAdmissionOfficeTeamSearchingMRN() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        CreateInterimBill.searchMRN(driver).sendKeys("999000504" + Keys.ENTER);

    }

    @And("The Admission Office Team Create The Interim Bill")
    public void theAdmissionOfficeTeamCreateTheInterimBill() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn-interim\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(12) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > span:nth-child(5)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div.sweet-alert.showSweetAlert.visible > button.confirm\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div.sweet-alert.showSweetAlert.visible.show-input > button.confirm\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div.sweet-alert.showSweetAlert.visible > button.confirm\").click()");

    }
}
