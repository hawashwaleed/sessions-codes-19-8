package StepDefinition;

import PackageLocator.*;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static StepDefinition.Hooks.driver;

public class T13_MappingInsuranceBillOrderStepDefinition {
    P01_RegistrationPage UnknownNewFile = new P01_RegistrationPage();
    P02_OutPatientBillingPage NewUnknownBill = new P02_OutPatientBillingPage();


    P13_OutPatientChargingInsuranceBill BillInsuranceOrder = new P13_OutPatientChargingInsuranceBill();
    P09_OutPatientChargingPage BillDoctorOrder = new P09_OutPatientChargingPage();
    Actions orderList = new Actions(driver);

    @Given("Reception Team Make The UCAF Approval")
    public void receptionTeamMakeTheUCAFApproval() {
        driver.navigate().to("http://130.1.2.33/HISFRONTOFFICE");
        UnknownNewFile .username(driver).sendKeys("1824046");
        UnknownNewFile .password(driver).sendKeys("EXPIRED");
        UnknownNewFile .loginButton(driver).click();
        BillInsuranceOrder.searchUCAFModule(driver).sendKeys("UCAF APPROVAL");
        BillInsuranceOrder.selectUCAFModule(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("var selectUCAF = document.getElementById('s2id_modulechangestation');$(selectUCAF).select2('open');");
        BillInsuranceOrder.editStation(driver).sendKeys("OP EMERGENCY");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        BillInsuranceOrder.editStation(driver).sendKeys(Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'");
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn_change_station\").click()");
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".btn.btn.btn-success.btn-sm\").click()");
        ///select AR Approval Maintenance screen///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".quick_div.ql_blue[href='/HISUCAF/ARApprovalMaintenance']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("AR Approval Maintenance")) {
                break;
            }
        }
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("document.body.style.zoom='0.8'");
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn_showrequest\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ///search MRN Approval UCAF///
        BillInsuranceOrder.searchUCAFMRN(driver).sendKeys("1840290");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        WebElement itemUCAFApproval = driver.findElement(By.xpath("(//td[@class='text-left sorting_1'])[1]"));
        NewUnknownBill.doubleClickWithJSExecutor(itemUCAFApproval);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(1) > div:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[id='btn_batch_status'] span\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("var  BatchApprovalStatus = document.getElementById('s2id_BatchApprovalStatus');$(BatchApprovalStatus).select2('open');");
        BillInsuranceOrder.approveList(driver).sendKeys("APPROVED" + Keys.ENTER);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#BatchApprovalReferenceNo\").value='760'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#BtnApplyStatus\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn_saverequestchanges\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn btn-info btn-sm']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".btn.btn.btn-success.btn-sm\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(5)\").click()");
        driver.close();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));


    }
    @And("Reception Team Searching For the screen Out Patient Charging")
    public void receptionTeamSearchingForTheScreenOutPatientCharging() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("SAUDI GERMAN HOSPITALS GROUP - Jeddah | Home")) {
                break;
            }
        }
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        driver.navigate().back();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().contains("http://130.1.2.33/HISLOGIN/")) {
                break;
            }
        }
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        BillInsuranceOrder.searchUCAFModule(driver).clear();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        BillInsuranceOrder.searchUCAFModule(driver).sendKeys("Front office");
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > section:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(19) > div:nth-child(1) > div:nth-child(2)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("var  SetStation = document.getElementById('s2id_modulechangestation');$(SetStation).select2('open');");
        BillInsuranceOrder.editStation(driver).sendKeys("OP EMERGENCY");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        BillInsuranceOrder.editStation(driver).sendKeys(Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'");
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn_change_station\").click()");
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".btn.btn.btn-success.btn-sm\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        NewUnknownBill.searchOutPatientChargingScreen(driver).sendKeys("Out Patient Charging");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        NewUnknownBill.openTheOutPatientChargingScreen(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("SAUDI GERMAN HOSPITALS GROUP | Out Patient Charging")) {
                break;
            }
        }
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));

    }



    @And("Reception Team Edit The MRN For The ER Insurance Patient")
    public void ReceptionTeamEditTheMRNForTheERInsurancePatient(){
        BillInsuranceOrder.editMRNInsuranceOrder(driver).sendKeys("1840290" + Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'");
    }


    @And("Reception Team Edit The Same MRN For Discharge The Xray Item")
    public void receptionTeamEditTheSameMRNForDischargeTheXrayItem() {
        BillInsuranceOrder.editMRNInsuranceOrder(driver).sendKeys("1840290" + Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'");
        ///Proceed to Billing button///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('cd_btn_ok').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-default btn-sm bootbox-cancel']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('btn_scanval_cancel').click()");
        ///select The Doctor Request Tab///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('cd_btn_ok').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('btn_scanval_cancel').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[role='tab'][href='#tabopbdoctorreq']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ///select the doctor Xray Order///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("var requestingDoctorElement = document.getElementById('s2id_RequestingDoctor');\n" +
                "$(requestingDoctorElement).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        BillDoctorOrder.doctorList(driver).sendKeys(Keys.ARROW_DOWN);
        BillDoctorOrder.doctorList(driver).sendKeys(Keys.RETURN);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ///select Doctor order LabItems///
        WebElement orderItems = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4)"));
        BillDoctorOrder.doubleClickOrderItems(orderItems);
        ///Charge Selected Item popup///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btnProceedToValidation\").click()");
        ///select bill Tab///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[role='tab'][href='#tabopbbilling']\").click()");
        ///alert message///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        orderList.moveToElement(BillDoctorOrder.popupMessage(driver)).click(BillDoctorOrder.popupMessage(driver)).perform();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-danger btn-sm']\").click()");
        ///prepare bill button///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#opbillpreparebill\").click()");
        ///Mode of Payment///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#_opbillmopcash\").click()");
        ///sure of Making this Bill alert///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-info btn-sm']\").click()");
        ///generate the bill///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(20));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('btn btn-info btn-sm')[0].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(20));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('btnInvoiceModalClose').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(20));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('btn btn-default btn-sm bootbox-cancel')[0].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
    }



}
