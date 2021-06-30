@forgotpassword
Feature: To validate forgot password functionality

  Background: 
    Given User is in facebook login page
    And User click forgot password link

  @sanity @regression
  Scenario: To validate search account feature when user forgets password using email id
    When User enter invalid email idfor finding the connected account
    And User click search button
    Then User must validate the error message

  @sanity
  Scenario: To validate search account feature when user forgets password using mobile number
    When User enter invalid mobile number for finding the connected account
    And User click search button
    Then User must validate the error message for invalid mobile number
