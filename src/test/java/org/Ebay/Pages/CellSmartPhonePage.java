package org.Ebay.Pages;

import org.Ebay.UtilityActions.UtilityFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CellSmartPhonePage extends UtilityFunctions {

    @FindBy(xpath = "//h2[@aria-label='All Listings Current view']")
     private WebElement allList;
    @FindBy(xpath = "//button[@aria-label='All Filters']")
    private  WebElement allFilters;

    @FindBy(xpath = "//*[@id=\"s0-28_1-9-0-1[0]-0-0-6-5-4[0]-flyout\"]/button/span")
    private WebElement filterApplied;


    public void clickCellPhoneSmartPhone(){
        getDriver().findElement(By.xpath("//a[@_sp='p2489527.m4337.l9750.c26']")).click();
    }

    public void scrollToLists(){
        JavascriptExecutor Jse = (JavascriptExecutor) getDriver();
        Jse.executeScript("arguments[0].scrollIntoView(true);", allList);
    }

    public void clickAllList(){
        xClick(allFilters);
    }
    public String filtersApplied(){
        return filterApplied.getText();
    }


}
