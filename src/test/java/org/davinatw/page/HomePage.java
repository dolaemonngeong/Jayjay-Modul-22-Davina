package org.davinatw.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    WebDriver driver;


    By headerDisplay = By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div");

    private By addToCartButton = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    private By removeButton = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");
    private By cartBadge = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");

    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    public boolean validateHeaderDisplayed(){

        return driver.findElement(headerDisplay).isDisplayed();
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public boolean validateRemoveButtonDisplayed() {
        return driver.findElement(removeButton).isDisplayed();
    }

    public String getCartItemCount() {
        return driver.findElement(cartBadge).getText();
    }
}
