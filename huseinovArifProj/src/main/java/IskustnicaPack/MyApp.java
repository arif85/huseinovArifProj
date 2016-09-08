package IskustnicaPack;

import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 02.09.2016.
 */
public class MyApp {
    WebDriver driver;
    public MainPage mainPage;
    public RegistrationPageValueOne registrationPageValueOne;
    public RegistrationPageMessageSpasibo registrationPageMessageSpasibo;
    public RegistrationPageValueTwo registrationPageValueTwo;

public MyApp(WebDriver driver){
    this.driver = driver;
    mainPage = new MainPage(driver);
    registrationPageValueOne = new RegistrationPageValueOne(driver);
    registrationPageMessageSpasibo = new RegistrationPageMessageSpasibo(driver);
    registrationPageValueTwo = new RegistrationPageValueTwo(driver);
}
}
