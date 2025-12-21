package org.davinatw.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.davinatw.BaseTest;
import org.davinatw.page.HomePage;

import static org.junit.Assert.assertEquals;

public class HomeStepDef extends BaseTest {
    HomePage homePage;

    @Given("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateBackButoonDisplayed();
    }

    @Then("user should be redirected to homepage")
    public void validateUserIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateBackButoonDisplayed();
    }

    @When("user click add to cart button")
    public void userClickAddToCartButton() {
        homePage.clickAddToCart();
    }

    @Then("add to cart button changes to remove button")
    public void addToCartButtonChangesToRemove() {
        homePage.validateRemoveButtonDisplayed();
    }

    @Then("cart icon shows item count")
    public void cartIconShowsItemCount() {
        assertEquals("1", homePage.getCartItemCount());
    }


}
