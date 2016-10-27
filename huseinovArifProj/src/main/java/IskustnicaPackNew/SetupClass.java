package IskustnicaPackNew;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SetupClass extends Locators {

    WebDriver driver;
    Logger log;


    SetupClass(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        PageFactory.initElements(driver, this);
    }

    public boolean isRegistrationPageLoad() {
        try {
            boolean isRegistartionLoad = isRegistrationPageLoad.isDisplayed();
            return isRegistartionLoad;
        } catch (Exception e) {
            log.info("Registartion page was not loaded");
            Assert.fail("Registartion page was not loaded");
            return false;
        }
    }

    public void inputTextIntoFamiliaField(String familiya) {
        try {
            familia.clear();
            familia.sendKeys(familiya);
            log.info("Familia was input");
        } catch (Exception e) {
            log.info("Failed to input familia");
            Assert.fail("Failed to input familia");
        }
    }

    public void inputTextIntoFieldImia(String text) {
        try {
            imia.clear();
            imia.sendKeys(text);
            log.info(text + " Imia was Inputed");
        } catch (Exception e) {
            log.info("Input text into the Imia field failed");
            Assert.fail("Input text into the Familia field failed");
        }
    }

    public void inputTextIntoFieldOtchestvo(String text) {
        try {
            otchestvo.clear();
            otchestvo.sendKeys(text);
            log.info(text + " Otchestvo was Inputed");
        } catch (Exception e) {
            log.info("Input text into the Otchesvto field failed");
        }
    }

    public void selectDropDownDen(String text) {
        try {
            Select mySelect = new Select(den);
            mySelect.selectByVisibleText(text);
            log.info(text + " den selected");
        } catch (Exception e) {
            log.info("Failed to select option from SelectDropDownDen");
            Assert.fail("Failed to select option from SelectDropDownDen");
        }
    }

    public void selectDropDownMesiac(String text) {
        try {
            Select mySelect = new Select(mesiac);
            mySelect.selectByVisibleText(text);
            log.info(text + " mesiac selected");
        } catch (Exception e) {
            log.info("Failed to select option from SelectDropDownMesiac");
            Assert.fail("Failed to select option from SelectDropDownMesiac");
        }
    }

    public void selectDropDownGod(String text) {
        try {
            Select mySelect = new Select(god);
            mySelect.selectByValue(text);
            log.info(text + " god selected");
        } catch (Exception e) {
            log.info("Failed to select option from SelectDropDownGod");
            Assert.fail("Failed to select option from SelectDropDownGod");
        }
    }

    public void inputTextIntoFieldPochta(String text) {
        try {
            pochta.clear();
            pochta.sendKeys(text);
            log.info(text + " E-mail inputed");
        } catch (Exception e) {
            log.info("Input text into the Email field failed");
            Assert.fail("Input text into the Email field failed");
        }
    }

    public void inputTextIntoFieldParol(String text) {
        try {
            parol.clear();
            parol.sendKeys(text);
            log.info(text + " parol inputed");
        } catch (Exception e) {
            log.info("Input text into the Parol field failed");
            Assert.fail("Input text into the Parol field failed");

        }
    }

    public void inputTextIntoFieldPovtoriteParol(String text) {
        try {
            povtoriteParol.clear();
            povtoriteParol.sendKeys(text);
            log.info(text + " repass inputed");
        } catch (Exception e) {
            log.info("Input text into the Povtorite Parol field failed");
            Assert.fail("Input text into the Povtorite Parol field failed");
        }
    }

    public void inputTextIntoFieldTelefonMobilniy(String text) {
        try {
            telefonMobilny.clear();
            telefonMobilny.sendKeys(text);
            log.info(text + " cellPhone inputed");
        } catch (Exception e) {
            log.info("Input text into the Mobilniy Telefon field failed");
            Assert.fail("Input text into the Mobilniy Telefon field failed");
        }
    }

    public void inputTextIntoTelefonDomashniyIliRabochiyField(String workphone) {
        try {
            telefonDomashniyIliRabochiy.clear();
            telefonDomashniyIliRabochiy.sendKeys(workphone);
            log.info(workphone + " Telefon domashniy ili rabochiy was inputed");
        } catch (Exception e) {
            log.info("Telefon domashniy ili rabochiy was not inputed");
            Assert.fail("Telefon domashniy ili rabochiy was not inputed");
        }
    }

    public void inputTextIntoTelefonDopolnitelniyField(String extraphone) {
        try {
            telefonDopolnitelniy.clear();
            telefonDopolnitelniy.sendKeys(extraphone);
            log.info(extraphone + " Telefon dopolnitelniy was inputed");
        } catch (Exception e) {
            log.info("Telefon dopolnitelniy was inputed");
            Assert.fail("Telefon dopolnitelniy was inputed");
        }
    }

    public void inputTextIntoAdresTextArea(String adresMain) {
        try {
            adress.clear();
            adress.sendKeys(adresMain);
            log.info(adresMain + " Adres was inputed");
        } catch (Exception e) {
            log.info("Adres was not inputed");
            Assert.fail("Adres was not inputed");
        }
    }

    public void inputTextIntoKakProyexatTextArea(String KakProexat) {
        try {
            kakProyexat.clear();
            kakProyexat.sendKeys(KakProexat);
            log.info(KakProexat + " kak proyexat was inputed");
        } catch (Exception e) {
            log.info("kak proyexat text was not inputed");
            Assert.fail("kak proyexat text was not inputed");
        }
    }

    public void inputTextIntoAdresDopolnitelniyTextArea(String adresExtra) {
        try {
            dopolnitelniyAdress.clear();
            dopolnitelniyAdress.sendKeys(adresExtra);
            log.info(adresExtra + " dopolnitelnit adres was inputed");
        } catch (Exception e) {
            log.info("Dopolnitelniy adres was not inputed");
            Assert.fail("Dopolnitelniy adres was not inputed");
        }
    }

    public void inputTextIntoKakProyaxatDopolnitelniyTextArea(String kakProexatExtra) {
        try {
            kakProyexatDopolnitelniyAdress.clear();
            kakProyexatDopolnitelniyAdress.sendKeys(kakProexatExtra);
            log.info(kakProexatExtra + " Kak proyexat dopolnitelniy address was inputed");
        } catch (Exception e) {
            log.info("Kak proyexat dopolnitelniy address was not inputed");
            Assert.fail("Kak proyexat dopolnitelniy address was not inputed");
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

    public void inputTextIntoKorpusField(String corpus) {
        try {
            korpusNomerIliProcherkEsliNet.clear();
            korpusNomerIliProcherkEsliNet.sendKeys(corpus);
            log.info(corpus + " 'KorpusNomer Ili Procherk Esli Net' was inputed");
        } catch (Exception e) {
            log.info("'KorpusNomer Ili Procherk Esli Net' was not inputed");
            Assert.fail("'KorpusNomer Ili Procherk Esli Net' was not inputed");
        }
    }

    public void inputTextIntoStroyeniyeField(String building) {
        try {
            stroyeniyeNomerIliProcherkEsliNet.clear();
            stroyeniyeNomerIliProcherkEsliNet.sendKeys(building);
            log.info(building + " Stroyeniye was inputed");
        } catch (Exception e) {
            log.info("Stroyeniye was not inputed");
            Assert.fail("Stroyeniye was not inputed");
        }
    }


    public void pressButtonDaleeEnter() {
        try {
            knopkaDaleeEnter.click();
            log.info("Button '<< Dalee/Enter >>' was clicked");
        } catch (Exception e) {
            log.error("Failed to click '<< Dalee/Enter >>'");
            Assert.fail("Failed to click '<< Dalee/Enter >>'");
        }
    }

    public void pressButtonRegistrirovat() {
        try {
            knopkaRegistirovat.click();
            log.info("Button 'Registrirovat' was clicked ");
        } catch (Exception e) {
            log.error("Failed to click 'Registrirovat'");
            Assert.fail("Failed to click 'Registrirovat'");

        }
    }

    public boolean isMessageSpasiboLoaded() {
        try {
            boolean isSpasiboAppeared = messageSpasibo.isDisplayed();
            return isSpasiboAppeared;
        } catch (Exception e) {
            log.info("Registration failed");
            Assert.fail("Registration failed");
            return false;
        }
    }


    public void closeRegistrationPageAndWindow() {
        try {
            driver.quit();
            log.info("WebPage and Browser closed");
        } catch (Exception e) {
            log.error("Failed to close WebPage and Browser");
            Assert.fail("Failed to close WebPage and Browser");
        }
    }
}
