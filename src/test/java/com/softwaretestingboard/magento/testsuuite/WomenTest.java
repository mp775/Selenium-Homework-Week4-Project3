package com.softwaretestingboard.magento.testsuuite;

import com.softwaretestingboard.magento.pages.homepage.HomePage;
import com.softwaretestingboard.magento.pages.women.WomenCategoryPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends BaseTest {
    WomenCategoryPage womenCategoryPage = new WomenCategoryPage();
    HomePage homePage = new HomePage();
    List<String> productListBeforeFilter;
    List<String> productListAfterFilter;
    List<Double> priceListBeforeFilter;
    List<Double> priceListAfterFilter;

    @Test
    public void verifyTheSortByProductNameFilter() {
        homePage.navigateToJacketSection();
        productListBeforeFilter = womenCategoryPage.getProductListBeforeFilter();
        womenCategoryPage.selectSortByFilterProductName();
        productListAfterFilter = womenCategoryPage.getProductListAfterFilter();
        Assert.assertEquals(productListAfterFilter, productListBeforeFilter, "Product is not displayed in alphabetical order");
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        homePage.navigateToJacketSection();
        priceListBeforeFilter = womenCategoryPage.getPriceListBeforeFilter();
        womenCategoryPage.selectSortByFilterPrice();
        priceListAfterFilter = womenCategoryPage.getPriceListAfterFilter();
        Assert.assertEquals(priceListAfterFilter, priceListBeforeFilter, "Product is not displayed in low to high price");
    }
}
