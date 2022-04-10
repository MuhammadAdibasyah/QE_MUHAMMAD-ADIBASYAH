Feature: As a user I want to visit bookstore So that i can see existing book in store

  Background:
    Given i am on the home page
    When i click feature bookstore

  Scenario: As user i have be able to see bookstore page
    Then i can see bookstore page

  Scenario: As user i have be able to choose existing book
    Given i am on the bookstore page
    When i chose one of existing book
    Then i can see about book

  Scenario: As user i have be able to success to search book with search feature
    When i input valid keyword
    Then i can see book with valid keyword
