package org.Ebay.UtilityActions;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BaseClass extends UtilityFunctions{

    @Managed
    WebDriver driver;
    public  void openApplication() throws InterruptedException {

//        System.setProperty("webdriver.edge.driver","msedgedriver.exe");
//        driver = new EdgeDriver();
//        driver.get("https://www.ebay.com");
        open();
    }


}
