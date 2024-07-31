package StepDefinition;

import PackageLocator.P01_RegistrationPage;
import PackageLocator.P05_ERLaboratoryTestPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static StepDefinition.Hooks.driver;

public class T05_ConductingLaboratoryTestStepDefinition {

    P01_RegistrationPage UnknownNewFile = new P01_RegistrationPage();

    P05_ERLaboratoryTestPage LaboratoryERUnknownTestes = new P05_ERLaboratoryTestPage();

    @Given("Doctor Lab Open The Laboratory Module")
    public void DoctorLabOpenTheLaboratoryModule(){
        driver.navigate().to("http://130.1.2.33/HISLOGIN/Login");
        UnknownNewFile .username(driver).sendKeys("1824046");
        UnknownNewFile .password(driver).sendKeys("EXPIRED");
        UnknownNewFile .loginButton(driver).click();
        LaboratoryERUnknownTestes.searchLabModule(driver).sendKeys("LABORATORY");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(7));
        LaboratoryERUnknownTestes.selectLabModule(driver).click();
    }

    @And("Doctor Lab Open The Test Requisition Screen")
    public void doctorLabOpenTheTestRequisitionScreen() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(7));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'");
        driver.navigate().to("http://130.1.2.33/HISLABORATORY/LAB/SelectedRange/index2");
    }

    @And("Doctor Lab Searching By Unknown MRN patient")
    public void doctorLabSearchingByUnknownMRNPatient() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        LaboratoryERUnknownTestes.labDoSearchMRN(driver).sendKeys("0001840290");
        LaboratoryERUnknownTestes.labDoSearchMRN(driver).sendKeys(Keys.ENTER);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));

    }

    @And("Doctor lab Select The Unknown MRN")
    public void doctorLabSelectTheUnknownMRN() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"tbody tr:nth-child(1) td:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));

    }

    @And("Doctor Lab Make Result Confirmed")
    public void doctorLabMakeResultConfirmed() {
        ///result confirmed///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ///select MRN///
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-xs bg-gray']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ///click confirmed button///
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btnSelectedRangeConfirm\").click()");
        ///click close button///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > button:nth-child(4)\").click()");

    }

    @And("Doctor Lab Make Result Validated")
    public void doctorLabMakeResultValidated() {
        ///result validation///
        ///select yellow button///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-xs bg-yellow']\").click()");
        ///click validate button///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btnSelectedRangeValidate\").click()");
        ///click close button///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(8) > div:nth-child(3) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > button:nth-child(8)\").click()");

    }


    @Then("Doctor Lab Close The Laboratory Module")
    public void doctorLabCloseTheLaboratoryModule() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        driver.quit();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
    }


}
