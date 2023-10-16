package org.spicejet.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import org.spicejet.utility.UtilityFunctions;


public class LoginPageSteps extends UtilityFunctions {
    LoginPage login = new LoginPage();
    @Step
    public void verifySpicejetOpened(){
        login.verifyAppOpened();
    }
    @Step
    public void clickLoginLink(){
        getDriver().findElement(By.xpath("//div[text()='Login']")).click();
    }
    @Step
    public void enterMobileNumber(String mobile){
        login.enterMobileNumber(mobile);
    }
    public void enterPassword(String pass){
        login.enterPassword(pass);
    }
    @Step
    public void loginIntoApp(){
        login.clickLoginButton();
    }
}
