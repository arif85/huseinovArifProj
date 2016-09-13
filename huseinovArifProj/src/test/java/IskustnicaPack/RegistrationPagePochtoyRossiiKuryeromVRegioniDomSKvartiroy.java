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
public class RegistrationPagePochtoyRossiiKuryeromVRegioniDomSKvartiroy {

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
    String stranaOblasKray;
    String city;
    String ulica;
    String dom;
    String korpus;
    String stroyeniye;
    String kvartira;
    String addressExtra;

    public RegistrationPagePochtoyRossiiKuryeromVRegioniDomSKvartiroy(String familia, String imia, String otchestvo, String den,
                                                                      String mesiac, String god, String pochta, String pass,
                                                                      String repass, String cellphone, String postIndex,
                                                                      String stranaOblasKray, String city, String ulica,
                                                                      String dom, String korpus, String stroyeniye,
                                                                      String kvartira, String addressExtra){
        super();
        this.familia=familia;
        this.imia=imia;
        this.otchestvo=otchestvo;
        this.den=den;
        this.mesiac=mesiac;
        this.god=god;
        this.pochta=pochta;
        this.pass=pass;
        this.repass=repass;
        this.cellphone=cellphone;
        this.postIndex=postIndex;
        this.stranaOblasKray=stranaOblasKray;
        this.city=city;
        this.ulica=ulica;
        this.dom=dom;
        this.korpus=korpus;
        this.stroyeniye=stroyeniye;
        this.kvartira=kvartira;
        this.addressExtra=addressExtra;
    }
    @Parameterized.Parameters
    public static Collection testData() throws IOException{
        InputStream spreadsheet = new FileInputStream(getCfgValue("DATA_FILE"));
        return new SpreadsheetData(spreadsheet,"KuryeromRossiaDomKvartira").getData();
    }
    @Before
    public void MainPageLoad(){
        myApp.mainPage.OpenBrowserAndLoadMainPage();
        Assert.assertTrue("Wrong URL inputed",myApp.mainPage.isMainPageLoaded());
        myApp.mainPage.GoToRegistrationPage();
    }
    @Test
    public void registrationPagePochtoyRossiiKuryeromVRegioni(){
        myApp.registrationPageValueFour.isRegistrationPageLoaded();
        myApp.registrationPageValueFour.selectDeliveryPochtoyRossiiKuryeromVRegioniDomSKvartiory();
        myApp.registrationPageValueFour.inputTextIntoFamiliaField(familia);
        myApp.registrationPageValueFour.inputTextIntoImiaField(imia);
        myApp.registrationPageValueFour.inputTextIntoOtchestvoField(otchestvo);
        myApp.registrationPageValueFour.selectDropDownDen(den);
        myApp.registrationPageValueFour.selectDropDownMesiac(mesiac);
        myApp.registrationPageValueFour.selectDropDownGod(god);
        myApp.registrationPageValueFour.inputTextIntoPochtaField(pochta);
        myApp.registrationPageValueFour.inputTexIntoParolField(pass);
        myApp.registrationPageValueFour.inputTextIntoPovtoriteParolField(repass);
        myApp.registrationPageValueFour.inputTextIntoTelefonMobilniyField(cellphone);
        myApp.registrationPageValueFour.inputTextIntoPochtoviyIndexField(postIndex);
        myApp.registrationPageValueFour.inputTextIntoStranaOblastKrayField(stranaOblasKray);
        myApp.registrationPageValueFour.inputTextIntoGorodNaselenniyPunktField(city);
        myApp.registrationPageValueFour.inputTextIntoUlicaField(ulica);
        myApp.registrationPageValueFour.inputTextIntoDomNomerField(dom);
        myApp.registrationPageValueFour.inputTextIntoKorpusField(korpus);
        myApp.registrationPageValueFour.inputTextIntoStroyeniyeField(stroyeniye);
        myApp.registrationPageValueFour.inputTextIntoKvartiraNomerField(kvartira);
        myApp.registrationPageValueFour.inputTextIntoDopolnitelniyAdresTextArea(addressExtra);
        myApp.registrationPageValueFour.uncheckCheckBoxRassilka();
        myApp.registrationPageValueFour.clickButtonDaleeEnter();
        myApp.registrationPageValueFour.clickButtonRegistrirvat();
        Assert.assertTrue("Registration failed",myApp.registrationPageMessageSpasibo.isMessageSpasiboLoaded());
    }
    @After
    public void closePageAndBrowser(){
        myApp.registrationPageMessageSpasibo.CloseRegistrationPageAndWindow();
    }


}
