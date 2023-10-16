package org.spicejet.pages;

import net.thucydides.core.annotations.Step;
import org.spicejet.utility.UtilityFunctions;

public class CommmonSteps extends UtilityFunctions {


    BaseClass baseClass = new BaseClass();
    @Step
    public void openSpiceJet(){
        baseClass.openApplication();
    }
}
