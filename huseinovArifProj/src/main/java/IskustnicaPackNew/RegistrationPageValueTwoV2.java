package IskustnicaPackNew;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegistrationPageValueTwoV2 extends SetupClass {

    private Logger log;

    RegistrationPageValueTwoV2(WebDriver driver) {
        super(driver);
        log = Logger.getLogger(getClass());
    }

    public void selectDeliveryTypeKuryeromMoskva() {
        try {
            deliveryType2.click();
            log.info("Delivery type 'Kuryerom Moskva' (radio button) was selected");
        } catch (Exception e) {
            log.info("Failed to select 'Kuryerom Moskva' (radio button)");
            Assert.fail("Failed to select 'Kuryerom Moskva' (radio button)");
        }
    }


}
