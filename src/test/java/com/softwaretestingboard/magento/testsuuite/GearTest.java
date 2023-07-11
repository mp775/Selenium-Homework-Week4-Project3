package com.softwaretestingboard.magento.testsuuite;

import com.softwaretestingboard.magento.pages.gear.GearCategoryPage;
import com.softwaretestingboard.magento.pages.homepage.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    GearCategoryPage gearCategoryPage = new GearCategoryPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        homePage.navigateToBagsSection();
        gearCategoryPage.clickOnSpecificProduct();
        String expectedProductText = "Overnight Duffle";
        String actualProductText = gearCategoryPage.verifyProductText();
        Assert.assertEquals(actualProductText, expectedProductText, "Product Name Text Validation Failed");
        gearCategoryPage.changeProductQuantity();
        gearCategoryPage.clickOnAddToCartButton();
        String expectedNotificationText = "You added Overnight Duffle to your shopping cart.";
        String actualNotificationText = gearCategoryPage.verifyProductAddedToShoppingCartNotificationText();
        Assert.assertEquals(actualNotificationText, expectedNotificationText, "Product Added to Shopping Cart Notification Validation Failed");
        gearCategoryPage.clickOnShoppingCartLink();
        String actualProductNameInShoppingCart = gearCategoryPage.verifyProductNameInShoppingCart();
        Assert.assertEquals(actualProductNameInShoppingCart, expectedProductText, "Product Name in Shopping Cart Validation Failed ");
        String actualProductQuantityInCart = gearCategoryPage.verifyProductQuantityInShoppingCart();
        Assert.assertEquals(actualProductQuantityInCart, "3", "Product Quantity In Cart Validation Failed");
        String expectedPrice = "$135.00";
        String actualPrice = gearCategoryPage.verifyProductPriceInShoppingCart();
        Assert.assertEquals(actualPrice, expectedPrice, "Product Price in Shopping Cart Validation Failed");
        gearCategoryPage.changeProductQuantityInShoppingCart();
        gearCategoryPage.clickOnUpdateShoppingCartButton();
        String expectedPriceAfterUpdate = "$225.00";
        driver.navigate().refresh();
        String actualPriceAfterUpdate = gearCategoryPage.verifyUpdatedPriceInShoppingCart();
        Assert.assertEquals(actualPriceAfterUpdate, expectedPriceAfterUpdate, "Updated Price Validation In Shopping Cart Failed");
    }
}
