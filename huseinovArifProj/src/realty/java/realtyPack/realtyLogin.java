package realtyPack;

import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
public class realtyLogin {

    WebDriver driver = new FirefoxDriver();

    @Test

    public void RealtyLogin(){
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("http://100realty.ua/");
            driver.findElement(By.xpath(".//a[@id='enter']")).click();
            driver.findElement(By.id("edit-name")).sendKeys("huseinov.arif@gmail.com");
            driver.findElement(By.id("edit-pass")).sendKeys("mCcak7ozHK");
            driver.findElement(By.id("edit-submit")).click();
            driver.findElement(By.xpath(".//p[@class='h3']")).click();
            driver.findElement(By.xpath(".//a[@href='/user/me']")).click();
            driver.findElement(By.xpath(".//a[@href='/user/me/objects']")).click();
            driver.findElement(By.id("edit-remove-371859698")).click();
            driver.findElement(By.name("op")).click();
            try {
                if (!driver.findElement(By.xpath(".//div[@class='messages status']")).isDisplayed()) ;
            } catch (NoSuchElementException e) {
                System.out.println("You did not check checkbox");
            }
            driver.findElement(By.xpath(".//p[@class='h3']")).click();
            driver.findElement(By.xpath(".//a[@href='/logout']")).click();
            driver.quit();
        }
        }
