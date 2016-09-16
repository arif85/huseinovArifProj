package IskustnicaPack;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageNegativeTesting {

    WebDriver driver;
    Logger log;

    @FindBy(xpath = ".//img[@src='/images/10.gif']")
    WebElement isRegistrationPageLoad;
    @FindBy(xpath = ".//input[@value='<< Далее/Enter >>']")
    WebElement knopkaDaleeEnter;

    public RegistrationPageNegativeTesting(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        PageFactory.initElements(driver, this);
    }

    public boolean isRegistrationPageLoaded() {
        try {
            boolean isRegistartionFormLoaded = isRegistrationPageLoad.isDisplayed();
            return isRegistartionFormLoaded;
        } catch (Exception e) {
            log.info("Failed to load registration page");
            Assert.fail("Failed to load registration page");
            return false;
        }
    }

    public void clickButtonDaleeEnter() {
        try {
            knopkaDaleeEnter.click();
            log.info("Knopka '<< Dalee/Enter >>' clicked ");
        } catch (Exception e) {
            log.error("Failed to click button '<< Далее/Enter >>'");
            Assert.fail("Failed to click button '<< Далее/Enter >>'");
        }
    }

    public boolean isAlertDisplayed() {
        boolean alertPresent = false;
        try {
            Alert alert = driver.switchTo().alert();
            alertPresent = true;
            alert.accept();
            log.info("Alert was displayed and accepted");
        } catch (NoAlertPresentException e) {
            log.info("Alert was not displayed");
            Assert.fail("Alert was not displayed");
        }
        return alertPresent;
    }
    public void closePageAndBrowser(){
        try{
            driver.close();
            log.info("Page and Browser were closed");
        }catch (Exception e){
            log.error("Page and Browser were not closed");
            Assert.fail("Page and Browser were not closed");
        }
    }
}
