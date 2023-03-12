package org.spicejet.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.spicejet.utility.UtilityFunctions;

public class HomePage extends UtilityFunctions {
    WebElementFacade profile = $("//div[contains(text(),'Hi ')]");

    public void verifyProfile(){
        profile.isVisible();
        String profileText = profile.getText();
        Assert.assertTrue(profileText.equalsIgnoreCase("Hi vishnuvardhan"));
    }



}
