package IskustnicaPackNew;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 26.10.2016.
 */
public class RegistrationPageValueThreeV2 extends SetupClass{

    private Logger log;

    RegistrationPageValueThreeV2(WebDriver driver){
        super(driver);
        log = Logger.getLogger(getClass());
    }

    public void selectDeliveryKuryeromMoskovskayaOblast(){
        try{
            deliveryType3.click();
            log.info("Delivery type 'Samovivoz' (radio button) was selected");
        }catch (Exception e){
            log.info("Failed to select 'Samovivoz' (radio button)");
            Assert.fail("Failed to select 'Samovivoz' (radio button)");
        }
    }
}
