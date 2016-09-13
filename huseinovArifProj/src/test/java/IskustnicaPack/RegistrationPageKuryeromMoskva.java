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
public class RegistrationPageKuryeromMoskva {
    WebDriver driver = new ChromeDriver();
    MyApp myApp =  new MyApp(driver);

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

    public RegistrationPageKuryeromMoskva(String familia,String imia,String otchestvo,String den,String mesiac,
                                          String god,String email,String pass,String repass,String cellphone,
                                          String homeOrWorkPhone,String extraPhone, String address,String howaddress,
                                          String addressExtra,String howAddressExtra){
        super();
        this.familia=familia;
        this.imia=imia;
        this.otchestvo=otchestvo;
        this.den=den;
        this.mesiac=mesiac;
        this.god=god;
        this.email=email;
        this.pass=pass;
        this.repass=repass;
        this.cellphone=cellphone;
        this.homeOrWorkPhone = homeOrWorkPhone;
        this.extraPhone = extraPhone;
        this.address=address;
        this.howaddress = howaddress;
        this.addressExtra = addressExtra;
        this.howAddressExtra = howAddressExtra;
    }
    @Parameterized.Parameters
    public static Collection testData() throws IOException{
        InputStream spreadsheet = new FileInputStream(getCfgValue("DATA_FILE"));
        return new SpreadsheetData(spreadsheet,"KuryeromMoskva").getData();
    }

    @Before
    public void MainPageload(){
        myApp.mainPage.OpenBrowserAndLoadMainPage();
        Assert.assertTrue("Wrong URL inputed",myApp.mainPage.isMainPageLoaded());
        myApp.mainPage.GoToRegistrationPage();
    }
    @Test
    public void registrationPageKuryeromMoskva(){
        myApp.registrationPageValueTwo.isRegistrationPageLoaded();
        myApp.registrationPageValueTwo.selectDeliveryKuryeromMoskva();
        myApp.registrationPageValueTwo.inputTextIntoFamiliaField(familia);
        myApp.registrationPageValueTwo.inputTextIntoImiaField(imia);
        myApp.registrationPageValueTwo.inputTextIntoOtchestvoField(otchestvo);
        myApp.registrationPageValueTwo.selectDropDownDen(den);
        myApp.registrationPageValueTwo.selectDropDownMesias(mesiac);
        myApp.registrationPageValueTwo.selectDropDownGod(god);
        myApp.registrationPageValueTwo.inputTextIntoEmailField(email);
        myApp.registrationPageValueTwo.inputTextIntoParolField(pass);
        myApp.registrationPageValueTwo.inputTextIntoPovtoriteParolField(repass);
        myApp.registrationPageValueTwo.inputTextIntoTelefonMobilniyField(cellphone);
        myApp.registrationPageValueTwo.inputTextIntoTelefonDomashniyIliRabochiyField(homeOrWorkPhone);
        myApp.registrationPageValueTwo.inputTextIntoTelefonDopolnitelniyField(extraPhone);
        myApp.registrationPageValueTwo.inputTextIntoAdresTextArea(address);
        myApp.registrationPageValueTwo.inputTextIntoKakProyexatTextArea(howaddress);
        myApp.registrationPageValueTwo.inputTextIntoAdresDopolnitelniyTextArea(addressExtra);
        myApp.registrationPageValueTwo.inputTextIntoKakProyaxatDopolnitelniyTextArea(howAddressExtra);
        myApp.registrationPageValueTwo.clickButtonDaleeEnter();
        myApp.registrationPageValueTwo.clickButtonRegistrirvat();
        Assert.assertTrue("Registration failed",myApp.registrationPageMessageSpasibo.isMessageSpasiboLoaded());
    }
    @After

    public void closePageAndBrowser(){

        myApp.registrationPageMessageSpasibo.CloseRegistrationPageAndWindow();
    }
}

