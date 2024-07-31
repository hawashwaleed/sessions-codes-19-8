package StepDefinition;

import PackageLocator.P04_ERDoctorPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

import static StepDefinition.Hooks.driver;

public class T04_ApprovePayLaterERDoctorStepDefinition {



    P04_ERDoctorPage PayLaterApprove = new P04_ERDoctorPage();

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));


    @Given("ER Doctor login With Valid Privilege")
    public void ERDoctorloginWithValidPrivilege (){
        driver.navigate().to("http://130.1.2.33/HISLOGIN/Login?ReturnUrl=%2fHISDM4%2fDM%2fMain");
        PayLaterApprove.ERDousername(driver).sendKeys("20210576");
        PayLaterApprove.ERDOpassword(driver).sendKeys("20210576N");
        PayLaterApprove.ERDOloginButton(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(7));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('text-center')[0].click()");
    }

    @And("ER Doctor Select The Unknown Patient From Pay Later Tab")
    public void erDoctorSelectTheUnknownPatientFromPayLaterTab() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        PayLaterApprove.ERSelectPayLaterPatient(driver).click();
    }

    @And("ER Doctor click Approval Button")
    public void erDoctorClickApprovalButton() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.7'");
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('confirm')[0].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('confirm')[0].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));

    }


    @And("ER Doctor Select The Visit")
    public void erDoctorSelectTheVisit() {
        ///click the seen button///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('btn btn-primary btn-sm btn-notf')[10].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ///select the visit row///
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#tbl_cpoe_old_er tbody>tr>td:nth-child(6)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".confirm\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("document.body.style.zoom='0.7'");
    }

    @And("ER Doctor Edit the Descriptions In The Visit")
    public void erDoctorEditTheDescriptionsInTheVisit() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".cancel\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('_ptwt _i_entry')[1].value='100'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('_ptht _i_entry')[1].value='100'");
        ///Select ER Department///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        Select listDepartment = new Select(PayLaterApprove.ERDropListDepartment(driver));
        listDepartment.selectByIndex(1);
        ///chief complain///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('txtchief').value='test'");
        ///CLINICAL WARNING///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[href='#tclinwarn']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"div[class='panel panel-primary'] div[class='panel-body'] div[class='col-sm-12'] ins[class='iCheck-helper']\").click()");
        ///Allergy///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[href='#tallergy']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"div[class='_chk_0_aller'] ins[class='iCheck-helper']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"div[class='_chk_5_aller'] ins[class='iCheck-helper']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(20) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(7) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(5) > label:nth-child(1) > div:nth-child(1)\").click()");
        ///PHYSICAL EXAM///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[href='#tphysical']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ///Physical Review List///
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"._phy_desc._phy_desc_2842.form-control._tr_sel2_2842._enlargetxt._phy_examdef_2841\").value='Normal'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"._phy_desc._phy_desc_2843.form-control._tr_sel2_2843._enlargetxt._phy_examdef_2841\").value='Normal'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"._phy_desc._phy_desc_2844.form-control._tr_sel2_2844._enlargetxt._phy_examdef_2841\").value='Normal'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"._phy_desc._phy_desc_2845.form-control._tr_sel2_2845._enlargetxt._phy_examdef_2841\").value='Normal'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"._phy_desc._phy_desc_2846.form-control._tr_sel2_2846._enlargetxt._phy_examdef_2841\").value='Normal'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"._phy_desc._phy_desc_2847.form-control._tr_sel2_2847._enlargetxt._phy_examdef_2841\").value='Normal'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"._phy_desc._phy_desc_2848.form-control._tr_sel2_2848._enlargetxt._phy_examdef_2841\").value='Normal'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"._phy_desc._phy_desc_2849.form-control._tr_sel2_2849._enlargetxt._phy_examdef_2841\").value='Normal'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));

        ///Diagnosis///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[href='#tdiagnosis']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ///Provisional Diagnosis///
        ((JavascriptExecutor) driver).executeScript("var origenalList = document.getElementById('s2id_txticdsearchprov');$(origenalList).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ///edit the Diagnosis///
        PayLaterApprove.diagnosisList(driver).sendKeys("A00.1");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        PayLaterApprove.diagnosisList(driver).sendKeys(Keys.ARROW_DOWN);
        PayLaterApprove.diagnosisList(driver).sendKeys(Keys.RETURN);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("var origenalList = document.getElementById('s2id_txticdsearchprov');$(origenalList).select2('close');");

        ///ICD Button///
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn btn-danger btn-xs'][normalize-space()='Select ICD 10'])[1]")));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(7));
//        Actions builder = new Actions(driver);
//        WebElement searchBox = driver.findElement(By.cssSelector("div[id='select2-drop'] div[class='select2-search'] input"));
//        searchBox.sendKeys("A00.1");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(7));
//        builder.sendKeys(Keys.ARROW_DOWN).perform();
//        builder.sendKeys(Keys.RETURN).perform();
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(7));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-success'] span[class='glyphicon glyphicon-ok']\").click()");
        ///CPOE///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(20) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1) > b:nth-child(1)\").click()");
//      ///Medication Tab///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_tmeds\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        /// 5 Medication items///
        ///item number 1///
//        ((JavascriptExecutor) driver).executeScript("var MedicationlList = document.getElementById('s2id__meds_search_cpoe');$(MedicationlList).select2('open');");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
//        PayLaterApprove.ERMedicationList(driver).sendKeys("P15ACCUC16");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
//        PayLaterApprove.ERMedicationList(driver).sendKeys(Keys.ENTER);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_qty\").value='1'");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
//        Select frequencyList = new Select(PayLaterApprove.frequency(driver));
//        frequencyList.selectByIndex(3);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_dur\").value='1'");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        Select startDuration = new Select(PayLaterApprove.startMonth(driver));
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        startDuration.selectByIndex(1);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_reasondupli\").value='test'");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        Select selDiagnoses = new Select(PayLaterApprove.activeDiagnoses(driver));
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        selDiagnoses.selectByIndex(1);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_add_presc\").click()");
        ///item number 2 ///
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
//        ((JavascriptExecutor) driver).executeScript("var MedicationlList = document.getElementById('s2id__meds_search_cpoe');$(MedicationlList).select2('open');");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
//        PayLaterApprove.ERMedicationList(driver).sendKeys("P05ACCLO1F");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
//        PayLaterApprove.ERMedicationList(driver).sendKeys(Keys.ENTER);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_qty\").value='1'");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
//        Select frequencyList1 = new Select(PayLaterApprove.frequency(driver));
//        frequencyList1.selectByIndex(3);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_dur\").value='1'");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
//        Select startDuration1 = new Select(PayLaterApprove.startMonth(driver));
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        startDuration1.selectByIndex(1);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_reasondupli\").value='test'");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        Select selDiagnoses1 = new Select(PayLaterApprove.activeDiagnoses(driver));
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        selDiagnoses1.selectByIndex(1);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_add_presc\").click()");
        ///item number 3 ///
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
//        ((JavascriptExecutor) driver).executeScript("var MedicationlList = document.getElementById('s2id__meds_search_cpoe');$(MedicationlList).select2('open');");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
//        PayLaterApprove.ERMedicationList(driver).sendKeys("PP02ACETA1T");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
//        PayLaterApprove.ERMedicationList(driver).sendKeys(Keys.ENTER);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_qty\").value='1'");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
//        Select frequencyList2 = new Select(PayLaterApprove.frequency(driver));
//        frequencyList2.selectByIndex(3);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_dur\").value='1'");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        Select startDuration2 = new Select(PayLaterApprove.startMonth(driver));
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        startDuration2.selectByIndex(1);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_reasondupli\").value='test'");
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        Select selDiagnoses2 = new Select(PayLaterApprove.activeDiagnoses(driver));
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        selDiagnoses2.selectByIndex(1);
//        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_add_presc\").click()");
        ///item number 4///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("var MedicationlList = document.getElementById('s2id__meds_search_cpoe');$(MedicationlList).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        PayLaterApprove.ERMedicationList(driver).sendKeys("P15ACCUC15+");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        PayLaterApprove.ERMedicationList(driver).sendKeys(Keys.ENTER);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_qty\").value='1'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        Select frequencyList3 = new Select(PayLaterApprove.frequency(driver));
        frequencyList3.selectByIndex(3);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_dur\").value='1'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        Select startDuration3 = new Select(PayLaterApprove.startMonth(driver));
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        startDuration3.selectByIndex(1);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_reasondupli\").value='test'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        Select selDiagnoses3 = new Select(PayLaterApprove.activeDiagnoses(driver));
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        selDiagnoses3.selectByIndex(1);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_add_presc\").click()");
        ///item number 5///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("var MedicationlList = document.getElementById('s2id__meds_search_cpoe');$(MedicationlList).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        PayLaterApprove.ERMedicationList(driver).sendKeys("P16ACCUF1+");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        PayLaterApprove.ERMedicationList(driver).sendKeys(Keys.ENTER);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_qty\").value='1'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        Select frequencyList4 = new Select(PayLaterApprove.frequency(driver));
        frequencyList4.selectByIndex(3);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_dur\").value='1'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        Select startDuration4 = new Select(PayLaterApprove.startMonth(driver));
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        startDuration4.selectByIndex(1);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_reasondupli\").value='test'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        Select selDiagnoses4 = new Select(PayLaterApprove.activeDiagnoses(driver));
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        selDiagnoses4.selectByIndex(1);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_meds_add_presc\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ///Order Set///
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[href='#_orderset_tab']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"tr[class='_orderset_lst_tr_13'] td:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ///investigation Order///
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"._rad_reglr._chk_ordall_0._chk_ordall_3\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(20) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(7) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(3) > button:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".confirm\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(4));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".confirm\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(4));
        ///investigation Tab///
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_tinvest\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ///XRay items Remarks///
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_labremarks_1378\").value='Test'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_labremarks_11\").value='Test'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ///Final Save///
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"div[id='t_n_cpoe'] button[class='btn btn-success _dc_fin_sv']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div.sweet-alert.visible.showSweetAlert > button.confirm\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(4));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".confirm\").click()");
    }

    @Then("ER Doctor Close The Visit")
    public void erDoctorCloseTheVisit() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(4));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn-close-main\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(4));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".confirm\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        driver.quit();
    }

}
