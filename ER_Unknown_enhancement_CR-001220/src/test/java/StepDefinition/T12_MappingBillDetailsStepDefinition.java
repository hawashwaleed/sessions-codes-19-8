package StepDefinition;

import PackageLocator.P01_RegistrationPage;
import PackageLocator.P12_OrderMappingScreen;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static StepDefinition.Hooks.driver;

public class T12_MappingBillDetailsStepDefinition {

    P01_RegistrationPage UnknownNewFile = new P01_RegistrationPage();
    P12_OrderMappingScreen OrderMapping = new P12_OrderMappingScreen();

    @Given("Reception Team Opening The Order Mapping Screen")
    public void ReceptionTeamOpeningTheOrderMappingScreen(){
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
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        OrderMapping.searchMappingScreen(driver).sendKeys("OrderMappingScreen");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".quick_div.ql_blue[href='/HISFRONTOFFICE/OrderMappingScreen']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("Order Mapping Screen")) {
                break;
            }
        }
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
    }

    @And("Reception Team Edit The MRN")
    public void receptionTeamEditTheMRN() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.7'");
        OrderMapping.editMRNMapping(driver).sendKeys("1840290" + Keys.ENTER);
    }

    @And("Reception Team Select The From Visit")
    public void receptionTeamSelectTheFromVisit() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("var requestingDoctorVisit = document.getElementById('s2id_fromvisit');$(requestingDoctorVisit).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        OrderMapping.visitFrom(driver).sendKeys("ER87");
        OrderMapping.visitFrom(driver).sendKeys(Keys.ENTER);
    }

    @And("Reception Team Select The To Visit")
    public void receptionTeamSelectTheToVisit() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("var toVisit = document.getElementById('s2id_tovisit');$(toVisit).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        OrderMapping.visitTo(driver).sendKeys("ER87");
        OrderMapping.visitTo(driver).sendKeys(Keys.ENTER);

    }

    @And("Reception Team Select The Reason")
    public void receptionTeamSelectTheReason() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("var reason = document.getElementById('s2id_mappingreason');$(reason).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        OrderMapping.reason(driver).sendKeys("CHARGE TO CASH");
        OrderMapping.reason(driver).sendKeys(Keys.ENTER);


    }

    @And("Reception Team Select The Approved By")
    public void receptionTeamSelectTheApprovedBy() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("var approve = document.getElementById('s2id_mappingapprover');$(approve).select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        OrderMapping.approve(driver).sendKeys("1824046");
        OrderMapping.approve(driver).sendKeys(Keys.ENTER);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#mappingremarks\").value='Test'");

    }

    @Then("Reception Team Save Mapping")
    public void receptionTeamSaveMapping() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn_savechanges\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"button[class='btn btn-info btn-sm']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        driver.quit();

    }
}
