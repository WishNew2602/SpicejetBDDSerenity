package org.Ebay.Pages;

import net.thucydides.core.annotations.Step;
import org.Ebay.UtilityActions.UtilityFunctions;
import org.junit.Assert;

public class EbayHomePageSteps extends UtilityFunctions {

    EbayHomePage Ehome;


    @Step
    public void clickShopByCatogory(){
        Ehome.clickshopByCato();
    }

    @Step
    public void clickCellPhoneAccess(){
        Ehome.clickCellPhoneAccceLink();
    }

    @Step
    public void searchItem(String item){
        Ehome.searchItem(item);
    }
    @Step
    public void clickSearch(){
        Ehome.clickSearch();
    }
    @Step
    public void  selectAllCato(String selection){
        Ehome.selectAllCat(selection);
    }

    @Step
    public void waitforPageLoad(){
        xwaitforPageloading();
    }

    @Step
    public void verifyMacBook(String macName){
        Assert.assertTrue(Ehome.MacitemName().contains(macName));
    }


}
