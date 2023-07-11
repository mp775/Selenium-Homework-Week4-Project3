package com.softwaretestingboard.magento.testsuuite;

import com.softwaretestingboard.magento.pages.homepage.HomePage;
import com.softwaretestingboard.magento.pages.men.MenCategoryPage;
import com.softwaretestingboard.magento.pages.men.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    MenCategoryPage menCategoryPage = new MenCategoryPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homePage.navigateToPantsSection();
        menCategoryPage.mouseHoverOnProductNameAndSelectSize();
        menCategoryPage.mouseHoverOnProductNameAndSelectColour();
        menCategoryPage.mouseHoverOnProductNameAndClickOnAddToCartButton();
        String expectedProductText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualProductText = menCategoryPage.getNotificationForAddedProduct();
        Assert.assertEquals(actualProductText, expectedProductText, "Message is not displayed for added product");
        menCategoryPage.clickOnShoppingCartLink();
        String expectedCartText = "Shopping Cart";
        String actualCartText = shoppingCartPage.getShoppingCartTextFromWebEle();
        Assert.assertEquals(actualCartText, expectedCartText, "Shopping cart Text is not displayed");
        String expectedProductName = "Cronus Yoga Pant";
        String actualProductName = shoppingCartPage.getProductName();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name is not displayed");
        String expectedSize = "32";
        String expectedColour = "Black";
        String actualProductDetails = shoppingCartPage.getProductDetails();
        Assert.assertTrue(actualProductDetails.contains(expectedSize));
        Assert.assertTrue(actualProductDetails.contains(expectedColour));
    }
}
