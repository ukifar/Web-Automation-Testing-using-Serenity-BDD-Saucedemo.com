package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public static WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='cart_desc_label']")
    private WebElement displayCartPage;
    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement buttonRemoveTestAllTheThingsTShirt;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement buttonCheckout;

    public boolean verifyCartPage() {
        return displayCartPage.isDisplayed();
    }
    public void clickRemoveTestAllTheThingsTShirt() {
        buttonRemoveTestAllTheThingsTShirt.click();
    }
    public void clickCheckout() {
        buttonCheckout.click();
    }

}
