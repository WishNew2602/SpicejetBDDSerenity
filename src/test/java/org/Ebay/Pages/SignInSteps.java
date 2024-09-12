package org.Ebay.Pages;

import org.Ebay.UtilityActions.UtilityFunctions;

import net.thucydides.core.annotations.Step;

public class SignInSteps extends UtilityFunctions{

	SignInPage signInPage;
	
	@Step
	public void signInIntoEbay(String user) {
		signInPage.ebayLogin(user);
	}
}
