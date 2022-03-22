Feature:As a user I want to sign up using my email account and google So that i can login to the app

  Scenario: As user i have be able to success sign up with email
    Given I am on the sign up page
    When I enter my email and password
    And I click agree and join button
    Then I am on create profile

  Scenario: As user i have be able to success sign up with google
    Given I am on the sign up page
    When I click continue with google button
    And I choose my google account
    Then I am on create profile

  Scenario: As user i have failed to trying to sign up with email
    Given I am on the sign up page
    When I enter phone number or email valid
    And I enter a password that doesn't match the criteria
    And I click agree and join button
    Then I am fail to trying sign up
    And I get a notifications

  Scenario: As user i have failed to trying to sign up with email
    Given I am on the sign up page
    When I enter phone number invalid and valid password
    And I click agree and join button
    Then I am fail to trying sign up
    And I get a notifications

  Scenario: As user i have failed to trying to sign up with email
    Given I am on the sign up page
    When I enter invalid email and valid password
    And I click agree and join button
    Then I am fail to trying sign up
    And I get a notifications
