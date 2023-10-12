package org.spicejet.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.spicejet.utility.UtilityFunctions;

public class LoginPage extends UtilityFunctions {

   public LoginPage(){

   }

   public WebElementFacade getLoginLink() {
      return loginLink;
   }

   WebElementFacade loginLink = $("//div[text()='SpiceScreen']");
   WebElementFacade mobileNumber = $("//input[@data-testid='user-mobileno-input-box']");
   WebElementFacade password = $("//input[@type='password']");
   WebElementFacade loginButton = $("//div[@data-testid='login-cta']");
   WebElementFacade spiceJetImg = $("//div[@style='background-image: url(\"https://www.spicejet.com/public/v1.svg\");']");

   public void openApplication(){
      open();
   }
   public void verifyAppOpened(){
      spiceJetImg.isPresent();
   }
   public void clickLoginLink(){
      xClick(getLoginLink());
   }
   public void enterMobileNumber(String mobilenumber){
      xSendKeys(mobileNumber, mobilenumber);
   }
   public void enterPassword(String Password){
      xSendKeys(password, Password);
   }
   public void clickLoginButton(){
      xClick(loginButton);
   }
}
