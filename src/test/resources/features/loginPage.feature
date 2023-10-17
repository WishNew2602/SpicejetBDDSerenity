@F1
Feature: Login into application with different credentials
  Background:
    Given Open Spicejet WebPage
    And Verify WebPage is Opened
  Scenario Outline: Login with with correct and incorrect mobile number and password and verify login feature
    Given Click login Link
    When  <MobileNumber> Mobile number is entered
    And <Password> password is entered
    Then Click Login
    And Verify Login is successfull
    Examples:
            |MobileNumber|Password|
            | 9642677831  |Vishnu@1432|