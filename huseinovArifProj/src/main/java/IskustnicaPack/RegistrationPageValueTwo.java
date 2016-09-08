package IskustnicaPack;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegistrationPageValueTwo {
    WebDriver driver;
    Logger log;

    @FindBy(xpath = ".//h1[contains(text(),'Регистрация')]")
    WebElement registrationPageLoaded;
    @FindBy(xpath = ".//input[@value='2']")
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
    @FindBy(name = "phone[home]")
    WebElement telefonDomashniyIliRabochiy;
    @FindBy(name = "phone[work]")
    WebElement telefonDopolnitelniy;
    @FindBy(name = "adress[main]")
    WebElement adress;
    @FindBy(name = "howadres")
    WebElement kakProyexat;
    @FindBy(name = "adress[add]")
    WebElement dopolnitelniyAdress;
    @FindBy(name = "howadres_add")
    WebElement kakProyexatDopolnitelniyAdress;
    @FindBy(xpath = ".//input[@value='<< Далее/Enter >>']")
    WebElement knopkaDaleeEnter;
    @FindBy(xpath = ".//input[@value='Регистрировать']")
    WebElement knopkaRegistirovat;


    public RegistrationPageValueTwo(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        PageFactory.initElements(driver, this);
    }

    public boolean isRegistrationPageLoaded() {
        try {
            boolean isRegisrationFormLoad = registrationPageLoaded.isDisplayed();
            return isRegisrationFormLoad;
        } catch (Exception e) {
            log.info("Registartion page was not loaded");
            Assert.fail("Registartion page was not loaded");
            return false;
        }
    }

    public void selectDeliveryKuryeromMoskva() {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            deliveryType.click();
            log.info("Delivery type 'Kuryerom Moskva' (radio button) selected");
        } catch (Exception e) {
            log.error("Selection delivery type error");
            Assert.fail("Selection delivery type error");
        }
    }

    public void inputTextIntoFamiliaField(String familiya) {
        try {
            familia.clear();
            familia.sendKeys(familiya);
            log.info(familiya + " familia was inputed");
        } catch (Exception e) {
            log.info("familia was not inputed");
            Assert.fail("familia was not inputed");
        }
    }

    public void inputTextIntoImiaField(String imiya) {
        try {
            imia.clear();
            imia.sendKeys(imiya);
            log.info(imiya + " imiya was inputed");
        } catch (Exception e) {
            log.info("Imiya was not inputed");
            Assert.fail("Imiya was not inputed");
        }
    }

    public void inputTextIntoOtchestvoField(String ot4estvo) {
        try {
            otchestvo.clear();
            otchestvo.sendKeys(ot4estvo);
            log.info(ot4estvo + "otchestvo was inputed");
        } catch (Exception e) {
            log.info("Otchestvo was not inputed");
            Assert.fail("Otchestvo was not inputed");
        }
    }

    public void selectDropDownDen(String day) {
        try {
            Select selectDen = new Select(den);
            selectDen.selectByVisibleText(day);
            log.info(day + " Den was selected");
        } catch (Exception e) {
            log.error("Failed to select den");
            Assert.fail("Failed to select den");
        }
    }

    public void selectDropDownMesias(String month) {
        try {
            Select selectMesac = new Select(mesiac);
            selectMesac.selectByVisibleText(month);
            log.info(month + " Mesiac was selected");
        } catch (Exception e) {
            log.error("Failed to select mesiac");
            Assert.fail("Failed  to select mesiac");
        }
    }

    public void selectDropDownGod(String year) {
        try {
            Select selectYear = new Select(god);
            selectYear.selectByVisibleText(year);
            log.info(year + "God was selected");
        } catch (Exception e) {
            log.error("Failed to select year");
            Assert.fail("Failed to select year");
        }
    }

    public void inputTestIntoEmailField(String mail) {
        try {
            pochta.clear();
            pochta.sendKeys(mail);
            log.info(mail + "Mail was inputed");
        } catch (Exception e) {
            log.info("Email was not inputed");
            Assert.fail("Email was not inputed");
        }
    }

    public void inputTextIntoParolField(String passwd) {
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
            log.info(repasswd + " PovrotiteParol was inputed ");
        } catch (Exception e) {
            log.info("PorvoriteParol was not inputed");
            Assert.fail("PorvoriteParol was not inputed");
        }
    }

    public void inputTextIntoTelefonMobilniyField(String cellphone) {
        try {
            mobilniyTelefon.clear();
            mobilniyTelefon.sendKeys(cellphone);
            log.info(cellphone + " Telefon mobilniy was inputed ");
        } catch (Exception e) {
            log.info("Telefon mobilniy was not inputed");
            Assert.fail("Telefon mobilniy was not inputed");
        }
    }

    public void inputTextIntoTelefonDomashniyIliRabochiy(String workphone) {
        try {
            telefonDomashniyIliRabochiy.clear();
            telefonDomashniyIliRabochiy.sendKeys(workphone);
            log.info(workphone + " Telefon domashniy ili rabochiy was inputed");
        } catch (Exception e) {
            log.info("Telefon domashniy ili rabochiy was not inputed");
            Assert.fail("Telefon domashniy ili rabochiy was not inputed");
        }
    }

    public void inputTextIntoTelefonDopolnitelniy(String extraphone) {
        try {
            telefonDopolnitelniy.clear();
            telefonDopolnitelniy.sendKeys(extraphone);
            log.info(extraphone + " Telefon dopolnitelniy was inputed");
        } catch (Exception e) {
            log.info("Telefon dopolnitelniy was inputed");
            Assert.fail("Telefon dopolnitelniy was inputed");
        }
    }
}