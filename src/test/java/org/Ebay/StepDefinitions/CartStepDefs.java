package org.Ebay.StepDefinitions;

import org.Ebay.Pages.AllFilterSteps;
import org.Ebay.Pages.CellSmartPhoneSteps;
import org.Ebay.Pages.EbayHomePageSteps;
import org.Ebay.Pages.SignInSteps;
import org.Ebay.UtilityActions.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CartStepDefs {

	@Steps
	 EbayHomePageSteps EbayHpagesteps;
    CellSmartPhoneSteps CSPSteps;
    AllFilterSteps allFilterSteps;
    BaseClass BaseClassobj;
    SignInSteps signInSteps;
	
	@Given("I want to open Ebay on Browser")
	public void i_want_to_open_ebay_on_browser() {
		try {
			BaseClassobj.openApplication();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Given("As <Basic User> I want to login")
	public void i_want_to_login(String user) {
		signInSteps.signInIntoEbay(user);
	}
	@When("I want to Search for {string}")
	public void i_want_to_search_for(String searchItem) {
		EbayHpagesteps.searchItem(searchItem);
	}
	@When("I need to Select <Black Chimaera> color phone")
	public void i_need_to_select_black_chimaera_color_phone() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Click on Add To Cart")
	public void click_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I Click on Save for Later")
	public void i_click_on_save_for_later() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The Item should be moved to Saved to Later")
	public void the_item_should_be_moved_to_saved_to_later() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
