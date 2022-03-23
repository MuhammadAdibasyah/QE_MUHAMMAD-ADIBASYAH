Feature: As an user I want to see my home page So that i can update my profile

  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter my valid username and password
    And I click login button
    Then I am on the home page

   Scenario: As a user I have failed in trying to login (invalid username and valid password)
     Given I am on the login page
     When I enter invalid username and valid password
     And I click login button
     Then I am fail to login
     And I get a notifications

   Scenario: As a user I have failed in trying to login (valid username and invalid password)
     Given I am on the login page
     When I enter valid username and invalid password
     And I click login button
     Then I am fail to login
     And I get a notifications

   Scenario: As a user I have failed in trying to login (invalid username and password)
     Given I am on the login page
     When I enter invalid username and password
     And I click login button
     Then I am fail to login
     And I get a notifications


