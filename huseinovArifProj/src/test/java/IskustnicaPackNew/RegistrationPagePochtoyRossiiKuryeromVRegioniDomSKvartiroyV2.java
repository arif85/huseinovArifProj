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
public class RegistrationPagePochtoyRossiiKuryeromVRegioniDomSKvartiroyV2 {

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
    String stranaOblasKray;
    String city;
    String ulica;
    String dom;
    String korpus;
    String stroyeniye;
    String kvartira;
    String addressExtra;

    public RegistrationPagePochtoyRossiiKuryeromVRegioniDomSKvartiroyV2(String familia, String imia, String otchestvo, String den,
                                                                        String mesiac, String god, String pochta, String pass,
                                                                        String repass, String cellphone, String postIndex,
                                                                        String stranaOblasKray, String city, String ulica,
                                                                        String dom, String korpus, String stroyeniye,
                                                                        String kvartira, String addressExtra) {
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
        this.stranaOblasKray = stranaOblasKray;
        this.city = city;
        this.ulica = ulica;
        this.dom = dom;
        this.korpus = korpus;
        this.stroyeniye = stroyeniye;
        this.kvartira = kvartira;
        this.addressExtra = addressExtra;
    }

    @Parameterized.Parameters
    public static Collection testData() throws IOException {
        InputStream spreadsheet = new FileInputStream(getCfgValue("DATA_FILE"));
        return new SpreadsheetData(spreadsheet, "KuryeromRossiaDomKvartira").getData();
    }

    @Before
    public void mainPageLoad() throws Exception {
        myAppV2.mainPageLoad.openBrowser();
        myAppV2.mainPageLoad.loadMainPage();
        Assert.assertTrue("Wrong URL inputed", myAppV2.mainPageLoad.isMainPageLoaded());
        myAppV2.mainPageLoad.goToRegistrationPage();
    }

    @Test
    public void registrationPagePochtoyRossiiKuryeromVRegioniV2() {
        myAppV2.registrationPageValueFourV2.isRegistrationPageLoad();
        myAppV2.registrationPageValueFourV2.selectDeliveryPochtoyRossiiKuryeromVRegioniDomSKvartiory();
        myAppV2.registrationPageValueFourV2.inputTextIntoFamiliaField(familia);
        myAppV2.registrationPageValueFourV2.inputTextIntoFieldImia(imia);
        myAppV2.registrationPageValueFourV2.inputTextIntoFieldOtchestvo(otchestvo);
        myAppV2.registrationPageValueFourV2.selectDropDownDen(den);
        myAppV2.registrationPageValueFourV2.selectDropDownMesiac(mesiac);
        myAppV2.registrationPageValueFourV2.selectDropDownGod(god);
        myAppV2.registrationPageValueFourV2.inputTextIntoFieldPochta(pochta);
        myAppV2.registrationPageValueFourV2.inputTextIntoFieldParol(pass);
        myAppV2.registrationPageValueFourV2.inputTextIntoFieldPovtoriteParol(repass);
        myAppV2.registrationPageValueFourV2.inputTextIntoFieldTelefonMobilniy(cellphone);
        myAppV2.registrationPageValueFourV2.inputTextIntoPochtoviyIndexField(postIndex);
        myAppV2.registrationPageValueFourV2.inputTextIntoStranaOblastKrayField(stranaOblasKray);
        myAppV2.registrationPageValueFourV2.inputTextIntoGorodNaselenniyPunktField(city);
        myAppV2.registrationPageValueFourV2.inputTextIntoUlicaField(ulica);
        myAppV2.registrationPageValueFourV2.inputTextIntoDomNomerField(dom);
        myAppV2.registrationPageValueFourV2.inputTextIntoKorpusField(korpus);
        myAppV2.registrationPageValueFourV2.inputTextIntoStroyeniyeField(stroyeniye);
        myAppV2.registrationPageValueFourV2.inputTextIntoKvartiraNomerField(kvartira);
        myAppV2.registrationPageValueFourV2.inputTextIntoAdresDopolnitelniyTextArea(addressExtra);
        myAppV2.registrationPageValueFourV2.uncheckCheckBoxRassilka();
        myAppV2.registrationPageValueFourV2.pressButtonDaleeEnter();
        myAppV2.registrationPageValueFourV2.pressButtonRegistrirovat();
        Assert.assertTrue("Registration failed", myAppV2.registrationPageValueFourV2.isMessageSpasiboLoaded());
    }

    @After
    public void closePageAndBrowser() {
        myAppV2.registrationPageValueFourV2.closeRegistrationPageAndWindow();
    }


}
