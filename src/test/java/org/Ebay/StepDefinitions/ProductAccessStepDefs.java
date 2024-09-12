package org.Ebay.StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.Ebay.Pages.AllFilterSteps;
import org.Ebay.Pages.CellSmartPhoneSteps;
import org.Ebay.Pages.EbayHomePageSteps;
import org.Ebay.UtilityActions.BaseClass;

public class HomePageStepsDefs {

    @Steps
    //BaseClass Bclass = new BaseClass();
    EbayHomePageSteps EbayHpagesteps;
    CellSmartPhoneSteps CSPSteps;
    AllFilterSteps allFilterSteps;
    BaseClass BaseClassobj;

    @Given("I am on the eBay homepage")
    public void i_am_on_the_e_bay_homepage() throws InterruptedException {
        BaseClassobj.openApplication();
    }
    @When("I navigate to Search by category > Electronics > Cell Phones & accessories")
    public void i_navigate_to_CellPhone_acess() {
        EbayHpagesteps.clickShopByCatogory();
        EbayHpagesteps.clickCellPhoneAccess();
    }
    @When("I click Cell Phones & Smartphones in the left-hand side navigation")
    public void i_click_in_the_left_hand_side_navigation() {

        CSPSteps.clickCellPhoneSmartphone();
    }
    @When("I scroll down and click All listings")
    public void i_scroll_down_and_click() {

        CSPSteps.scrollToListsTab();
    }
    @When("I click on All filters")
    public void i_click_on() {
        CSPSteps.clickAllList();
    }
    @When("I add filters for screen size, Price, and Item location")
    public void i_add_filters_for_screen_size_price_and_item_location() {

        allFilterSteps.clickFilterType("Screen Size");
        allFilterSteps.selectOption("5.5 - 5.9 in");
        allFilterSteps.clickPriceFilter();
        allFilterSteps.selectPrice("200", "500");
        allFilterSteps.clickFilterType("Item Location");
        allFilterSteps.selectUS();

    }
    @When("I click the Apply button in the pop-up")
    public void i_click_the_apply_button_in_the_pop_up() {
        allFilterSteps.applyFilters();
    }
    @Then("I should see the filter tags applied")
    public void i_should_see_the_filter_tags_applied() {
        CSPSteps.verifyFiltersApplied();
    }

//**********************Search Scenerio*************************//

    @When("I type MacBook in the search bar")
    public void i_type_in_the_search_bar() {
        EbayHpagesteps.searchItem("MacBook");
    }

    @When("I change the Search category to Computers\\/Tablets & Networking and click Search")
    public void i_change_the_search_category_to_computers_tablets_networking_and_click_search() {
        EbayHpagesteps.selectAllCato("Computers/Tablets & Networking");
        EbayHpagesteps.clickSearch();
    }
    @Then("the page should load completely")
    public void the_page_should_load_completely() {
        EbayHpagesteps.xwaitforPageloading();
    }
    @Then("the name of the first result should match MacBook")
    public void the_name_of_the_first_result_should_match() {
        EbayHpagesteps.verifyMacBook("MacBook");
    }

}
