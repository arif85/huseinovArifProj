package IskustnicaPackNew;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators {

    @FindBy(xpath = ".//img[@src='/images/10.gif']")
    WebElement isRegistrationPageLoad;
    @FindBy(xpath = ".//input[@value='1']")
    WebElement deliveryType1;
    @FindBy(xpath = ".//input[@value='2']")
    WebElement deliveryType2;
    @FindBy(xpath = ".//input[@value='3']")
    WebElement deliveryType3;
    @FindBy(xpath = ".//input[@value='4']")
    WebElement deliveryType4;
    @FindBy(xpath = ".//input[@value='5']")
    WebElement deliveryType5;
    @FindBy(name = "phone[mobil]")
    WebElement telefonMobilny;
    @FindBy(name = "family")
    WebElement familia;
    @FindBy(name = "name")
    WebElement imia;
    @FindBy(name = "father")
    WebElement otchestvo;
    @FindBy(name = "date")
    WebElement den;
    @FindBy(name = "month")
    WebElement mesiac;
    @FindBy(name = "year")
    WebElement god;
    @FindBy(name = "email")
    WebElement pochta;
    @FindBy(name = "pass")
    WebElement parol;
    @FindBy(name = "repass")
    WebElement povtoriteParol;
    @FindBy(name = "phone[mobil]")
    WebElement mobilniyTelefon;
    @FindBy(name = "adress[main]")
    WebElement adress;
    @FindBy(name = "phone[home]")
    WebElement telefonDomashniyIliRabochiy;
    @FindBy(name = "phone[work]")
    WebElement telefonDopolnitelniy;
    @FindBy(name = "adress[main]")
    WebElement address;
    @FindBy(name = "howadres")
    WebElement kakProyexat;
    @FindBy(name = "adress[add]")
    WebElement dopolnitelniyAdress;
    @FindBy(name = "howadres_add")
    WebElement kakProyexatDopolnitelniyAdress;
    @FindBy(name = "postindex")
    WebElement poshtoviyIndex;
    @FindBy(name = "otheraddr[flat]")
    WebElement kvartiraNomer;
    @FindBy(name = "mailing")
    WebElement checkboxPodpiska;
    @FindBy(name = "postindex")
    WebElement pochtoviyIndex;
    @FindBy(name = "otheraddr[country]")
    WebElement stranaOblastKray;
    @FindBy(name = "city")
    WebElement gorod;
    @FindBy(name = "otheraddr[street]")
    WebElement ulica;
    @FindBy(name = "otheraddr[house]")
    WebElement domNomer;
    @FindBy(name = "otheraddr[corp]")
    WebElement korpusNomerIliProcherkEsliNet;
    @FindBy(name = "otheraddr[build]")
    WebElement stroyeniyeNomerIliProcherkEsliNet;
    @FindBy(name = "adress[add]")
    WebElement adresDopolnitelniy;
    @FindBy(id = "btnR")
    WebElement knopkaDaleeEnter;
    @FindBy(xpath = ".//table//td//input[@id='btnR' and @class='autor']")
    WebElement knopkaRegistirovat;
    @FindBy(xpath = ".//h3[@style='color: green;']")
    WebElement messageSpasibo;

}
