@register
Feature: As user i want to create account So that i can login

  Scenario: As user i have be able to success crete account
    Given user on the register page
    When user input valid name
    And user input valid email
    And user input valid password
    And user click register button
    Then user success to create account

  Scenario: As user i have failed to create account with registered data
    Given user on the register page
    When user input registered name
    And user input registered email
    And user input valid password
    And user click register button
    Then user fail to create account and get error message "ERROR: duplicate key"