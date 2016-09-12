package IskustnicaPack;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class MainPage {
    WebDriver driver;
    Logger log;

    @FindBy(id = "MainTD")
    WebElement mainPageLoad;
    @FindBy(xpath = ".//a[@href='/register']")
    WebElement registrationLink;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        PageFactory.initElements(driver, this);
    }

    public void OpenBrowserAndLoadMainPage() {
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://iskusnitsa.ru/");
            log.info("Browser and main page were opened");
        } catch (Exception e) {
            log.info("Browser or main page were not opened");
            Assert.fail("Browser or main page were not opened");
        }
    }

    public boolean isMainPageLoaded() {
        try {
            boolean isMainDTLoad = mainPageLoad.isDisplayed();
            return isMainDTLoad;
        } catch (Exception e) {
            log.info("No such element on the page");
            Assert.fail("No such element on the page");
            return false;
        }
    }

    public void GoToRegistrationPage() {
        try {
            registrationLink.click();
            log.info("Registration link was clicked");
        } catch (Exception e) {
            log.error("Can not work with registration link");
            Assert.fail("Can not work with registration link");
        }
    }

    public void ClosePageAndBrowser() {
        try {
            driver.quit();
            log.info("Browser were closed");
        } catch (Exception e) {
            log.error("Failed to close WebPage and Browser");
            Assert.fail("Failed to close WebPage and Browser");
        }
    }
}