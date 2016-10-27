package IskustnicaPackNew;

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
public class RegistrationPageSamovivozV2 {

    WebDriver driver = new ChromeDriver();
    MyAppV2 myAppV2 = new MyAppV2(driver);

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

    public RegistrationPageSamovivozV2(String familia, String imia, String otchestvo, String den, String mesiac,
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

    public void mainPageLoad() throws Exception {
        myAppV2.mainPageLoad.openBrowser();
        myAppV2.mainPageLoad.loadMainPage();
        Assert.assertTrue("Wrong URL was input", myAppV2.mainPageLoad.isMainPageLoaded());
        myAppV2.mainPageLoad.goToRegistrationPage();
    }

    @Test

    public void registrationgPageSamovivoz() {
        myAppV2.registrationPageValueOneV2.isRegistrationPageLoad();
        myAppV2.registrationPageValueOneV2.selectDeliveryTypeSamovivoz();
        myAppV2.registrationPageValueOneV2.inputTextIntoFamiliaField(familia);
        myAppV2.registrationPageValueOneV2.inputTextIntoFieldImia(imia);
        myAppV2.registrationPageValueOneV2.inputTextIntoFieldOtchestvo(otchestvo);
        myAppV2.registrationPageValueOneV2.selectDropDownDen(den);
        myAppV2.registrationPageValueOneV2.selectDropDownMesiac(mesiac);
        myAppV2.registrationPageValueOneV2.selectDropDownGod(god);
        myAppV2.registrationPageValueOneV2.inputTextIntoFieldPochta(email);
        myAppV2.registrationPageValueOneV2.inputTextIntoFieldParol(pass);
        myAppV2.registrationPageValueOneV2.inputTextIntoFieldPovtoriteParol(repass);
        myAppV2.registrationPageValueOneV2.inputTextIntoFieldTelefonMobilniy(cellphone);
        myAppV2.registrationPageValueOneV2.pressButtonDaleeEnter();
        myAppV2.registrationPageValueOneV2.pressButtonRegistrirovat();
        Assert.assertTrue("Registration failed", myAppV2.registrationPageValueOneV2.isMessageSpasiboLoaded());
    }


    @After

    public void closePageAndBrowser() {

        myAppV2.registrationPageValueOneV2.closeRegistrationPageAndWindow();
    }
}



