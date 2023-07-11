package com.softwaretestingboard.magento.pages.gear;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearCategoryPage extends Utility {
    By productOvernightDuffleWebElement = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By productNameWebElement = By.xpath("//span[contains(text(),'Overnight Duffle')]");
    By quantityBoxWebElement = By.xpath("//input[@id='qty']");
    By addToCartBtn = By.cssSelector("button[id='product-addtocart-button'] span");
    By productAddedNotificationWebElement = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    By productNameInShoppingCartWebElement = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By productQuantityInShoppingCartWebElement = By.xpath("//td[@data-th='Qty']/div/div/label/input");
    By productPriceInShoppingCartWebElement = By.xpath("//td[@data-th='Subtotal']");
    By quantityBoxInCartWebElement = By.xpath("//td[@data-th='Qty']/div/div/label/input");
    By updateShoppingCartBtn = By.xpath("//span[contains(text(),'Update Shopping Cart')]");
    By updatedPriceWebElement = By.xpath("//td[@data-th='Subtotal']");

    public void clickOnSpecificProduct(){
        clickOnElement(productOvernightDuffleWebElement);
    }

    public String verifyProductText(){
        return getTextFromElement(productNameWebElement);
    }

    public void changeProductQuantity(){
        clearWebElementText(quantityBoxWebElement);
        sendTextToElement(quantityBoxWebElement,"3");
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartBtn);
    }

    public String verifyProductAddedToShoppingCartNotificationText(){
        return getTextFromElement(productAddedNotificationWebElement);
    }

    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }

    public String verifyProductNameInShoppingCart(){
        return getTextFromElement(productNameInShoppingCartWebElement);
    }

    public String verifyProductQuantityInShoppingCart(){
        return getAttributeValueOfElement(productQuantityInShoppingCartWebElement, "value");
    }

    public String verifyProductPriceInShoppingCart(){
        return getTextFromElement(productPriceInShoppingCartWebElement);
    }

    public void changeProductQuantityInShoppingCart(){
        clearWebElementText(quantityBoxInCartWebElement);
        sendTextToElement(quantityBoxInCartWebElement,"5");
    }

    public void clickOnUpdateShoppingCartButton(){
        clickOnElement(updateShoppingCartBtn);
    }

    public String verifyUpdatedPriceInShoppingCart(){
        return getTextFromElement(updatedPriceWebElement);
    }

}
