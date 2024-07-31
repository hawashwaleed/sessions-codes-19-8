package StepDefinition;

import PackageLocator.P01_RegistrationPage;
import PackageLocator.P06_ERRadiologyPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static StepDefinition.Hooks.driver;

public class T06_ConductingRadiologyStepDefinition {

    P01_RegistrationPage UnknownNewFile = new P01_RegistrationPage();
    P06_ERRadiologyPage RadiologyERUnknownXRay = new P06_ERRadiologyPage();

    Actions actions = new Actions(driver);

    @Given("Doctor XRay Open The Radiology Module")
    public void DoctorXRayOpenTheRadiologyModule() {
        driver.navigate().to("http://130.1.2.33/HISLOGIN/Login");
        UnknownNewFile .username(driver).sendKeys("1824046");
        UnknownNewFile .password(driver).sendKeys("EXPIRED");
        UnknownNewFile .loginButton(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        RadiologyERUnknownXRay.searchXrayModule(driver).sendKeys("Radiology");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(7));
        RadiologyERUnknownXRay.selectXrayModule(driver).click();
    }

    @And("Doctor XRay Open The Order Screen")
    public void doctorXRayOpenTheOrderScreen() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        actions.moveToElement(RadiologyERUnknownXRay.selectMenuBar(driver)).moveToElement(RadiologyERUnknownXRay.selectMenuBar(driver)).click().perform();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#linkOrders\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.7'");
    }

    @And("Doctor XRay Searching By The MRN")
    public void doctorXRaySearchingByTheMRN() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        RadiologyERUnknownXRay.searchXRayMRN(driver).sendKeys("0001840290");
        RadiologyERUnknownXRay.searchXRayMRN(driver).sendKeys(Keys.ENTER);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
    }

    @And("Doctor XRay Select The MRN")
    public void doctorXRaySelectTheMRN() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"div[class='icheck-gray d-inline'] input[type='checkbox']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        Select templateList = new Select(RadiologyERUnknownXRay.dropListTemplate(driver));
        templateList.selectByIndex(2);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btnSaveResult\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"div[id='modal-overlay'] button:nth-child(2)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));

    }

    @Then("Doctor XRay Close The Screen")
    public void doctorXRayCloseTheScreen() {
        driver.quit();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
    }
}
