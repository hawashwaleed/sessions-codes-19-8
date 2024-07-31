package StepDefinition;

import PackageLocator.P01_RegistrationPage;
import PackageLocator.P02_OutPatientBillingPage;
import PackageLocator.P09_OutPatientChargingPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static StepDefinition.Hooks.driver;

public class T09_BillOrderStepDefinition {

    P01_RegistrationPage UnknownNewFile = new P01_RegistrationPage();
    P02_OutPatientBillingPage NewUnknownBill = new P02_OutPatientBillingPage();

    P09_OutPatientChargingPage BillDoctorOrder = new P09_OutPatientChargingPage();

    Actions orderList = new Actions(driver);

    @Given("Reception Team Opening The Out Patient Charging Screen")
    public void ReceptionTeamOpeningTheOutPatientChargingScreen(){
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

    @And("Reception Team Searching By MRN")
    public void receptionTeamSearchingByMRN() {
        NewUnknownBill .mrnInfo(driver).sendKeys("0001840283" + Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'");
    }

    @And("Reception Team Select The Doctor Request Tab")
    public void receptionTeamSelectTheDoctorRequestTab() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('cd_btn_ok').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('btn_scanval_cancel').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[role='tab'][href='#tabopbdoctorreq']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
    }

    @And("Reception Team Select The Doctor Lab Items And Generated Bill")
    public void ReceptionTeamSelectTheDoctorLabItemsAndGeneratedBill() {
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

    @And("Reception Team Refreshing The Out Patient Charging Screen")
    public void receptionTeamRefreshingTheOutPatientChargingScreen() {
        driver.navigate().to(driver.getCurrentUrl());
    }

    @And("Reception Team Searching By The Same MRN for Discharge The XRay Items")
    public void receptionTeamSearchingByTheSameMRNForDischargeTheXRayItems() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        NewUnknownBill .mrnInfo(driver).sendKeys("0001840283" + Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'");
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

    @Then("Reception Team close The Front Office Module")
    public void receptionTeamCloseTheFrontOfficeModule() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        driver.quit();
    }
}
