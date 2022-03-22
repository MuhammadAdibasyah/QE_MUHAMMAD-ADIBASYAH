Feature: As an user,I want to see my home page,So that i can update my profile

  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter my valid username and password
    And I click login button
    Then I am on the home page