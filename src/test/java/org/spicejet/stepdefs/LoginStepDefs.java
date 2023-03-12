package org.spicejet.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.spicejet.pages.HomePageSteps;
import org.spicejet.pages.LoginPageSteps;

public class LoginStepDefs{
    @Steps
    LoginPageSteps loginSteps;
    HomePageSteps homeSteps;

    @Managed(driver="chrome")
    WebDriver driver;

    @Given("Open Spicejet WebPage")
    public void navigate_to_application() {
        loginSteps.openSpiceJet();
    }
    @And("Verify WebPage is Opened")
    public void verifyPageOpen(){
        loginSteps.verifySpicejetOpened();
    }
    @Given("Click login Link")
    public void click_login_link() {
        loginSteps.clickLoginLink();
    }
    @When("^(.*) Mobile number is entered$")
    public void is_entered(String MobileNumber) {
        loginSteps.enterMobileNumber(MobileNumber);
    }
    @And("^(.*) password is entered$")
    public void vishnu_is_entered(String Password) {
        loginSteps.enterPassword(Password);
    }
    @Then("Click Login")
    public void click_login() {
        loginSteps.loginIntoApp();
    }
    @Then("Verify Login is successfull")
    public void verify_login_is_successfull() {
        homeSteps.verifyProfileisVisible();
    }

}
