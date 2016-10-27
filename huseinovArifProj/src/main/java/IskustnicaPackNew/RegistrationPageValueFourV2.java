package IskustnicaPackNew;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegistrationPageValueFourV2 extends SetupClass {

    private Logger log;

    RegistrationPageValueFourV2(WebDriver driver) {
        super(driver);
        log = Logger.getLogger(getClass());
    }

    public void selectDeliveryPochtoyRossiiKuryeromVRegioniDomSKvartiory() {
        try {
            deliveryType4.click();
            log.info("Delivery type 'Pochtoy Rossii Kuryerom V Regioni Dom S Kvartiory' (radio button) was selected");
        } catch (Exception e) {
            log.info("Failed to select 'Pochtoy Rossii Kuryerom V Regioni Dom S Kvartiory' (radio button)");
            Assert.fail("Failed to select 'Pochtoy Rossii Kuryerom V Regioni Dom S Kvartiory' (radio button)");
        }
    }

    public void inputTextIntoKvartiraNomerField(String flatNumber) {
        try {
            kvartiraNomer.clear();
            kvartiraNomer.sendKeys(flatNumber);
            log.info(flatNumber + " Kvartira nomer was inputed");
        } catch (Exception e) {
            log.info("Kvartira nomer was not inputed");
            Assert.fail("Kvartira nomer was not inputed");
        }
    }

    public void uncheckCheckBoxRassilka() {
        try {
            checkboxPodpiska.click();
            log.info("Checkbox 'Podpisatsa na novosti' was unchecked");
        } catch (Exception e) {
            log.error("Failed to uncheck checkbox 'Podpisatsa na novosti'");
            Assert.fail("Failed to uncheck checkbox 'Podpisatsa na novosti'");
        }
    }
}
