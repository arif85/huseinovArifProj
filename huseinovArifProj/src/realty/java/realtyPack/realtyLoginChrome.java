package realtyPack;

import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;

import java.util.concurrent.TimeUnit;

public class realtyLoginChrome {

    WebDriver driver = new ChromeDriver();

    @Test

    public void RealtyLogin() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://100realty.ua/");
        driver.findElement(By.xpath(".//a[@id='enter']")).click();
        driver.findElement(By.id("edit-name")).sendKeys("huseinov.arif@gmail.com");
        driver.findElement(By.id("edit-pass")).sendKeys("3463090");
        driver.findElement(By.id("edit-submit")).click();
        /**WebDriverWait wait = new WebDriverWait(driver,30);
         *wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//div[@id='block-realty_ajaxblocks-login_block_or_menu']"))));
         *wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//a[@href='/user/me']"))));
         */
        WebElement element = driver.findElement(By.xpath(".//div[@id='block-realty_ajaxblocks-login_block_or_menu']"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        //driver.findElement(By.xpath(".//div[@id='block-realty_ajaxblocks-login_block_or_menu']")).click();
        driver.findElement(By.xpath(".//a[@href='/user/me']")).click();
        driver.findElement(By.xpath(".//a[@href='/user/me/objects']")).click();
        driver.findElement(By.id("edit-remove-371859698")).click();
        driver.findElement(By.name("op")).click();
        try {
            if (!driver.findElement(By.xpath(".//div[@class='messages status']")).isDisplayed()) ;
        } catch (NoSuchElementException e) {
            System.out.println("You did not check checkbox");
        }
        /**wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//div[@id='block-realty_ajaxblocks-login_block_or_menu']"))));
         *driver.findElement(By.xpath(".//div[@id='block-realty_ajaxblocks-login_block_or_menu']")).click();
         *wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//a[@href='/logout']"))));
         */
        WebElement element1 = driver.findElement(By.xpath(".//div[@id='block-realty_ajaxblocks-login_block_or_menu']"));
        Actions action1 = new Actions(driver);
        action1.moveToElement(element1).build().perform();
        driver.findElement(By.xpath(".//a[@href='/logout']")).click();
        driver.navigate().refresh();
        driver.quit();
    }
}
