package org.Ebay.Pages;

import org.Ebay.UtilityActions.UtilityFunctions;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

public class SignInPage extends UtilityFunctions{

	@FindBy(xpath = "//input[@id=\"userid\"]")
	private WebElement email;
	
	@FindBy(xpath="//button[@id=\"signin-continue-btn\"]")
	private WebElement contBtn;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@id=\"sgnBt\"]")
	private WebElement signIn;
	
	public void ebayLogin(String User){
		
		if (User.equalsIgnoreCase("GeneralUser")) {
			try {
				xSendKeys(email, "vishnu14321432@gmail.com");
				xClick(contBtn);
				xSendKeys(password, "Doggy@11");
				xClick(signIn);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
	}

	
}
