package IskustnicaPackNew;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 27.10.2016.
 */
public class RegistrationPageValueFiveV2 extends  SetupClass{

    private Logger log;

    RegistrationPageValueFiveV2(WebDriver driver){
        super(driver);
        log = Logger.getLogger(getClass());
    }

    public void selectDeliveryTypePochtoyRossiiKuryeromVRegioniChastniyDom (){
        try{
            deliveryType5.click();
            log.info("Delivery type 'Pochtoy Rossii Kuryerom V Regioni Chastniy Dom' (radio button) was selected");
        }catch (Exception e){
            log.info("Failed to select 'Pochtoy Rossii Kuryerom V Regioni Chastniy Dom' (radio button)");
            Assert.fail("Failed to select 'Pochtoy Rossii Kuryerom V Regioni Chastniy Dom' (radio button)");
        }
    }
}
