package org.spicejet.utility;

import io.cucumber.java.Before;

public class Hooks extends UtilityFunctions{
    @Before
    public void getURL(){
        getDriver().get("https://www.spicejet.com/");
    }
}
