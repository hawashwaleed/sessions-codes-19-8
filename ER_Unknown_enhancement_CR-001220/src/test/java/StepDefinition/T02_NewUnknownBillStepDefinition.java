package StepDefinition;

import PackageLocator.P01_RegistrationPage;
import PackageLocator.P02_OutPatientBillingPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static StepDefinition.Hooks.driver;
import static org.apache.commons.io.FileUtils.waitFor;


public class T02_NewUnknownBillStepDefinition {

    P01_RegistrationPage UnknownNewFile = new P01_RegistrationPage();
    P02_OutPatientBillingPage NewUnknownBill = new P02_OutPatientBillingPage();


    Actions action = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(10));


    @Given("user search by the screen Out Patient Charging name")
    public void userSearchByTheScreenOutPatientChargingName() {
        //        driver = new ChromeDriver();
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
    }

    @And("User Open The Out Patient Charging screen")
    public void userOpenTheOutPatientChargingScreen() {
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

    @And("user edit the MRN")
    public void userEditTheMRN() {
        NewUnknownBill .mrnInfo(driver).sendKeys("1840291" + Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'");
    }

    @And("user click the Proceed to Billing button")
    public void userClickTheProceedToBillingButton() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('cd_btn_ok').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('btn_scanval_cancel').click()");
    }

    @And("user select the doctor")
    public void userSelectTheDoctor() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        NewUnknownBill.editSearchNameDo(driver).sendKeys("ER87 - NADA JAMAL ABDULQADER (تيست)");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        NewUnknownBill.searchDoctor(driver).sendKeys(Keys.ENTER);

        List<WebElement> tableDoctor = driver.findElements(By.cssSelector("div[id='ConsultationDoctorList_wrapper'] div[class='dataTables_scrollBody'] td:nth-child(1)"));
        String searshName = "ER87 - NADA JAMAL ABDULQADER (تيست)";
        for (int roIndex = 0; roIndex<tableDoctor.size();roIndex++)
        {
            WebElement rowNew = tableDoctor.get(roIndex);
            List<WebElement> filterTdDoctor = tableDoctor.stream().filter(tableDocto->tableDocto.getText().contains("ER87 - NADA JAMAL ABDULQADER (تيست)")).collect(Collectors.toList());
            for (WebElement callNew:filterTdDoctor )
            {
                if (callNew.getText().equals(searshName))
                {
                    System.out.println(rowNew.getText());
                    List<WebElement> rowDo = driver.findElements(By.cssSelector("body > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1)"));
                    for (WebElement dfiDo : rowDo) {
                        NewUnknownBill.doubleClickWithJSExecutor(dfiDo);
                    }

                    break;
                }
            }
        }
    }

    @And("user click on proceed button")
    public void userClickOnProceedButton() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('btnProceedWaiting').click()");
    }

    @And("user select the billing tap")
    public void userSelectTheBillingTap() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[role='tab'][href='#tabopbbilling']\").click()");
    }

    @And("user click the PREPARE BILL button")
    public void userClickThePREPAREBILLButton() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(6));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".bootbox-close-button.close\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('opbillpreparebill').click()");
    }

    @And("user click the cash charge icon")
    public void userClickTheCashChargeIcon() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('_opbillmopcash').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
    }

    @And("user click the Ok alert message")
    public void userClickTheOkAlertMessage() {
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('btn btn-info btn-sm')[0].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
    }

    @Then("user make sure the system generated Number of bill and close FO")
    public void userMakeSureTheSystemGeneratedNumberOfBillAndCloseFO() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('btn btn-info btn-sm')[0].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('btnInvoiceModalClose').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('btn btn-default btn-sm bootbox-cancel')[0].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        driver.close();
        driver.quit();
    }

}


