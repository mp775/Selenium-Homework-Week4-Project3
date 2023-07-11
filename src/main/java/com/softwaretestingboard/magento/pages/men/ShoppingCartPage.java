package com.softwaretestingboard.magento.pages.men;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By soppingCartText = By.xpath("//span[@class='base']");
    By pantNameText = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By productDetailWebEle = By.xpath("//dl[@class='item-options']");
    public String getShoppingCartTextFromWebEle(){
        return getTextFromElement(soppingCartText);
    }
    public String getProductName(){
        return getTextFromElement(pantNameText);
    }
    public String getProductDetails(){
        return getTextFromElement(productDetailWebEle);
    }


}
