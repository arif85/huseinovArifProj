package IskustnicaPack;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.spec.ECField;
import java.util.concurrent.TimeUnit;

public class RegistrationPageValueOne {

    WebDriver driver;
    Logger log;


    @FindBy(xpath = ".//img[@src='/images/10.gif']")
    WebElement registrationPageLoaded;
    @FindBy(xpath = ".//input[@value='1']")
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
    WebElement telefonMobilny;
    @FindBy(xpath = ".//input[@value='<< Далее/Enter >>']")
    WebElement knopkaDaleeEnter;
    @FindBy(xpath = ".//input[@value='Регистрировать']")
    WebElement knopkaRegistirovat;

    public RegistrationPageValueOne(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        PageFactory.initElements(driver, this);
    }

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

    public void SelectDilevirySamovivoz() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        deliveryType.click();
        log.info("Delivery type 'Samovivoz' (radio button) selected");
    }

    public void InputTextIntoFieldFamilia(String text) {
        try {
            familia.clear();
            familia.sendKeys(text);
            log.info(text + " Familia was Inputed");
        } catch (Exception e) {
            log.info("Input text into the Familia field failed");
            Assert.fail("Input text into the Familia field failed");
        }
    }

    public void InputTextIntoFieldImia(String text) {
        try {
            imia.clear();
            imia.sendKeys(text);
            log.info(text + " Imia was Inputed");
        } catch (Exception e) {
            log.info("Input text into the Imia field failed");
            Assert.fail("Input text into the Familia field failed");
        }
    }

    public void InputTextIntoFieldOtchestvo(String text) {
        try {
            otchestvo.clear();
            otchestvo.sendKeys(text);
            log.info(text + " Otchestvo was Inputed");
        } catch (Exception e) {
            log.info("Input text into the Otchesvto field failed");
        }
    }

    public void SelectDropDownDen(String text) {
        try {
            Select mySelect = new Select(den);
            mySelect.selectByVisibleText(text);
            log.info(text + " den selected");
        } catch (Exception e) {
            log.info("Failed to select option from SelectDropDownDen");
            Assert.fail("Failed to select option from SelectDropDownDen");
        }
    }

    public void SelectDropDownMesiac(String text) {
        try {
            Select mySelect = new Select(mesiac);
            mySelect.selectByVisibleText(text);
            log.info(text + " mesiac selected");
        } catch (Exception e) {
            log.info("Failed to select option from SelectDropDownMesiac");
            Assert.fail("Failed to select option from SelectDropDownMesiac");
        }
    }

    public void SelectDropDownGod(String text) {
        try {
            Select mySelect = new Select(god);
            mySelect.selectByValue(text);
            log.info(text + " god selected");
        } catch (Exception e) {
            log.info("Failed to select option from SelectDropDownGod");
            Assert.fail("Failed to select option from SelectDropDownGod");
        }
    }

    public void InputTextIntoFieldEmail(String text) {
        try {
            pochta.clear();
            pochta.sendKeys(text);
            log.info(text + " E-mail inputed");
        } catch (Exception e) {
            log.info("Input text into the Email field failed");
            Assert.fail("Input text into the Email field failed");
        }
    }

    public void InputTextIntoFieldPass(String text) {
        try {
            parol.clear();
            parol.sendKeys(text);
            log.info(text + " parol inputed");
        } catch (Exception e) {
            log.info("Input text into the Parol field failed");
            Assert.fail("Input text into the Parol field failed");

        }
    }

    public void InputTextIntoFieldRepass(String text) {
        try {
            povtoriteParol.clear();
            povtoriteParol.sendKeys(text);
            log.info(text + " repass inputed");
        } catch (Exception e) {
            log.info("Input text into the Povtorite Parol field failed");
            Assert.fail("Input text into the Povtorite Parol field failed");
        }
    }

    public void InputTextIntoFieldTelefon(String text) {
        try {
            telefonMobilny.clear();
            telefonMobilny.sendKeys(text);
            log.info(text + " cellPhone inputed");
        } catch (Exception e) {
            log.info("Input text into the Mobilniy Telefon field failed");
            Assert.fail("Input text into the Mobilniy Telefon field failed");
        }
    }

    public void PressButtonDaleeEnter() {
        try {
            knopkaDaleeEnter.click();
            log.info("Button '<< Dalee/Enter >>' was clicked");
        } catch (Exception e) {
            log.error("Failed to click '<< Dalee/Enter >>'");
            Assert.fail("Failed to click '<< Dalee/Enter >>'");
        }
    }

    public void PressButtonRegistrirovat() {
        try {
            knopkaRegistirovat.click();
            log.info("Button 'Registrirovat' was clicked ");
        } catch (Exception e) {
            log.error("Failed to click 'Registrirovat'");
            Assert.fail("Failed to click 'Registrirovat'");

        }
    }
    public void CloseRegistrationPageAndWindow() {
        try {
            driver.quit();
            log.info("Browser were closed");
        } catch (Exception e) {
            log.error("Failed to close WebPage and Browser");
            Assert.fail("Failed to close WebPage and Browser");
        }
    }
}









