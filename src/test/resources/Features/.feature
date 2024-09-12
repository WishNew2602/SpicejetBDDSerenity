#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@t @uat @p @checkout
Feature: Checkout
	As a visitor of the ecommerce website
	I want to be able to do a purchase
	So that I can get the product that I want

	@check01
	Scenario: check01 - Successful checkout
		Given I have added an item to my shopping bag
		When I proceed to the check out
		And I enter valid delivery details
		And I select a payment method
		And I I confirm the order
		Then I am redirected to the thank you page

	@check02
	Scenario: check02 - Checkout with incorrect delivery details
		Given I have added an item to my shopping bag
		And I click the shopping bag icon
		When I proceed to check out-
		And I select a payment method
		And I enter invalid details
		And I click the pay button
		Then I receive feedback that the purchase details are incorrect