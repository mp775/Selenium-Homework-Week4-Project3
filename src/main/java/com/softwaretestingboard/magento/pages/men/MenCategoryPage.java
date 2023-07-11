package com.softwaretestingboard.magento.pages.men;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenCategoryPage extends Utility {

    By size32WebElement = By.xpath("//div[@id='option-label-size-143-item-175']");
    By colourWebElement = By.xpath("(//div[@id='option-label-color-93-item-49'])[1]");
    By addToCartBtn = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By message = By.xpath("//div[@data-bind = 'html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartWebElement = By.xpath("//a[contains(text(),'shopping cart')]");
    By yogaPantWebElement = By.xpath("//a[@class='product-item-link'][normalize-space()='Cronus Yoga Pant']");

    public void mouseHoverOnProductNameAndSelectColour(){
        mouseHoverToElement(yogaPantWebElement);
        clickOnElement(colourWebElement);
    }

    public String getNotificationForAddedProduct(){
        return getTextFromElement(message);
    }

    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartWebElement);
    }

    public void mouseHoverOnProductNameAndSelectSize(){
        mouseHoverToElement(yogaPantWebElement);
        clickOnElement(size32WebElement);
    }

    public void mouseHoverOnProductNameAndClickOnAddToCartButton(){
        mouseHoverToElement(yogaPantWebElement);
        clickOnElement(addToCartBtn);
    }

}
