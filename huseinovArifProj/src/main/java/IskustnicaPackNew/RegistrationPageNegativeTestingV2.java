package IskustnicaPackNew;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class RegistrationPageNegativeTestingV2 extends SetupClass {

    Logger log;

    RegistrationPageNegativeTestingV2(WebDriver driver){
        super(driver);
        log=Logger.getLogger(getClass());
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
}
