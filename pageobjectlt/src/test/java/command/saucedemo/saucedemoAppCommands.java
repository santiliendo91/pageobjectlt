package command.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class saucedemoAppCommands {

    public static void saucedemoLogin(WebDriver driver, String user, String passw){
        driver.findElement(saucedemoAppElements.TextBoxUser).sendKeys(user);
        driver.findElement(saucedemoAppElements.TextBoxPassw).sendKeys(passw);
        driver.findElement(saucedemoAppElements.LoginBtn).click();
        assert driver.findElement(saucedemoAppElements.LoginCompleteAssertion).isDisplayed();
    }

    public static void addItemsToCart(WebDriver driver, int qty ){
        for(int i = 0; i<=qty; i++){
        driver.findElement(saucedemoAppElements.addtoCart).click();
        }
        driver.findElement(saucedemoAppElements.openCartBtn).click();
    }

    public static void checkout(WebDriver driver){
        driver.findElement(saucedemoAppElements.checkoutBtn).click();
    }

    public static void fillCheckoutForm(WebDriver driver, String name, String lastname, String zipc){
        driver.findElement(saucedemoAppElements.firstname).sendKeys(name);
        driver.findElement(saucedemoAppElements.lastname).sendKeys(lastname);
        driver.findElement(saucedemoAppElements.zipcode).sendKeys(zipc);
        driver.findElement(saucedemoAppElements.continueBtn).click();
        assert driver.findElement(saucedemoAppElements.assertionChckout).isDisplayed();
    }

    public static void finishCheckout(WebDriver driver){
        driver.findElement(saucedemoAppElements.finishBtn).click();
        assert driver.findElement(saucedemoAppElements.getAssertionChckoutFinished).isDisplayed();
    }

    public static void logout(WebDriver driver){
        driver.findElement(saucedemoAppElements.OpenMoreBtn).click();
        driver.findElement(saucedemoAppElements.logoutOptn).click();
        assert driver.findElement(saucedemoAppElements.LoginBtn).isDisplayed();
    }

}
