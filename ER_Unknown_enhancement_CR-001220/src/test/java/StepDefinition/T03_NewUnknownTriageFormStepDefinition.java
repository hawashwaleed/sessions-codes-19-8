package StepDefinition;

import PackageLocator.P01_RegistrationPage;
import PackageLocator.P03_NursingPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static StepDefinition.Hooks.driver;

public class T03_NewUnknownTriageFormStepDefinition {

    P01_RegistrationPage UnknownNewFile = new P01_RegistrationPage();
    P03_NursingPage NewTriageForm = new P03_NursingPage();
    Actions action = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));

    @Given("Nursing Team Open Nursing Module")
    public void NursingTeamOpenNursingModule(){
        driver.navigate().to("http://130.1.2.33/HISNURSE/NURSE/NursingForms/ERNursingForms");
        UnknownNewFile .username(driver).sendKeys("1824046");
        UnknownNewFile .password(driver).sendKeys("EXPIRED");
        UnknownNewFile .loginButton(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        NewTriageForm.searchNursingModule(driver).sendKeys("Nursing Module");
        NewTriageForm.selectNursingModule(driver).click();
        NewTriageForm.searchErPage(driver).sendKeys("ER Nursing");
        NewTriageForm.openERPage(driver).click();
    }

    @And("Nursing Team Open The Triage Form")
    public void nursingTeamOpenTheTriageForm() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(7));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.7'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('btn-triage').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(7));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('txt_tri_pin').value='0001840291'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".input-group-addon.btn.btn-default.btn-xs.btnfindiqama\").click()");
    }


    @And("Nursing Team Select The Arrival Status")
    public void nursingTeamSelectTheArrivalStatus() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(7));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('iCheck-helper')[5].click()");

    }

    @And("Nursing Team Select The Save Button")
    public void nursingTeamSelectTheSaveButton() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('btn btn-xs btn-warning sv_btn_frm_40-sv _sv_btn_frm')[0].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('confirm')[0].click()");
    }

    @And("Nursing Team Select Tha Post Button")
    public void nursingTeamSelectThaPostButton() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('sv_btn_frm_40').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('confirm')[0].click()");
    }

    @Then("Nursing Team Close The Triage Form")
    public void nursingTeamCloseTheTriageForm() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('btn btn-default btn-close-modal')[0].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        driver.quit();
    }


}
