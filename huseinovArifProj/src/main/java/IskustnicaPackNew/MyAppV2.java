package IskustnicaPackNew;

import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 02.09.2016.
 */
public class MyAppV2 {
    WebDriver driver;
    public MainPageLoad mainPageLoad;
    public RegistrationPageValueOneV2 registrationPageValueOneV2;
    public RegistrationPageValueTwoV2 registrationPageValueTwoV2;
    public RegistrationPageValueThreeV2 registrationPageValueThreeV2;
    public RegistrationPageValueFourV2 registrationPageValueFourV2;
    public RegistrationPageValueFiveV2 registrationPageValueFiveV2;
    public RegistrationPageNegativeTestingV2 registrationPageNegativeTestingV2;

    public MyAppV2(WebDriver driver) {
        this.driver = driver;
        mainPageLoad = new MainPageLoad(driver);
        registrationPageValueOneV2 = new RegistrationPageValueOneV2(driver);
        registrationPageValueTwoV2 = new RegistrationPageValueTwoV2(driver);
        registrationPageValueThreeV2 = new RegistrationPageValueThreeV2(driver);
        registrationPageValueFourV2 = new RegistrationPageValueFourV2(driver);
        registrationPageValueFiveV2 = new RegistrationPageValueFiveV2(driver);
        registrationPageNegativeTestingV2 = new RegistrationPageNegativeTestingV2(driver);
    }
}
