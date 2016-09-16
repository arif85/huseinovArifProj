package IskustnicaPack;

import libs.SpreadsheetData;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import static libs.ConfigData.getCfgValue;

@RunWith(value = Parameterized.class)
public class RegistrationPageSamovivoz {
    WebDriver driver = new ChromeDriver();
    MyApp myApp = new MyApp(driver);

    String familia;
    String imia;
    String otchestvo;
    String den;
    String mesiac;
    String god;
    String email;
    String pass;
    String repass;
    String cellphone;

    public RegistrationPageSamovivoz(String familia, String imia, String otchestvo, String den, String mesiac,
                                     String god, String email, String pass, String repass, String cellphone
    ) {
        super();
        this.familia = familia;
        this.imia = imia;
        this.otchestvo = otchestvo;
        this.den = den;
        this.mesiac = mesiac;
        this.god = god;
        this.email = email;
        this.pass = pass;
        this.repass = repass;
        this.cellphone = cellphone;
    }

    @Parameterized.Parameters
    public static Collection testData() throws IOException {
        InputStream spreadsheet = new FileInputStream(getCfgValue("DATA_FILE"));
        return new SpreadsheetData(spreadsheet, "Samovivoz").getData();
    }

    @Before
    public void MainPageload() {
        myApp.mainPage.OpenBrowserAndLoadMainPage();
        Assert.assertTrue("Wrong URL inputed", myApp.mainPage.isMainPageLoaded());
        myApp.mainPage.GoToRegistrationPage();
    }

    @Test
    public void registrarionPageSamovivoz() {
        myApp.registrationPageValueOne.isRegistrationPageLoaded();
        myApp.registrationPageValueOne.SelectDilevirySamovivoz();
        myApp.registrationPageValueOne.InputTextIntoFieldFamilia(familia);
        myApp.registrationPageValueOne.InputTextIntoFieldImia(imia);
        myApp.registrationPageValueOne.InputTextIntoFieldOtchestvo(otchestvo);
        myApp.registrationPageValueOne.SelectDropDownDen(den);
        myApp.registrationPageValueOne.SelectDropDownMesiac(mesiac);
        myApp.registrationPageValueOne.SelectDropDownGod(god);
        myApp.registrationPageValueOne.InputTextIntoFieldEmail(email);
        myApp.registrationPageValueOne.InputTextIntoFieldPass(pass);
        myApp.registrationPageValueOne.InputTextIntoFieldRepass(repass);
        myApp.registrationPageValueOne.InputTextIntoFieldTelefon(cellphone);
        myApp.registrationPageValueOne.PressButtonDaleeEnter();
        myApp.registrationPageValueOne.PressButtonRegistrirovat();
        Assert.assertTrue("Registration failed", myApp.registrationPageMessageSpasibo.isMessageSpasiboLoaded());
    }

    @After
    public void closePageAndBrowser() {

        myApp.registrationPageMessageSpasibo.CloseRegistrationPageAndWindow();
    }

}
