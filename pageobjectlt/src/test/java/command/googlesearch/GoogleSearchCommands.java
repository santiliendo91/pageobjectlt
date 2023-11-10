package command.googlesearch;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

public class GoogleSearchCommands {
    
    public static void searchGoogle(WebDriver driver, String text){
        driver.findElement(GoogleSearchPage.textBoxSearch).sendKeys(text);
        driver.findElement(GoogleSearchPage.buttonSearch).click();
    }

    public static void isUserInResults(WebDriver driver, String expectedTitle){
        assertEquals("El usuario se encuenta en la pagina de resultados", 
        expectedTitle,
        driver.getTitle()
        );
    }
}
