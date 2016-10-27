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
public class RegistrationPagePochtoyRossiiKuryeromVRegioniChastniyDomV2 {

    WebDriver driver = new ChromeDriver();
    MyAppV2 myAppV2 = new MyAppV2(driver);
    String familia;
    String imia;
    String otchestvo;
    String den;
    String mesiac;
    String god;
    String pochta;
    String pass;
    String repass;
    String cellphone;
    String postIndex;
    String stranaOblastKray;
    String city;
    String ulica;
    String dom;
    String korpus;
    String stroyenie;
    String addressExtra;

    public RegistrationPagePochtoyRossiiKuryeromVRegioniChastniyDomV2(String familia, String imia, String otchestvo,
                                                                      String den, String mesiac, String god, String pochta,
                                                                      String pass, String repass, String cellphone,
                                                                      String postIndex, String stranaOblastKray,
                                                                      String city, String ulica, String dom, String korpus,
                                                                      String stroyenie, String addressExtra) {
        super();
        this.familia = familia;
        this.imia = imia;
        this.otchestvo = otchestvo;
        this.den = den;
        this.mesiac = mesiac;
        this.god = god;
        this.pochta = pochta;
        this.pass = pass;
        this.repass = repass;
        this.cellphone = cellphone;
        this.postIndex = postIndex;
        this.stranaOblastKray = stranaOblastKray;
        this.city = city;
        this.ulica = ulica;
        this.dom = dom;
        this.korpus = korpus;
        this.stroyenie = stroyenie;
        this.addressExtra = addressExtra;
    }

    @Parameterized.Parameters
    public static Collection testData() throws IOException {
        InputStream spreadsheet = new FileInputStream(getCfgValue("DATA_FILE"));
        return new SpreadsheetData(spreadsheet, "KuryeromRossiaChastniyDom").getData();
    }

    @Before
    public void mainPageLoad() throws Exception {
        myAppV2.mainPageLoad.openBrowser();
        myAppV2.mainPageLoad.loadMainPage();
        Assert.assertTrue("Wrong URL was inputed", myAppV2.mainPageLoad.isMainPageLoaded());
        myAppV2.mainPageLoad.goToRegistrationPage();
    }

    @Test
    public void registrationPagePochtoyRossiiKuryeromVRegioniChastniyDomV2() {
        myAppV2.registrationPageValueFiveV2.isRegistrationPageLoad();
        myAppV2.registrationPageValueFiveV2.selectDeliveryTypePochtoyRossiiKuryeromVRegioniChastniyDom();
        myAppV2.registrationPageValueFiveV2.inputTextIntoFamiliaField(familia);
        myAppV2.registrationPageValueFiveV2.inputTextIntoFieldImia(imia);
        myAppV2.registrationPageValueFiveV2.inputTextIntoFieldOtchestvo(otchestvo);
        myAppV2.registrationPageValueFiveV2.selectDropDownDen(den);
        myAppV2.registrationPageValueFiveV2.selectDropDownMesiac(mesiac);
        myAppV2.registrationPageValueFiveV2.selectDropDownGod(god);
        myAppV2.registrationPageValueFiveV2.inputTextIntoFieldPochta(pochta);
        myAppV2.registrationPageValueFiveV2.inputTextIntoFieldParol(pass);
        myAppV2.registrationPageValueFiveV2.inputTextIntoFieldPovtoriteParol(repass);
        myAppV2.registrationPageValueFiveV2.inputTextIntoFieldTelefonMobilniy(cellphone);
        myAppV2.registrationPageValueFiveV2.inputTextIntoPochtoviyIndexField(postIndex);
        myAppV2.registrationPageValueFiveV2.inputTextIntoStranaOblastKrayField(stranaOblastKray);
        myAppV2.registrationPageValueFiveV2.inputTextIntoGorodNaselenniyPunktField(city);
        myAppV2.registrationPageValueFiveV2.inputTextIntoUlicaField(ulica);
        myAppV2.registrationPageValueFiveV2.inputTextIntoDomNomerField(dom);
        myAppV2.registrationPageValueFiveV2.inputTextIntoKorpusField(korpus);
        myAppV2.registrationPageValueFiveV2.inputTextIntoStroyeniyeField(stroyenie);
        myAppV2.registrationPageValueFiveV2.inputTextIntoAdresDopolnitelniyTextArea(addressExtra);
        myAppV2.registrationPageValueFiveV2.pressButtonDaleeEnter();
        myAppV2.registrationPageValueFiveV2.pressButtonRegistrirovat();
        Assert.assertTrue("Registration Failed", myAppV2.registrationPageValueFiveV2.isMessageSpasiboLoaded());
    }

    @After
    public void closePageAndBrowser() {

        myAppV2.registrationPageValueFiveV2.closeRegistrationPageAndWindow();
    }
}
