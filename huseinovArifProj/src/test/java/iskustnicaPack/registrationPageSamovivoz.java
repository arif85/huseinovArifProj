package iskustnicaPack;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPageSamovivoz {

    WebDriver driver = new ChromeDriver();
    RegistrationPage register = new RegistrationPage(driver);
@Test
    public void registrationPageSamovivoz(){
        register.OpenBrowserAndLoadIskustnicaRagistrationPage();
        Assert.assertTrue("Registration page was not loaded",register.isRegistrationPageLoad());
    }

@After

    public void closeRegistrationPage(){
    register.CloseRegistrationPageAndWindow();
}
}
