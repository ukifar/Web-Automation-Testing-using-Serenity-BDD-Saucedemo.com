package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public static WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement checkoutInformationVerification;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement buttonContinue;
    @FindBy(xpath = "//div[@class='cart_desc_label']")
    private WebElement checkoutOverviewVerification;
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement sauceLabsOnesieVerification;
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement priceOfGoodsVerification;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement buttonFinish;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement finishOrderVerification;

    public boolean verifyCheckoutInformationPage() {
        return checkoutInformationVerification.isDisplayed();
    }
    public void inputFirstName(String first) {
        firstName.sendKeys(first);
    }
    public void inputLastName(String last) {
        lastName.sendKeys(last);
    }
    public void inputPostalCode(String postal) {
        postalCode.sendKeys(postal);
    }
    public void clickContinue() {
        buttonContinue.click();
    }
    public boolean verifyCheckoutOverviewPage() {
        return checkoutOverviewVerification.isDisplayed();
    }
    public boolean verifySauceLabs() {
        return sauceLabsOnesieVerification.isDisplayed();
    }
    public String verifyPriceOfGoods() {
        return priceOfGoodsVerification.getText().replace("Total: ", "");
    }
    public void clickFinish() {
        buttonFinish.click();
    }
    public boolean verifyFinishOrder() {
        return finishOrderVerification.isDisplayed();
    }
}
