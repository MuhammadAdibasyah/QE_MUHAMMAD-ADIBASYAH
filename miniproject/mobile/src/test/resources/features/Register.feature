Feature: As user I want to create account So that i can login and see homepage

  @regist
  Scenario: As user i have be able to success create account
    Given android user on landing screen
    When android user click to register
    And user input name
    And user input email
    And user input password
    And user click login button
    Then user back to homepage

  Scenario: As user i failed to create account with empty data
    Given android user on landing screen
    When android user click to register
    And user not input name
    And user not input email
    And user not input password
    And user click login button
    Then user get error message ""