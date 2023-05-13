package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductSteps {

    private WebDriver webDriver;

    public ProductSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User already on product page")
    public void verifyProductPage() {
        ProductPage productPage = new ProductPage(webDriver);
        Assert.assertTrue(productPage.verifyProductPage());
    }

    @And("User sorts products by \"(.*)\"")
    public void sortProduct(String sortBy) {
        ProductPage productPage = new ProductPage(webDriver);
        productPage.sortProduct(sortBy);
    }

    @And("User clicks add products \"(.*)\" and \"(.*)\" to cart")
    public void clickProduct(String product1, String product2) {
        ProductPage productPage = new ProductPage(webDriver);
        productPage.productClick(product1);
        productPage.productClick(product2);
    }

    @Then("User clicks cart button")
    public void clickCart() {
        ProductPage productPage = new ProductPage(webDriver);
        productPage.clickCart();
    }

}
