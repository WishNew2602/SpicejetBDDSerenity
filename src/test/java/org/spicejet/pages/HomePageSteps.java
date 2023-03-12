package org.spicejet.pages;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomePageSteps {
    HomePage home;
    @Step
    public void verifyProfileisVisible(){
        home.verifyProfile();
    }
}
