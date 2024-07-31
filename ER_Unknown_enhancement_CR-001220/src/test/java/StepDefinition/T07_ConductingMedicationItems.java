package StepDefinition;

import PackageLocator.P07_MMSPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static StepDefinition.Hooks.driver;

public class T07_ConductingMedicationItems {
    P07_MMSPage MMSItems = new P07_MMSPage();

    @Given("The Pharma Doctor Opening The MMS Module")
    public void ThePharmaDoctorOpeningTheMMSModule (){
        driver.navigate().to("http://130.1.2.33/HISLOGIN/Login");
        MMSItems.mmsLoginUser(driver).sendKeys("1658355");
        MMSItems.mmsLoginPassword(driver).sendKeys("SA246200");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn-login\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        MMSItems.searchMMSModule(driver).sendKeys("MMS");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > section:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(8) > div:nth-child(1) > div:nth-child(2)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
    }

    @And("The Pharma Doctor Select OPEmergency Station")
    public void thePharmaDoctorSelectOPEmergencyStation() {
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        Select selStation = new Select(MMSItems.stationID(driver));
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        selStation.selectByValue("18");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btnSwap\").click()");
    }

    @And("The Pharma Doctor Opining ER Screen")
    public void thePharmaDoctorOpiningERScreen() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#mainMenuIssue\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#mnuERPayLaterIssues\").click()");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("document.body.style.zoom='0.8'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
    }



    @And("The Pharma Doctor Opining Detail Screen")
    public void thePharmaDoctorOpiningDetailScreen() {
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".OPERBillcls\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("var dispensingDoctor = document.getElementById('s2id_DisDoctorList');$(dispensingDoctor).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        MMSItems.dispensingDoctor(driver).sendKeys("AHMED ALI ALTHOBAITI");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        MMSItems.dispensingDoctor(driver).sendKeys(Keys.ENTER);
    }

    @And("The pharma Doctor Dispensing Order")
    public void thePharmaDoctorDispensingOrder() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        MMSItems.clearZero(driver).clear();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        MMSItems.clearZero(driver).sendKeys("2");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        MMSItems.clearZero1(driver).clear();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        MMSItems.clearZero1(driver).sendKeys("2");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btnSave\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".btn.btn-success\").click()");
        ///click Close///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btnClose\")");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
    }

    @And("The Pharma Doctor Dispensing One Item")
    public void thePharmaDoctorDispensingOneItem() {
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("document.body.style.zoom='0.8'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"tbody tr:nth-child(1) td:nth-child(12) button:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("var dispensingDoctor = document.getElementById('s2id_DisDoctorList');$(dispensingDoctor).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        MMSItems.dispensingDoctor(driver).sendKeys("AHMED ALI ALTHOBAITI");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        MMSItems.dispensingDoctor(driver).sendKeys(Keys.ENTER);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(5) > div:nth-child(7) > form:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(26) > span:nth-child(1) > input:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        MMSItems.clearZero(driver).clear();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        MMSItems.clearZero(driver).sendKeys("2");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btnRemove\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".btn.btn-success\").click()");
        ///click Close///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btnClose\")");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
    }

    @And("The Pharma Doctor Bill The PARTIAL DISPENSE Item")
    public void thePharmaDoctorBillThePARTIALDISPENSEItem() {
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("document.body.style.zoom='0.8'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"tbody tr:nth-child(1) td:nth-child(15) button:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#dialogYes_ForOrder\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(15));
        js3.executeScript("document.body.style.zoom='0.7'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".PresDtlClass\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(20));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(21) > div:nth-child(1) > button:nth-child(2)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#Save\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#dialogYes\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#BilldialogYes\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
    }

    @And("The Pharma Doctor Bill The PARTIAL DISPENSE Item2")
    public void thePharmaDoctorBillThePARTIALDISPENSEItem2() {
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("document.body.style.zoom='0.8'");
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"tbody tr:nth-child(1) td:nth-child(12) button:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("var dispensingDoctor = document.getElementById('s2id_DisDoctorList');$(dispensingDoctor).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        MMSItems.dispensingDoctor(driver).sendKeys("AHMED ALI ALTHOBAITI");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        MMSItems.dispensingDoctor(driver).sendKeys(Keys.ENTER);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        MMSItems.clearZero(driver).clear();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        MMSItems.clearZero(driver).sendKeys("2");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(5) > div:nth-child(7) > form:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(25) > a:nth-child(1) > span:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btnSave\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".btn.btn-success\").click()");
        ///click Close///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btnClose\")");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ///bill PARTIAL DISPENSE QTY item///
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("document.body.style.zoom='0.8'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"tbody tr:nth-child(1) td:nth-child(15) button:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#dialogYes_ForOrder\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(15));
        js5.executeScript("document.body.style.zoom='0.7'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".PresDtlClass\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(20));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(21) > div:nth-child(1) > button:nth-child(2)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#Save\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#dialogYes\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#BilldialogYes\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
    }

    @Then("The Pharma Doctor Close The MMS Module")
    public void thePharmaDoctorCloseTheMMSModule() {
        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        js6.executeScript("document.body.style.zoom='0.8'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        driver.quit();
    }
}
