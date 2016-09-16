package IskustnicaPack;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegistrationPageValueFour {
    WebDriver driver;
    Logger log;

    public RegistrationPageValueFour(WebDriver driver) {
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
    WebElement poshtoviyIndex;
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
    WebElement kvartiraNomer;
    @FindBy(name = "adress[add]")
    WebElement adresDopolnitelniy;
    @FindBy(name = "mailing")
    WebElement checkboxPodpiska;
    @FindBy(xpath = ".//input[@value='<< Далее/Enter >>']")
    WebElement knopkaDaleeEnter;
    @FindBy(xpath = ".//input[@value='Регистрировать']")
    WebElement knopkaRegistirovat;

    public boolean isRegistrationPageLoaded() {
        try {
            boolean isRegistrationFormLoad = registrationPageLoaded.isDisplayed();
            return isRegistrationFormLoad;
        } catch (Exception e) {
            log.info("Registartion page was not loaded");
            Assert.fail("Registartion page was not loaded");
            return false;
        }
    }

    public void selectDeliveryPochtoyRossiiKuryeromVRegioniDomSKvartiory() {
        try {
           // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            deliveryType.click();
            log.info("Delivery type 'Pochtoy Rossii Kuryerom V Regioni Dom S Kvartiory' (radio button) was selected");
        } catch (Exception e) {
            log.error("Selection delivery type error");
            Assert.fail("Selection delivery type error");
        }
    }

    public void inputTextIntoFamiliaField(String familiya) {
        try {
            familia.click();
            familia.sendKeys(familiya);
            log.info(familiya + " Familia was inputed");
        } catch (Exception e) {
            log.info("Familia was not inputed");
            Assert.fail("Familia was not inputed");
        }
    }

    public void inputTextIntoImiaField(String imya) {
        try {
            imia.clear();
            imia.sendKeys(imya);
            log.info(imya + " Imia was inputed");
        } catch (Exception e) {
            log.info("Imia was not inputed");
            Assert.fail("Imia was not inputed");
        }
    }

    public void inputTextIntoOtchestvoField(String ot4esvto) {
        try {
            otchestvo.clear();
            otchestvo.sendKeys(ot4esvto);
            log.info(ot4esvto + " Otchestvo was inputed");
        } catch (Exception e) {
            log.info("Otchestvo was not inputed");
            Assert.fail("Otchestvo was not inputed");
        }
    }

    public void selectDropDownDen(String day) {
        try {
            Select select = new Select(den);
            select.selectByVisibleText(day);
            log.info(day + "den was selected");
        } catch (Exception e) {
            log.info("Failed to select den");
            Assert.fail("Failed to select den");
        }
    }

    public void selectDropDownMesiac(String month) {
        try {
            Select select = new Select(mesiac);
            select.selectByVisibleText(month);
            log.info(month + " mesiac was selected");
        } catch (Exception e) {
            log.info("Failed to select mesiac");
            Assert.fail("Failed to select mesiac");
        }
    }

    public void selectDropDownGod(String year) {
        try {
            Select select = new Select(god);
            select.selectByVisibleText(year);
            log.info(year + " god was selected");
        } catch (Exception e) {
            log.info("Failed to select god");
            Assert.fail("Failed to select god");
        }
    }

    public void inputTextIntoPochtaField(String mail) {
        try {
            pochta.clear();
            pochta.sendKeys(mail);
            log.info(mail + " pochta was inputed");
        } catch (Exception e) {
            log.info("Pochta was not inputed");
            Assert.fail("Pochta was not inputed");
        }
    }

    public void inputTexIntoParolField(String passwd) {
        try {
            parol.clear();
            parol.sendKeys(passwd);
            log.info(passwd + " Parol was inputed");
        } catch (Exception e) {
            log.info("Parol was not inputed");
            Assert.fail("Parol was not inputed");
        }
    }

    public void inputTextIntoPovtoriteParolField(String repasswd) {
        try {
            povtoriteParol.clear();
            povtoriteParol.sendKeys(repasswd);
            log.info(repasswd + " Povtorite parol was inputed");
        } catch (Exception e) {
            log.info("Povtorite parol was not inputed");
            Assert.fail("Povtorite parol was not inputed");
        }
    }

    public void inputTextIntoTelefonMobilniyField(String cellphone) {
        try {
            mobilniyTelefon.clear();
            mobilniyTelefon.sendKeys(cellphone);
            log.info(cellphone + " Telefon Mobilnniy was inputed");
        } catch (Exception e) {
            log.info("Telefon Mobilnniy was not inputed");
            Assert.fail("Telefon Mobilnniy was not inputed");
        }
    }

    public void inputTextIntoPochtoviyIndexField(String postIndex) {
        try {
            poshtoviyIndex.clear();
            poshtoviyIndex.sendKeys(postIndex);
            log.info(postIndex + " Pochtoviy index was inputed");
        } catch (Exception e) {
            log.info("Pochtoviy index was not inputed");
            Assert.fail("Pochtoviy index was not inputed");
        }
    }

    public void inputTextIntoStranaOblastKrayField(String region) {
        try {
            stranaOblastKray.clear();
            stranaOblastKray.sendKeys(region);
            log.info(region + " Strana,oblast,region were inputed");
        } catch (Exception e) {
            log.info("Strana,oblast,region were not inputed");
            Assert.fail("Strana,oblast,region were not inputed");
        }
    }

    public void inputTextIntoGorodNaselenniyPunktField(String town) {
        try {
            gorod.clear();
            gorod.sendKeys(town);
            log.info(town + " Gorod was inputed");
        } catch (Exception e) {
            log.info("Gorod was not inputed");
            Assert.fail("Gorod was not inputed");
        }
    }

    public void inputTextIntoUlicaField(String street) {
        try {
            ulica.clear();
            ulica.sendKeys(street);
            log.info(street + " Ulica was inputed");
        } catch (Exception e) {
            log.info("Ulica was not inputed");
            Assert.fail("Ulica was not inputed");
        }
    }

    public void inputTextIntoDomNomerField(String houseNumber) {
        try {
            domNomer.clear();
            domNomer.sendKeys(houseNumber);
            log.info(houseNumber + " Dom(nomer) was inputed");
        } catch (Exception e) {
            log.info("Dom(nomer) was not inputed");
            Assert.fail("Dom(nomer) was not inputed");
        }
    }
    public void inputTextIntoKorpusField(String corpus){
        try{
            korpusNomerIliProcherkEsliNet.clear();
            korpusNomerIliProcherkEsliNet.sendKeys(corpus);
            log.info(corpus+" 'KorpusNomer Ili Procherk Esli Net' was inputed");
        }catch (Exception e){
            log.info("'KorpusNomer Ili Procherk Esli Net' was not inputed");
            Assert.fail("'KorpusNomer Ili Procherk Esli Net' was not inputed");
        }
    }
    public void inputTextIntoStroyeniyeField(String building){
        try{
            stroyeniyeNomerIliProcherkEsliNet.clear();
            stroyeniyeNomerIliProcherkEsliNet.sendKeys(building);
            log.info(building+" Stroyeniye was inputed");
        }catch (Exception e){
            log.info("Stroyeniye was not inputed");
            Assert.fail("Stroyeniye was not inputed");
        }
    }
    public void inputTextIntoKvartiraNomerField(String flatNumber){
        try{
            kvartiraNomer.clear();
            kvartiraNomer.sendKeys(flatNumber);
            log.info(flatNumber+ " Kvartira nomer was inputed");
        }catch (Exception e){
            log.info("Kvartira nomer was not inputed");
            Assert.fail("Kvartira nomer was not inputed");
        }
    }
    public void inputTextIntoDopolnitelniyAdresTextArea(String addressExtra){
        try{
            adresDopolnitelniy.clear();
            adresDopolnitelniy.sendKeys(addressExtra);
            log.info(addressExtra+" Dopolnitelniy adres was inputed");
        }catch (Exception e ){
            log.info("Dopolnitelniy adres was not inputed");
            Assert.fail("Dopolnitelniy adres was not inputed");
        }
    }
    public void uncheckCheckBoxRassilka(){
        try{
            checkboxPodpiska.click();
            log.info("Checkbox 'Podpisatsa na novosti' was unchecked");
        }catch (Exception e){
            log.error("Failed to uncheck checkbox 'Podpisatsa na novosti'");
            Assert.fail("Failed to uncheck checkbox 'Podpisatsa na novosti'");
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
    public void clickButtonRegistrirvat(){
        try{
            knopkaRegistirovat.click();
            log.info("Button 'Registrirovat' was clicked");
        }catch(Exception e){
            log.error("Failed to click button'Registrirovat");
            Assert.fail("Failed to click button'Registrirovat");
        }
    }
}
