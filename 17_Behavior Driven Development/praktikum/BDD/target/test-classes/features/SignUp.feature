Feature: As an user,I want to sign up using my email account,So that i can login to the app

  Scenario: As a user i have be able to success sign up
    Given I am on the sign up page
    When I enter my email and password
    And I click agree & join button
    Then I am on create profile

Feature : As an user,I want to sign up using my google account,So that i can to the app

  Scenario: As user i have be able to success sign up
    Given I am on the sign up page
    When I click continue with google button
    And I choose my google account
    Then I am on create profile
