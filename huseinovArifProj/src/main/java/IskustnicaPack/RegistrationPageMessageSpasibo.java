package IskustnicaPack;

import jdk.nashorn.internal.runtime.ECMAException;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class RegistrationPageMessageSpasibo {
    WebDriver driver;
    Logger log;
    @FindBy(xpath = ".//h3[@style='color: green;']")
    WebElement messageSpasibo;

    public RegistrationPageMessageSpasibo(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        PageFactory.initElements(driver, this);
    }
    public boolean isMessageSpasiboLoaded(){
        try {
            boolean isSpasiboAppeared = messageSpasibo.isDisplayed();
            return isSpasiboAppeared;
        }catch (Exception e){
            log.info("Registration failed");
            Assert.fail("Registration failed");
            return false;
        }
    }

    public void closeRegistrationPageAndWindow() {
        try{
            driver.quit();
            log.info("WebPage and Browser closed");
        }catch (Exception e ){
            log.error("Failed to close WebPage and Browser");
            Assert.fail("Failed to close WebPage and Browser");
        }
        }
}
