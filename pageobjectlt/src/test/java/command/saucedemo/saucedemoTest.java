package command.saucedemo;

import command.googlesearch.GoogleSearchCommands;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class saucedemoTest {

    WebDriver driver;
    static String URLSAUCEDEMO = "https://www.saucedemo.com/v1/";

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get(URLSAUCEDEMO);
    }

    @Test
    public void sauceDemoLogin(){
        saucedemoAppCommands.saucedemoLogin(driver, "standard_user", "secret_sauce");
    }

    @Test
    public void sauceDemoShopTest(){
        saucedemoAppCommands.saucedemoLogin(driver, "standard_user", "secret_sauce");
        saucedemoAppCommands.addItemsToCart(driver, 5);
        saucedemoAppCommands.checkout(driver);
        saucedemoAppCommands.fillCheckoutForm(driver, "Santi", "Liendo", "0000");
        saucedemoAppCommands.finishCheckout(driver);
        saucedemoAppCommands.logout(driver);
    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
