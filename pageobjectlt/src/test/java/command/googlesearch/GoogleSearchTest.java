package command.googlesearch;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

    WebDriver driver;
    static String URLGOOGLE = "https://www.google.com";

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get(URLGOOGLE);
    }

    @Test
    public void SeleniumWebDriverSearch(){
        GoogleSearchCommands.searchGoogle(driver, "Selenium WebDriver");
        GoogleSearchCommands.isUserInResults(driver, "Selenium WebDriver - Buscar con Google");
    }
    
    @Test
    public void FormulaOneSearch(){
        GoogleSearchCommands.searchGoogle(driver, "Formula 1");
        GoogleSearchCommands.isUserInResults(driver, "Formula 1 - Buscar con Google");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
