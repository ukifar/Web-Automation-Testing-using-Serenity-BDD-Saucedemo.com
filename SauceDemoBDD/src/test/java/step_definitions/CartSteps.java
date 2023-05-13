package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {

    private WebDriver webDriver;

    public CartSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User already on cart page")
    public void verifyCartPage() {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.verifyCartPage());
    }

    @And("User clicks remove product Test.allTheThings T-Shirt Red")
    public void removeProduct() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickRemoveTestAllTheThingsTShirt();
    }

    @And("User clicks checkout button")
    public void clickCheckout() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickCheckout();
    }

}
