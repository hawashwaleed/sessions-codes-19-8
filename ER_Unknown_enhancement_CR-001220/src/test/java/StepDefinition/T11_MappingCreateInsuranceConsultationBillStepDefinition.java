package StepDefinition;

import PackageLocator.P01_RegistrationPage;
import PackageLocator.P02_OutPatientBillingPage;
import PackageLocator.P11_OutPatientChargingPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static StepDefinition.Hooks.driver;

public class T11_MappingCreateInsuranceConsultationBillStepDefinition {

    P01_RegistrationPage UnknownNewFile = new P01_RegistrationPage();
    P02_OutPatientBillingPage NewUnknownBill = new P02_OutPatientBillingPage();

    P11_OutPatientChargingPage InsuranceBill = new P11_OutPatientChargingPage();

    @Given("Reception Team Searching For the screen Out Patient Charging name")
    public void receptionTeamSearchingForTheScreenOutPatientChargingName() {
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

    @And("Reception Team Open The Out Patient Charging screen")
    public void receptionTeamOpenTheOutPatientChargingScreen() {
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

    @And("User Edit The MRN")
    public void userEditTheMRN() {
        InsuranceBill.editMRN(driver).sendKeys("1840290" + Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'");
    }

    @And("Reception Team click the Proceed to Billing button")
    public void receptionTeamClickTheProceedToBillingButton() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('cd_btn_ok').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-default btn-sm bootbox-cancel']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('btn_scanval_cancel').click()");
    }


    @And("Reception Team select the doctor")
    public void receptionTeamSelectTheDoctor() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        NewUnknownBill.editSearchNameDo(driver).sendKeys("ER87 - NADA JAMAL ABDULQADER (تيست)");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
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

    @And("Reception Team click on proceed button")
    public void receptionTeamClickOnProceedButton() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('btnProceedWaiting').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-info btn-sm']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-default btn-sm bootbox-cancel']\").click()");

    }

    @And("Reception Team select the billing tap")
    public void receptionTeamSelectTheBillingTap() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(15));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[role='tab'][href='#tabopbbilling']\").click()");

    }

    @And("Reception Team click the PREPARE BILL button")
    public void receptionTeamClickThePREPAREBILLButton() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(15));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".bootbox-close-button.close\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(15));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('opbillpreparebill').click()");

    }

    @And("Reception Team click the cash charge icon")
    public void receptionTeamClickTheCashChargeIcon() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('_opbillmopcash').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));

    }

    @And("Reception Team click the Ok alert message")
    public void receptionTeamClickTheOkAlertMessage() {
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('btn btn-info btn-sm')[0].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(20));

    }

    @Then("Reception Team make sure the system generated Number of bill and close FO")
    public void receptionTeamMakeSureTheSystemGeneratedNumberOfBillAndCloseFO() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(20));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('btn btn-info btn-sm')[0].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(20));
        ((JavascriptExecutor) driver).executeScript("document.getElementById('btnInvoiceModalClose').click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(20));
        ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('btn btn-default btn-sm bootbox-cancel')[0].click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        driver.close();
        driver.quit();
    }
}
