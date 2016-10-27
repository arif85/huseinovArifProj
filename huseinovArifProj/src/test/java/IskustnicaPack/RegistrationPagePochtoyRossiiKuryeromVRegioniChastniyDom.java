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
public class RegistrationPagePochtoyRossiiKuryeromVRegioniChastniyDom {

    WebDriver driver = new ChromeDriver();
    MyApp myApp = new MyApp(driver);
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

    public RegistrationPagePochtoyRossiiKuryeromVRegioniChastniyDom(String familia, String imia, String otchestvo,
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
    public void MainPageLoad() {
        myApp.mainPage.OpenBrowserAndLoadMainPage();
        Assert.assertTrue("Wrong URL was inputed", myApp.mainPage.isMainPageLoaded());
        myApp.mainPage.GoToRegistrationPage();
    }

    @Test
    public void registrationPagePochtoyRossiiKuryeromVRegioniChastniyDom() {
        myApp.registrationPageValueFive.IsRegistrationPageLoaded();
        myApp.registrationPageValueFive.selectDeliveryTypePochtoyRossiiKuryeromVRegioniChastniyDom();
        myApp.registrationPageValueFive.inputTextIntoFamiliaField(familia);
        myApp.registrationPageValueFive.inputTextIntoImiaField(imia);
        myApp.registrationPageValueFive.inputTextIntoOtchestvoField(otchestvo);
        myApp.registrationPageValueFive.selectDropDownDen(den);
        myApp.registrationPageValueFive.selectDropDoenMesiac(mesiac);
        myApp.registrationPageValueFive.selectDropDownGod(god);
        myApp.registrationPageValueFive.inputTextIntoPochtaField(pochta);
        myApp.registrationPageValueFive.inputTextIntoParolField(pass);
        myApp.registrationPageValueFive.inputTextIntoPovtoriteParolField(repass);
        myApp.registrationPageValueFive.inputTextIntoTelefonMobilniyField(cellphone);
        myApp.registrationPageValueFive.inputTextIntoPochtoviyIndexField(postIndex);
        myApp.registrationPageValueFive.inputTextIntoStranaOblastKrayField(stranaOblastKray);
        myApp.registrationPageValueFive.inputTextIntoGorodField(city);
        myApp.registrationPageValueFive.inputTextintoUlicaField(ulica);
        myApp.registrationPageValueFive.inputTextIntoDomField(dom);
        myApp.registrationPageValueFive.inputTextIntoKorpusField(korpus);
        myApp.registrationPageValueFive.inputTextIntoStroyeniyeField(stroyenie);
        myApp.registrationPageValueFive.inputTextIntoDopolnitelniyAdresField(addressExtra);
        myApp.registrationPageValueFive.clickButtonDaleeEnter();
        myApp.registrationPageValueFive.clickButtonRegistirovat();
        Assert.assertTrue("Registration Failed", myApp.registrationPageMessageSpasibo.isMessageSpasiboLoaded());
    }

    @After
    public void closePageAndBrowser() {
        myApp.registrationPageMessageSpasibo.closeRegistrationPageAndWindow();
    }
}
