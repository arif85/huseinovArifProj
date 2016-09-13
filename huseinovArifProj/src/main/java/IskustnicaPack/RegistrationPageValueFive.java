package IskustnicaPack;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegistrationPageValueFive {


    WebDriver driver;
    Logger log;

    public RegistrationPageValueFive(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = ".//img[@src='/images/10.gif']")
    WebElement registrationPageLoaded;
    @FindBy(xpath = ".//input[@value='4']")
    WebElement deliveryType;
    @FindBy(name = "family")
    WebElement familia;
    @FindBy(name = "name")
    WebElement imia;
    @FindBy(name = "father")
    WebElement otchestvo;
    @FindBy(name = "date")
    WebElement den;
    @FindBy(name = "month")
    WebElement mesiac;
    @FindBy(name = "year")
    WebElement god;
    @FindBy(name = "email")
    WebElement pochta;
    @FindBy(name = "pass")
    WebElement parol;
    @FindBy(name = "repass")
    WebElement povtoriteParol;
    @FindBy(name = "phone[mobil]")
    WebElement mobilniyTelefon;
    @FindBy(name = "postindex")
    WebElement pochtoviyIndex;
    @FindBy(name = "otheraddr[country]")
    WebElement stranaOblastKray;
    @FindBy(name = "city")
    WebElement gorod;
    @FindBy(name = "otheraddr[street]")
    WebElement ulica;
    @FindBy(name = "otheraddr[house]")
    WebElement domNomer;
    @FindBy(name = "otheraddr[corp]")
    WebElement korpusNomerIliProcherkEsliNet;
    @FindBy(name = "otheraddr[build]")
    WebElement stroyeniyeNomerIliProcherkEsliNet;
    @FindBy(name = "otheraddr[flat]")
    WebElement adresDopolnitelniy;
    @FindBy(xpath = ".//input[@value='<< Далее/Enter >>']")
    WebElement knopkaDaleeEnter;
    @FindBy(xpath = ".//input[@value='Регистрировать']")
    WebElement knopkaRegistirovat;



    public boolean IsRegistrationPageLoaded() {

        try {
            boolean isRegistationFormLoad = registrationPageLoaded.isDisplayed();
            return isRegistationFormLoad;
        } catch (Exception e) {
            log.info("Registration page was not loaded");
            Assert.fail("Registration page was not loaded");
            return false;
        }

    }

    public void selectDeliveryTypePochtoyRossiiKuryeromVRegioniChastniyDom() {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            deliveryType.click();
            log.info("Delivery type 'Pochtoy Rossii Kuryerom V Regioni Chastniy Dom' (radio button) was selected");
        } catch (Exception e) {
            log.error("Delivery type 'Pochtoy Rossii Kuryerom V Regioni Chastniy Dom' (radio button)  was not selected");
            Assert.fail("Delivery type 'Pochtoy Rossii Kuryerom V Regioni Chastniy Dom' (radio button)  was not selected");
        }
    }

    public void inputTextIntoFamiliaField(String familya) {
        try {
            familia.clear();
            familia.sendKeys(familya);
            log.info(familya + " was inputed");
        } catch (Exception e) {
            log.info("Familia was not inputed");
            Assert.fail("Familia was not inputed");
        }
    }

    public void inputTextIntoImiaField(String imya) {
        try {
            imia.clear();
            imia.sendKeys(imya);
            log.info(imya + " was inputed");
        } catch (Exception e) {
            log.info("Imia was not inputed");
            Assert.fail("Imia was not inputed");
        }
    }

    public void inputTextIntoOtchestvoField(String ot4hestvo) {
        try {
            otchestvo.clear();
            otchestvo.sendKeys(ot4hestvo);
            log.info(ot4hestvo + " was inputed");
        } catch (Exception e) {
            log.info("Otchestvo was not inputed");
            Assert.fail("Otchestvo was not inputed");
        }
    }

    public void selectDropDownDen(String day) {
        try {
            Select select = new Select(den);
            select.selectByVisibleText(day);
            log.info(day + " was selected");
        } catch (Exception e) {
            log.info("Failed to select den");
            Assert.fail("Failed to select den");
        }
    }

    public void selectDropDoenMesiac(String month) {
        try {
            Select select = new Select(mesiac);
            select.selectByVisibleText(month);
            log.info(month + " was selected");
        } catch (Exception e) {
            log.info("Failed to select mesiac");
            Assert.fail("Failed to select mesiac");
        }
    }

    public void selectDropDownGod(String year) {
        try {
            Select select = new Select(god);
            select.selectByVisibleText(year);
            log.info(year + " was selected");
        } catch (Exception e) {
            log.info("Failed to select god");
            Assert.fail("Failed to select god");
        }
    }

    public void inputTextIntoPochtaField(String mail) {
        try {
            pochta.clear();
            pochta.sendKeys(mail);
            log.info(mail + " was inputed");
        } catch (Exception e) {
            log.info("Pochta was not inputed");
            Assert.fail("Pochta was not inputed");
        }
    }

    public void inputTextIntoParolField(String pass) {
        try {
            parol.clear();
            parol.sendKeys(pass);
            log.info(pass + " was inputed");
        } catch (Exception e) {
            log.info("Parol was not inputed");
            Assert.fail("Parol was not inputed");
        }
    }

    public void inputTextIntoPovtoriteParolField(String repass) {
        try {
            povtoriteParol.clear();
            povtoriteParol.sendKeys(repass);
            log.info(repass + " was inputed");
        } catch (Exception e) {
            log.info("Povtorite parol was not inputed");
            Assert.fail("Povtorite parol was not inputed");
        }
    }

    public void inputTextIntoTelefonMobilniyField(String cellphone) {
        try {
            mobilniyTelefon.clear();
            mobilniyTelefon.sendKeys(cellphone);
            log.info(cellphone + " was inputed");
        } catch (Exception e) {
            log.info("Telefon mobilniy was not inputed");
            Assert.fail("Telefon mobilniy was not inputed");
        }
    }

    public void inputTextIntoPochtoviyIndexField(String postIndex) {
        try {
            pochtoviyIndex.clear();
            pochtoviyIndex.sendKeys(postIndex);
            log.info(postIndex + " was inputed");
        } catch (Exception e) {
            log.info("Pochtoviy index was not inputed");
            Assert.fail("Pochtoviy index was not inputed");
        }
    }

    public void inputTextIntoStranaOblastKrayField(String region) {
        try {
            stranaOblastKray.clear();
            stranaOblastKray.sendKeys(region);
            log.info(region + " was inputed");
        } catch (Exception e) {
            log.info("Strana, oblast, kray were not inputed");
            Assert.fail("Strana, oblast, kray were not inputed");
        }
    }

    public void inputTextIntoGorodField(String city) {
        try {
            gorod.clear();
            gorod.sendKeys(city);
            log.info(city + " was inputed");
        } catch (Exception e) {
            log.info("Gorod was not inputed");
            Assert.fail("Gorod was not inputed");
        }
    }

    public void inputTextintoUlicaField(String street) {
        try {
            ulica.clear();
            ulica.sendKeys(street);
            log.info(street + " was inputed");
        } catch (Exception e) {
            log.info("Gorod was not inputed");
            Assert.fail("Gorod was not inputed");
        }
    }

    public void inputTextIntoDomField(String  houseNumber) {
        try{
            domNomer.clear();
            domNomer.sendKeys(houseNumber);
            log.info(houseNumber+" was inputed");
        }catch (Exception e ){
            log.info("Dom(nomer) was not inputed");
            Assert.fail("Dom(nomer) was not inputed");
        }
    }

    public void inputTextIntoKorpusField(String corpus) {
        try{
            korpusNomerIliProcherkEsliNet.clear();
            korpusNomerIliProcherkEsliNet.sendKeys(corpus);
            log.info(corpus+" was inputed");
        }catch (Exception e){
            log.info("Korpus was not inputed");
            Assert.fail("Korpus was not inputed");
        }
    }

    public void inputTextIntoStroyeniyeField(String building) {
        try{
            stroyeniyeNomerIliProcherkEsliNet.clear();
            stroyeniyeNomerIliProcherkEsliNet.sendKeys(building);
            log.info(building+ "was inputed");
        }catch (Exception e){
            log.info("Stroyeniye was not inputed");
            Assert.fail("Stroyeniye was not inputed");
        }
    }

    public void inputTextIntoDopolnitelniyAdresField(String addressExtra) {
        try{
            adresDopolnitelniy.clear();
            adresDopolnitelniy.sendKeys(addressExtra);
            log.info(addressExtra+" was inputed");
        }catch (Exception e){
            log.info("Adres Dopolnitelniy was not inputed");
            Assert.fail("Adres Dopolnitelniy was not inputed");
        }
    }

    public void clickButtonDaleeEnter(){
        try{
            knopkaDaleeEnter.click();
            log.info("Button '<< Dalee/Enter >>' was clicked");
        }catch(Exception e ){
            log.error("Failed to click button'<< Dalee/Enter >>");
            Assert.fail("Failed to click button'<< Dalee/Enter >>");
        }
    }
    public void clickButtonRegistirovat(){
        try{
            knopkaRegistirovat.click();
            log.info("Button 'Registrirovat' was clicked");
        }catch(Exception e){
            log.error("Failed to click button'Registrirovat");
            Assert.fail("Failed to click button'Registrirovat");
        }
    }
}
