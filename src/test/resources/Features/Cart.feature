
@tag
Feature: Cart Test scenerios
  Use this for Test Cart page Scenerios 
	
	Background: 
		Given I want to open Ebay on Browser
    And  As "Basic User" I want to login
    
    
  @tag1
  Scenario: Check To verify that Save for later button will remove item from Cart to Saved for Later 
    When I want to Search for "Iphone15>"
    And I need to Select <Black Chimaera> color phone
    And Click on Add To Cart
    When I Click on Save for Later
    Then The Item should be moved to Saved to Later

