package org.Ebay.Pages;

import org.Ebay.UtilityActions.UtilityFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class AllFilters extends UtilityFunctions {

    @FindBy(xpath = "//span[text()='Screen Size']")
    private WebElement ScreenSize;

    @FindBy(xpath = "//input[@aria-label='Minimum Value, US Dollar']")
    private  WebElement minPrice;
    @FindBy(xpath = "//input[@aria-label='Maximum Value, US Dollar']")
    private  WebElement maxPrice;

    @FindBy(id = "c3-mainPanel-price")
    private WebElement filterPrice;

    @FindBy(xpath = "//input[@value='US Only']")
    private WebElement usLocation;

    @FindBy(xpath = "//button[@aria-label='Apply']")
    private WebElement applyFilter;

    public void clickFilterType(String type){
        String xpath = "//span[text()='" + type+ "']" ;
        xClick(getDriver().findElement(By.xpath(xpath)));
    }

    public void select_option(String option){
        String xpath = "//span[text()='" + option+ "']" ;
        xClick(getDriver().findElement(By.xpath(xpath)));
    }

    public void select_Us(){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        getDriver().findElement(By.xpath("//input[@value='US Only']")).click();
    }

    public void clickPriceFilter(){
        xClick(filterPrice);
    }

    public void priceSelect(String minValue, String maxValue){
        xSendKeys(minPrice, minValue);
        xSendKeys(maxPrice, maxValue);
    }

    public void applyFilters(){
        xClick(applyFilter);
    }

}
