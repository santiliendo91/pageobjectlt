package command.saucedemo;

import org.openqa.selenium.By;

public class saucedemoAppElements {

    public static By TextBoxUser = By.name("user-name");

    public static By TextBoxPassw = By.name("password");

    public static By LoginBtn = By.id("login-button");

    public static By LoginCompleteAssertion = By.xpath("//div[@class='product_label']");

    public static By addtoCart = By.xpath("//button[contains(text(),'ADD TO CART')]");

    public static By openCartBtn = By.xpath("//div[@class='shopping_cart_container']");

    public static By checkoutBtn = By.xpath("//a[@class='btn_action checkout_button']");

    public static By firstname = By.id("first-name");

    public static By lastname = By.id("last-name");

    public static By zipcode = By.id("postal-code");

    public static By continueBtn = By.xpath("//input[@class='btn_primary cart_button']");

    public static By assertionChckout = By.xpath("//div[@class='subheader']");

    public static By finishBtn = By.xpath("//a[@class='btn_action cart_button']");

    public static By getAssertionChckoutFinished = By.xpath("//img[@class='pony_express']");

    public static By OpenMoreBtn = By.xpath("//button[contains(text(),'Open Menu')]");

    public static By logoutOptn = By.xpath("//nav/a[@id='logout_sidebar_link']");


}
