package IskustnicaPackNew;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;
import static libs.ConfigData.getCfgValue;


public class MainPageLoad extends SetupClass {


    private Logger log;

    @FindBy(id = "MainTD")
    private WebElement mainPageLoad;
    @FindBy(xpath = ".//a[@href='/register']")
    private WebElement registrationLink;

    MainPageLoad(WebDriver driver) {
        super(driver);
        log = Logger.getLogger(getClass());
    }

    public void openBrowser() throws Exception {
        try {
            String waitImplicitly = getCfgValue("IMPLICITLY_WAIT");
            long implicitlyWait = Long.parseLong(waitImplicitly);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);
            log.info("Browser was opened");
        } catch (Exception e) {
            log.error("Failed to start browser");
            Assert.fail("Failed to start browser");
        }
    }

    public void loadMainPage() {
        try {
            driver.get(getCfgValue("SITE_URL"));
            log.info("Main page was loaded");
        } catch (Exception e) {
            log.error("Failed to load main page ");
            Assert.fail("Failed to load main page ");
        }

    }


    public boolean isMainPageLoaded() {
        try {
            boolean isMainTDLoad = mainPageLoad.isDisplayed();
            return isMainTDLoad;
        } catch (Exception e) {
            log.info("No such element on the page");
            Assert.fail("No such element on the page");
            return false;
        }
    }

    public void goToRegistrationPage() {
        try {
            registrationLink.click();
            log.info("Registration link was clicked");
        } catch (Exception e) {
            log.error("Cannot work with registration link");
            Assert.fail("Cannot work with registration link");
        }
    }


}

