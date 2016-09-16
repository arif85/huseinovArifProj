package IskustnicaPack;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistartionPageNegativeTest {

    WebDriver driver = new ChromeDriver();
    MyApp myApp = new MyApp(driver);


    @Before

    public void mainPageLoad() {
        myApp.mainPage.OpenBrowserAndLoadMainPage();
        Assert.assertTrue("Wrong URL was inputed", myApp.mainPage.isMainPageLoaded());
        myApp.mainPage.GoToRegistrationPage();
    }
    @Test

    public void registartionPageNegativeTest(){
        myApp.registrationPageNegativeTesting.isRegistrationPageLoaded();
        myApp.registrationPageNegativeTesting.clickButtonDaleeEnter();
        myApp.registrationPageNegativeTesting.isAlertDisplayed();
    }
    @After

    public void closePageandBrowser(){
        myApp.registrationPageNegativeTesting.closePageAndBrowser();
    }
}
