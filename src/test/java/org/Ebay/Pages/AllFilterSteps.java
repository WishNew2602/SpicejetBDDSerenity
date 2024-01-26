package org.Ebay.Pages;

import net.thucydides.core.annotations.Step;
import org.Ebay.UtilityActions.UtilityFunctions;

public class AllFilterSteps extends UtilityFunctions {

    AllFilters allFilters;
    @Step
    public void clickFilterType(String type){
        allFilters.clickFilterType(type);
    }
    @Step
    public void selectOption(String option){
        allFilters.select_option(option);
    }

    @Step
    public void clickPriceFilter(){
        allFilters.clickPriceFilter();
    }
    @Step
    public void selectPrice(String minValue, String maxValue){
        allFilters.priceSelect(minValue, maxValue);
    }
    @Step
    public void selectUS(){
        allFilters.select_Us();
    }
    @Step
    public void applyFilters(){
        allFilters.applyFilters();
    }

}
