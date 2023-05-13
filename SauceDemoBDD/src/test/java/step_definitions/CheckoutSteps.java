package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CheckoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {

    private WebDriver webDriver;

    public CheckoutSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on checkout page")
    public void verifyCheckoutInformationPage() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkoutPage.verifyCheckoutInformationPage());
    }

    @When("User inputs \"(.*)\" as firstName, inputs \"(.*)\" as lastName, and inputs \"(.*)\" as postalCode")
    public void inputBuyerInformation(String firstName, String lastName, String postalCode) {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.inputFirstName(firstName);
        checkoutPage.inputLastName(lastName);
        checkoutPage.inputPostalCode(postalCode);
    }

    @And("User clicks continue button")
    public void clickContinue() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.clickContinue();
    }

    @Then("User already on checkout overview page")
    public void verifyCheckoutOverviewPage() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkoutPage.verifyCheckoutOverviewPage());
    }

    @When("User verifies that Sauce Labs Onesie as a product in the checkout list")
    public void verifySelectedProduct() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkoutPage.verifySauceLabs());
    }

    @And("User verifies the total price of item is \"(.*)\"")
    public void verifyPriceIsMatched(String totalPrice) {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertEquals(totalPrice, checkoutPage.verifyPriceOfGoods());
    }

    @And("User clicks finish button")
    public void clickCFinish() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.clickFinish();
    }

    @Then("User already on Checkout: Complete! page")
    public void verifyCheckoutCompletePage() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkoutPage.verifyFinishOrder());
    }

}
