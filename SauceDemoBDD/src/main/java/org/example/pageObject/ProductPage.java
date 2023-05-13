package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    public static WebDriver driver;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement productPageVerification;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectSorting;
    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement buttonCart;

    public boolean verifyProductPage() {
        return productPageVerification.isDisplayed();
    }
    public void sortProduct (String sortBy) {
        Select a = new Select (selectSorting);
        a.selectByVisibleText(sortBy);
    }
    public void productClick(String productName) {
        String productElement = "//div[text()[contains(.,'"+ productName +"')]]/ancestor::div[@class='inventory_item_description']//*[contains(@id,'add-to-cart')]";
        driver.findElement(By.xpath(productElement)).click();
    }
    public void clickCart() {
        buttonCart.click();
    }

}
