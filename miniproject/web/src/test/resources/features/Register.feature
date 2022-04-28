Feature: As user i want to create account So that i can login

  Scenario: As user i have be able to success crete account
    Given user on the register page
    When user input valid name
    And user input valid email
    And user input valid password
    And user click register button
    Then user success to create account