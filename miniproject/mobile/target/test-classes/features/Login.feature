Feature: As a user I want to login in the app So that i can see homepage

  @positif
  Scenario: As a user i have be able to success login
    Given android user on landing screen
    When android user input valid email
    And android user input valid password
    And android user click login button
    Then android user see homepage

  @fail
  Scenario: As user i have failed to login
    Given android user on landing screen
    When android user input unregistered email
    And android user input password
    And android user tap login button
    Then android user see "Wrong Email or Password" message