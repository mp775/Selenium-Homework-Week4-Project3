package com.softwaretestingboard.magento.pages.homepage;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By gearTab = By.xpath("//a[@id='ui-id-6']//span[contains(text(),'Gear')]");
    By bagsWebElement = By.xpath("//span[contains(text(),'Bags')]");
    By menTab = By.xpath("//a[@id='ui-id-5']//span[contains(text(),'Men')]");
    By bottomWebElement = By.xpath("//a[@id='ui-id-18']");
    By pantsWebElement = By.xpath("//a[@id='ui-id-23']");
    By womenTab = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");
    By topWebElement = By.xpath("//a[@id='ui-id-9']");
    By jacketWebElement = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    public void navigateToBagsSection(){
        mouseHoverToElement(gearTab);
        waitUntilVisibilityOfElementLocated(bagsWebElement,60);
        mouseHoverToElementAndClick(bagsWebElement);
    }

    public void navigateToPantsSection(){
        mouseHoverToElement(menTab);
        waitUntilVisibilityOfElementLocated(bottomWebElement,60);
        mouseHoverToElement(bottomWebElement);
        waitUntilVisibilityOfElementLocated(pantsWebElement,60);
        mouseHoverToElementAndClick(pantsWebElement);
    }

    public void navigateToJacketSection() {
        mouseHoverToElement(womenTab);
        waitUntilVisibilityOfElementLocated(topWebElement,60);
        mouseHoverToElement(topWebElement);
        waitUntilVisibilityOfElementLocated(jacketWebElement,60);
        mouseHoverToElementAndClick(jacketWebElement);
    }
}
