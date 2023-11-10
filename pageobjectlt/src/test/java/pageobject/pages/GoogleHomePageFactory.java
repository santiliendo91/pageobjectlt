package pageobject.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageFactory {
    
    WebDriver driver;

    @FindBy(name = "q")
    WebElement textBoxSearch;

    @FindBy(name = "btnK")
    WebElement buttonSearch;

    public GoogleHomePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void fillTextBoxSearch(String text){
        textBoxSearch.clear();
        textBoxSearch.sendKeys(text);
    }

    private void clickButtonSearch(){
        buttonSearch.click();
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
