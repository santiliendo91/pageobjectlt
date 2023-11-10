package pageobject.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage{

    WebDriver driver;
    private By textBoxSearch = By.name("q");
    private By buttonSearch = By.name("btnK");

    public GoogleHomePage(WebDriver driver){
        this.driver = driver;
    }

    private void fillTextBoxSearch(String text){
        driver.findElement(textBoxSearch).clear();
        driver.findElement(textBoxSearch).sendKeys(text);
    }

    private void clickButtonSearch(){
        driver.findElement(buttonSearch).click();
    }

    public void searchGoogle(String textToSearch){
        fillTextBoxSearch(textToSearch);
        clickButtonSearch();
    }

    public void isUserInSearchResults(String expectedTitle){
        assertEquals(
            "El titulo es el correcto", 
            expectedTitle,
            driver.getTitle());
    }
}