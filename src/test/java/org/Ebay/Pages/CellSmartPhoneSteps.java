package org.Ebay.Pages;

import net.thucydides.core.annotations.Step;
import org.Ebay.UtilityActions.UtilityFunctions;
import org.junit.Assert;

public class CellSmartPhoneSteps extends UtilityFunctions {

    CellSmartPhonePage cellSmartpage;
    @Step
    public void clickCellPhoneSmartphone(){
        cellSmartpage.clickCellPhoneSmartPhone();
    }

    @Step
    public void scrollToListsTab(){
        cellSmartpage.scrollToLists();
    }

    @Step
    public void clickAllList(){
        cellSmartpage.clickAllList();
    }
    @Step
    public void verifyFiltersApplied(){
        Assert.assertTrue(cellSmartpage.filtersApplied().contains("filters applied"));
    }


}
