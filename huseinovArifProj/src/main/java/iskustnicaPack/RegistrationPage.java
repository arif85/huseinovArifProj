package iskustnicaPack;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;

public class RegistrationPage {

    WebDriver driver;
    Logger log;


    @FindBy(xpath = ".//input[@value='1']")
    WebElement deliveryType;
    @FindBy(name = "family")
    WebElement familia;
    @FindBy(name = "name")
    WebElement imia;
    @FindBy(name = "father")
    WebElement otchestvo;
    @FindBy(name = "date")
    WebElement den;
    @FindBy(name = "month")
    WebElement mesiac;
    @FindBy(name = "year")
    WebElement god;
    @FindBy(name = "email")
    WebElement pochta;
    @FindBy(name = "pass")
    WebElement parol;
    @FindBy(name = "repass")
    WebElement povtoriteParol;
    @FindBy(name = "phone[mobil]")
    WebElement telefonMobilny;
    @FindBy(xpath = ".//input[@value='<< Далее/Enter >>']")
    WebElement knopkaDaleeEnter;
    @FindBy(xpath = ".//input[@value='Регистрировать']")
    WebElement knopkaRegistirovat;
    @FindBy(id = "ttt")
    WebElement RegistrationArrow;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        PageFactory.initElements(driver, this);
    }

    public void OpenBrowserAndLoadIskustnicaRagistrationPage() {
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://iskusnitsa.ru/register");
            log.info("Browser and registration Page were opened");
        } catch (Exception e) {
            log.info("Could not open browser or registration page");
            Assert.fail("Could not open browser or registration page");
        }
    }
        public void  CloseRegistrationPageAndWindow(){
        driver.quit();
        log.info("Registration page and window were closed");
    }
        public boolean isRegistrationPageLoad(){
            try
            {
                boolean isPictureLoad = RegistrationArrow.isDisplayed();
                return isPictureLoad;
            }catch(NoSuchElementException e){
                log.info("No such element");
                return false;
            }
        }
    }


