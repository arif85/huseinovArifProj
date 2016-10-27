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
public class RegistrationPageKuryeromMoskvaV2 {

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

    public RegistrationPageKuryeromMoskvaV2(String familia, String imia, String otchestvo, String den, String mesiac,
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
        return new SpreadsheetData(spreadsheet, "KuryeromMoskva").getData();
    }


    @Before

    public void mainPageLoad() throws Exception {
        myAppV2.mainPageLoad.openBrowser();
        myAppV2.mainPageLoad.loadMainPage();
        Assert.assertTrue("Wrong URL was input", myAppV2.mainPageLoad.isMainPageLoaded());
        myAppV2.mainPageLoad.goToRegistrationPage();
    }

    @Test

    public void registrationPageKuryeromMoskvaV2() {
        myAppV2.registrationPageValueTwoV2.isRegistrationPageLoad();
        myAppV2.registrationPageValueTwoV2.selectDeliveryTypeKuryeromMoskva();
        myAppV2.registrationPageValueTwoV2.inputTextIntoFamiliaField(familia);
        myAppV2.registrationPageValueTwoV2.inputTextIntoFieldImia(imia);
        myAppV2.registrationPageValueTwoV2.inputTextIntoFieldOtchestvo(otchestvo);
        myAppV2.registrationPageValueTwoV2.selectDropDownDen(den);
        myAppV2.registrationPageValueTwoV2.selectDropDownMesiac(mesiac);
        myAppV2.registrationPageValueTwoV2.selectDropDownGod(god);
        myAppV2.registrationPageValueTwoV2.inputTextIntoFieldPochta(email);
        myAppV2.registrationPageValueTwoV2.inputTextIntoFieldParol(pass);
        myAppV2.registrationPageValueTwoV2.inputTextIntoFieldPovtoriteParol(repass);
        myAppV2.registrationPageValueTwoV2.inputTextIntoFieldTelefonMobilniy(cellphone);
        myAppV2.registrationPageValueTwoV2.inputTextIntoTelefonDomashniyIliRabochiyField(homeOrWorkPhone);
        myAppV2.registrationPageValueTwoV2.inputTextIntoTelefonDopolnitelniyField(extraPhone);
        myAppV2.registrationPageValueTwoV2.inputTextIntoAdresTextArea(address);
        myAppV2.registrationPageValueTwoV2.inputTextIntoKakProyexatTextArea(howaddress);
        myAppV2.registrationPageValueTwoV2.inputTextIntoAdresDopolnitelniyTextArea(addressExtra);
        myAppV2.registrationPageValueTwoV2.inputTextIntoKakProyaxatDopolnitelniyTextArea(howAddressExtra);
        myAppV2.registrationPageValueTwoV2.pressButtonDaleeEnter();
        myAppV2.registrationPageValueTwoV2.pressButtonRegistrirovat();
        Assert.assertTrue("Registration failed", myAppV2.registrationPageValueTwoV2.isMessageSpasiboLoaded());
    }

    @After

    public void closePageAndBrowser() {

        myAppV2.registrationPageValueTwoV2.closeRegistrationPageAndWindow();
    }


}
