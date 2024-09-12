package org.Ebay.Pages;

import org.Ebay.UtilityActions.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePage extends UtilityFunctions {
	
	@FindBy(xpath="//a[contains(text(),\"Sign in\")]")
	private WebElement signInLink;

    @FindBy(xpath = "//i[@id='gh-shop-ei']" )
    private WebElement shopByCato;
    @FindBy(id = "gh-cat")
    private WebElement allCatDropdown;

    @FindBy(xpath = "//input[@id='gh-ac']")
    private WebElement searchBar;
    
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement clickSearch;

    @FindBy(xpath = "//img[@id='gh-logo']")
    WebElement HomePageImage;

    @FindBy(xpath = "//a[text()='Cell phones & accessories']")
    WebElement CellPhoneAccceLink;

    @FindBy(xpath = "(//span[@role=\"heading\"])[2]")
    private WebElement macBookFirst;

    public void clickSignIn() {
    	xClick(signInLink);
    }
    
    public void clickshopByCato(){
        //getDriver().findElement(By.id("gh-shop-ei")).click();
        xClick(shopByCato);
    }

    public void clickCellPhoneAccceLink(){
        //getDriver().findElement(By.xpath("//a[text()='Cell phones & accessories']")).click();
        xClick(CellPhoneAccceLink);
    }

    public void EnterItemTosearch(String item){
        xSendKeys(searchBar, item);

    }
    public void selectAllCat(String selection){
        xSelectFromDropdown(allCatDropdown, selection);
    }
    public void clickSearch(){
        xClick(clickSearch);
    }
    
    public void searchItem(String item) {
    	xSendKeys(searchBar, item);
    	xClick(clickSearch);
    }

    public String MacitemName(){
        System.out.println(macBookFirst.getText());
        return macBookFirst.getText();
    }



}
