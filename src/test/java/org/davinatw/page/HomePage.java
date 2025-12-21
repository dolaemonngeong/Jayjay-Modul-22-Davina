package org.davinatw.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    WebDriver driver;

//    By backPackItem = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    By backPackItem = By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div");

    private By addToCartButton = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    private By removeButton = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");
    private By cartBadge = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");

    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    public void validateBackButoonDisplayed(){

        assertTrue(driver.findElement(backPackItem).isDisplayed());
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void validateRemoveButtonDisplayed() {
        assertTrue(driver.findElement(removeButton).isDisplayed());
    }

    public void validateCartBadgeDisplayed() {
        assertTrue(driver.findElement(cartBadge).isDisplayed());
    }

    public String getCartItemCount() {
        return driver.findElement(cartBadge).getText();
    }
}

