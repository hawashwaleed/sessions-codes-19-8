package StepDefinition;

import PackageLocator.P01_RegistrationPage;
import PackageLocator.P08_MRDPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static StepDefinition.Hooks.driver;

public class T08_FillDataInfoForUnknownPatientStepDefinition {

    P01_RegistrationPage UnknownNewFile = new P01_RegistrationPage();
    P08_MRDPage MRDFillDataInfo = new P08_MRDPage();

    Actions dropDownList = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));




    @Given("MRD Team Opening The MRD Module")
    public void MRDTeamOpeningTheMRDModule(){
        driver.navigate().to("http://130.1.2.33/HISLOGIN/Login");
        UnknownNewFile .username(driver).sendKeys("1824046");
        UnknownNewFile .password(driver).sendKeys("EXPIRED");
        UnknownNewFile .loginButton(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        MRDFillDataInfo.searchMRDModule(driver).sendKeys("MEDICAL REPORTS DEPARTMENT");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        MRDFillDataInfo.selectMRdModule(driver).click();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
    }

    @And("MRD Team Opening The Patient Registration Screen")
    public void mrdTeamOpeningThePatientRegistrationScreen() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.7'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > nav:nth-child(2) > div:nth-child(4) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[href='/HISMRD/MRD/File/Patient_Registration']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom='0.7'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));

    }

    @And("MRD Team Searching By MRN")
    public void mrdTeamSearchingByMRN() {
        MRDFillDataInfo.searchByMRN(driver).sendKeys("1840283");
        MRDFillDataInfo.searchByMRN(driver).sendKeys(Keys.ENTER);
    }

    @And("MRD Team Edit The Patient Basic Information")
    public void mrdTeamEditThePatientBasicInformation() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        ///titleList///
        ((JavascriptExecutor) driver).executeScript("var titlelist = document.getElementById('s2id_pbi_txt_title');\n" +
                "$(\"#s2id_pbi_txt_title\").select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        MRDFillDataInfo.titleList(driver).sendKeys("MR");
        MRDFillDataInfo.titleList(driver).sendKeys(Keys.ARROW_DOWN);
        MRDFillDataInfo.titleList(driver).sendKeys(Keys.RETURN);
        ///Marital Status///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("var titlelist = document.getElementById('s2id_pbi_txt_Marital_Status');\n" +
                "$(\"#s2id_pbi_txt_Marital_Status\").select2('open');");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        MRDFillDataInfo.MaritalList(driver).sendKeys("Married");
        MRDFillDataInfo.MaritalList(driver).sendKeys(Keys.ARROW_DOWN);
        MRDFillDataInfo.MaritalList(driver).sendKeys(Keys.RETURN);
        ///Date Of Birth///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#pbi_txt_dob\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        Select birthList = new Select(MRDFillDataInfo.dateOfBirth(driver));
        birthList.selectByIndex(20);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"body > div:nth-child(22) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4)\").click()");
        ///Gender///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("var titlelist = document.getElementById('s2id_pbi_txt_sex');\n" +
                "$(\"#s2id_pbi_txt_sex\").select2('open');");
        MRDFillDataInfo.genderList(driver).sendKeys("Female");
        MRDFillDataInfo.genderList(driver).sendKeys(Keys.ARROW_DOWN);
        MRDFillDataInfo.genderList(driver).sendKeys(Keys.RETURN);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#pbi_txt_maiden_name\").value='test'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#pbi_txt_father_name\").value='test'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#pbi_txt_family_name\").value='test'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#pbi_txt_middle_name\").value='test'");
        ///Residential address///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[href='#Residential_Address']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#ra_txt_mobile\").value='0504800001'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#ra_txt_iqama_no\").value='2155044410'");
        ///Nationality///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("var nationalitylist = document.getElementById('s2id_ra_txt_nationality');\n" +
                "$(\"#s2id_ra_txt_nationality\").select2('open');");
        MRDFillDataInfo.nationalityList(driver).sendKeys("Egyptian");
        MRDFillDataInfo.nationalityList(driver).sendKeys(Keys.ARROW_DOWN);
        MRDFillDataInfo.nationalityList(driver).sendKeys(Keys.RETURN);
        ///religion///
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("var religionlist = document.getElementById('s2id_ra_txt_religion');\n" +
                "$(\"#s2id_ra_txt_religion\").select2('open');");
        MRDFillDataInfo.religionList(driver).sendKeys("Islam");
        MRDFillDataInfo.religionList(driver).sendKeys(Keys.ARROW_DOWN);
        MRDFillDataInfo.religionList(driver).sendKeys(Keys.RETURN);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ///contact details///
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"a[href='#Contact_Details']\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#cd_txt_phone\").value='0504800001'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#cd_txt_Cell_Number\").value='0504800001'");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        ///save button///
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#btn_save\").click()");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
    }


    @Then("MRD Team Close The MRD Module")
    public void mrdTeamCloseTheMRDModule() {
        driver.quit();
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
    }
}
