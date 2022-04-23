@calculator
Feature: As a user I want to complete some problem math So that i have to operate calculator

  @sum
  Scenario: As user i have be able to see sum result
    Given user on calculator page
    When user choose first number 5
    And user tap sign "plus"
    And user choose second number 7
    And user tap sign "equals"
    Then user see the result sum

  @multiplied
  Scenario: As user i have be able to see multiplied result
    Given user on calculator page
    When user choose first number 9
    And user tap sign "multiplied"
    And user choose second number 2
    And user tap sign "equals"
    Then user see the result multiplied

  @minus
  Scenario: As user i have be able to see minus result
    Given user on calculator page
    When user choose first number 4
    And user tap sign "minus"
    And user choose second number 6
    And user tap sign "equals"
    Then user see the result minus

#  @divided
#  Scenario: As user i have be able to see divided result
#    Given user on calculator page
#    When user choose first number 5
#    And user tap sign "divided"
#    And user choose second number 2
#    And user tap sign "equals"
#    Then user see the result divided