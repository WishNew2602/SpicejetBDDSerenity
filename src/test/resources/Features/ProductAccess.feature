@Feature1
Feature: Search by category and Filters

  @filterscenerio
  Scenario: Applying Filters to Cell Phones & Smartphones
    Given I am on the eBay homepage
    When I navigate to Search by category > Electronics > Cell Phones & accessories
    And I click Cell Phones & Smartphones in the left-hand side navigation
    And I scroll down and click All listings
    And I click on All filters
    And I add filters for screen size, Price, and Item location
    And I click the Apply button in the pop-up
    Then I should see the filter tags applied

    @searchScenerio
  Scenario: Searching for a Product and Verifying Results
    Given I am on the eBay homepage
    When I type MacBook in the search bar
    And I change the Search category to Computers/Tablets & Networking and click Search
    Then the page should load completely
    And the name of the first result should match MacBook