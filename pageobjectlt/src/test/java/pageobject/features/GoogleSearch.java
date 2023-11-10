package pageobject.features;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageobject.pages.GoogleHomePage;
import pageobject.pages.GoogleHomePageFactory;

public class GoogleSearch {

    WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
    }

    @Test
    public void SeleniumWebDriverSearch(){
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.searchGoogle("Selenium WebDriver");
        googleHomePage.isUserInSearchResults("Selenium WebDriver - Buscar con Google");
    }

    @Test
    public void FormulaOneSearch(){
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.searchGoogle("Formula 1");
        googleHomePage.isUserInSearchResults("Formula 1 - Buscar con Google");
    }

    @Test
    public void SeleniumWebDriverSearchPageFactory(){
        GoogleHomePageFactory googleHomePageFactory = new GoogleHomePageFactory(driver);
        googleHomePageFactory.searchGoogle("Selenium WebDriver");
        googleHomePageFactory.isUserInSearchResults("Selenium WebDriver - Buscar con Google");
    }

    @Test
    public void FormulaOneSearchPageFactory(){
        GoogleHomePageFactory googleHomePageFactory = new GoogleHomePageFactory(driver);
        googleHomePageFactory.searchGoogle("Formula 1");
        googleHomePageFactory.isUserInSearchResults("Formula 1 - Buscar con Google");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
