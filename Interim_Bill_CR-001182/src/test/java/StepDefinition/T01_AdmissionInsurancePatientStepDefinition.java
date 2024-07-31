package StepDefinition;

import PckageLocator.P01_AdmissionPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


import static PckageLocator.Hooks.driver;


public class T01_AdmissionInsurancePatientStepDefinition {
    P01_AdmissionPage AdmissionInsurancePatient = new P01_AdmissionPage();

    @Given("The Admission Team Opening The Admission Module")
    public void TheAdmissionTeamOpeningTheAdmissionModule (){
        driver.navigate().to("http://130.1.118.32/HISLOGIN/Login");
        AdmissionInsurancePatient.LoginUserName(driver).sendKeys("1824046");
        AdmissionInsurancePatient.LoginPassWord(driver).sendKeys("EXPIRED");
        AdmissionInsurancePatient.LoginButton(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.SearchingAdmissionModule(driver).sendKeys("Admission");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        AdmissionInsurancePatient.selectAdmissionModule(driver,1).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.7'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#url-menu > li.treeview._parentlink._parentlink_1 > a\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[href='/HISADM/Admission/Admission']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));

    }

    @When("The Admission Team Searching By MRN")
    public void theAdmissionTeamSearchingByMRN() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.6'");
        AdmissionInsurancePatient.editMRN(driver).sendKeys("2133682" + Keys.ENTER);
    }


    @And("The Admission Team Edite The Admission Data")
    public void theAdmissionTeamEditeTheAdmissionData() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ///Company Details///
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > section:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > th:nth-child(1) > b:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ///Bed Type///
        ((JavascriptExecutor) driver).executeScript("var bedType = document.getElementById('s2id_txteligble');$(bedType).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.selectBedType(driver).sendKeys("FIRST CLASS");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.selectBedType(driver).sendKeys(Keys.ENTER);
        ///limit Date///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#txtloalimit\").value='22'");
        ///doctor details///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > section:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(4) > th:nth-child(1) > b:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ///Primary Consultant///
        ((JavascriptExecutor) driver).executeScript("var PrimaryDoctor = document.getElementById('s2id_txtdoc1');$(PrimaryDoctor).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.selectPrimaryDoc(driver).sendKeys("CD19");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.selectPrimaryDoc(driver).sendKeys(Keys.ENTER);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ///Alert Escape///

        ///work details///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > section:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(6) > th:nth-child(1) > b:nth-child(1)\").click()");
        ///Occupation///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#txtoccupation\").value='test'");
        ///reason for admission///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > section:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(7) > th:nth-child(1) > b:nth-child(1)\").click()");
        ///Admission Type///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("var AdmissionType = document.getElementById('s2id_txtadmtyp');$(AdmissionType).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.admissionType(driver).sendKeys("Elective waiting list");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.admissionType(driver).sendKeys(Keys.ENTER);
        ///ICD///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn-icd\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.ICDList(driver).sendKeys("A00.1");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        AdmissionInsurancePatient.ICDList(driver).sendKeys(Keys.ENTER);
        ///Save ICD///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[onclick='SelectICD();']\").click()");
        ///Room type///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("var romType = document.getElementById('s2id_txtrequestedbillroom');$(romType).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.RoomType(driver).sendKeys("FIRST CLASS");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.RoomType(driver).sendKeys(Keys.ENTER);
        ///Ward///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("var Ward = document.getElementById('s2id_txtstation');$(Ward).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.wardlist(driver).sendKeys("ADMISSION");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        AdmissionInsurancePatient.wardlist(driver).sendKeys(Keys.ENTER);

    }

    @And("The Admission Team Saving The Admission Data")
    public void theAdmissionTeamSavingTheAdmissionData() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn-sv\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".confirm\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div.sweet-alert.showSweetAlert.visible > button.confirm\").click()");
    }

    @Then("The Admission Team Close The Admission Module")
    public void theAdmissionTeamCloseTheAdmissionModule() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        driver.quit();
    }

}
