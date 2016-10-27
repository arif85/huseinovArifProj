package IskustnicaPackNew;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegistrationPageValueOneV2 extends SetupClass {
    private Logger log;

    RegistrationPageValueOneV2(WebDriver driver) {
        super(driver);
        log = Logger.getLogger(getClass());
    }


    public void selectDeliveryTypeSamovivoz() {
        try {
            deliveryType1.click();
            log.info("Delivery type 'Samovivoz' (radio button) was selected");
        } catch (Exception e) {
            log.info("Failed to select 'Samovivoz' (radio button)");
            Assert.fail("Failed to select 'Samovivoz' (radio button)");
        }
    }

}
