@Shopping
  Feature: Checkout
    As a user I want to shop on website saucedemo. Start from login until checkout.

    Scenario: Checkout Product
      Given User already on website saucedemo.com
      When User inputs "standard_user" as userName and inputs "secret_sauce" as password, and clicks login button
      And User already on product page
      And User sorts products by "Name (Z to A)"
      And User clicks add products "Test.allTheThings() T-Shirt (Red)" and "Sauce Labs Onesie" to cart
      Then User clicks cart button
      When User already on cart page
      And User clicks remove product Test.allTheThings T-Shirt Red
      And User clicks checkout button
      Then User already on checkout page
      When User inputs "Faruqi" as firstName, inputs "Rabbani" as lastName, and inputs "007XXX" as postalCode
      And User clicks continue button
      Then User already on checkout overview page
      When User verifies that Sauce Labs Onesie as a product in the checkout list
      And User verifies the total price of item is "$8.63"
      And User clicks finish button
      Then User already on Checkout: Complete! page


