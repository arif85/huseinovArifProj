package IskustnicaPackNew;


import IskustnicaPackNew.MyAppV2;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPageNegativeTestV2 {

    WebDriver driver = new ChromeDriver();
    MyAppV2 myAppV2 = new MyAppV2(driver);


    @Before

    public void mainPageLoad() throws Exception {
        myAppV2.mainPageLoad.openBrowser();
        myAppV2.mainPageLoad.loadMainPage();
        Assert.assertTrue("Wrong URL was inputed", myAppV2.mainPageLoad.isMainPageLoaded());
        myAppV2.mainPageLoad.goToRegistrationPage();
    }

    @Test

    public void registartionPageNegativeTestV2() {
        myAppV2.registrationPageNegativeTestingV2.isRegistrationPageLoad();
        myAppV2.registrationPageNegativeTestingV2.pressButtonDaleeEnter();
        myAppV2.registrationPageNegativeTestingV2.isAlertDisplayed();
    }

    @After

    public void closePageAndBrowser() {

        myAppV2.registrationPageNegativeTestingV2.closeRegistrationPageAndWindow();
    }
}
