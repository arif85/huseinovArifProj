package IskustnicaPackNew;

import IskustnicaPackNew.MyAppV2;
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
public class RegistrationPageKuryeromMoskvockayaOblastV2 {
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
    String homeOrWorkPhone;
    String extraPhone;
    String address;
    String howaddress;
    String addressExtra;
    String howAddressExtra;

    public RegistrationPageKuryeromMoskvockayaOblastV2(String familia, String imia, String otchestvo, String den, String mesiac,
                                                     String god, String email, String pass, String repass, String cellphone,
                                                     String homeOrWorkPhone, String extraPhone, String address, String howaddress,
                                                     String addressExtra, String howAddressExtra) {
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
        this.homeOrWorkPhone = homeOrWorkPhone;
        this.extraPhone = extraPhone;
        this.address = address;
        this.howaddress = howaddress;
        this.addressExtra = addressExtra;
        this.howAddressExtra = howAddressExtra;
    }

    @Parameterized.Parameters
    public static Collection testData() throws IOException {
        InputStream spreadsheet = new FileInputStream(getCfgValue("DATA_FILE"));
        return new SpreadsheetData(spreadsheet, "KuryeromMoskovskayaOblast").getData();
    }

    @Before
    public void mainPageload() throws Exception {
        myAppV2.mainPageLoad.openBrowser();
        myAppV2.mainPageLoad.loadMainPage();
        Assert.assertTrue("Wrong URL inputed", myAppV2.mainPageLoad.isMainPageLoaded());
        myAppV2.mainPageLoad.goToRegistrationPage();
    }

    @Test
    public void registrationPageKuryeromMoskvockayaOblastV2() {
        myAppV2.registrationPageValueThreeV2.isRegistrationPageLoad();
        myAppV2.registrationPageValueThreeV2.selectDeliveryKuryeromMoskovskayaOblast();
        myAppV2.registrationPageValueThreeV2.inputTextIntoFamiliaField(familia);
        myAppV2.registrationPageValueThreeV2.inputTextIntoFieldImia(imia);
        myAppV2.registrationPageValueThreeV2.inputTextIntoFieldOtchestvo(otchestvo);
        myAppV2.registrationPageValueThreeV2.selectDropDownDen(den);
        myAppV2.registrationPageValueThreeV2.selectDropDownMesiac(mesiac);
        myAppV2.registrationPageValueThreeV2.selectDropDownGod(god);
        myAppV2.registrationPageValueThreeV2.inputTextIntoFieldPochta(email);
        myAppV2.registrationPageValueThreeV2.inputTextIntoFieldParol(pass);
        myAppV2.registrationPageValueThreeV2.inputTextIntoFieldPovtoriteParol(repass);
        myAppV2.registrationPageValueThreeV2.inputTextIntoFieldTelefonMobilniy(cellphone);
        myAppV2.registrationPageValueThreeV2.inputTextIntoTelefonDomashniyIliRabochiyField(homeOrWorkPhone);
        myAppV2.registrationPageValueThreeV2.inputTextIntoTelefonDopolnitelniyField(extraPhone);
        myAppV2.registrationPageValueThreeV2.inputTextIntoAdresTextArea(address);
        myAppV2.registrationPageValueThreeV2.inputTextIntoKakProyexatTextArea(howaddress);
        myAppV2.registrationPageValueThreeV2.inputTextIntoAdresDopolnitelniyTextArea(addressExtra);
        myAppV2.registrationPageValueThreeV2.inputTextIntoKakProyaxatDopolnitelniyTextArea(howAddressExtra);
        myAppV2.registrationPageValueThreeV2.pressButtonDaleeEnter();
        myAppV2.registrationPageValueThreeV2.pressButtonRegistrirovat();
        Assert.assertTrue("Registration failed", myAppV2.registrationPageValueThreeV2.isMessageSpasiboLoaded());
    }

    @After

    public void closePageAndBrowser() {

        myAppV2.registrationPageValueThreeV2.closeRegistrationPageAndWindow();
    }
}

