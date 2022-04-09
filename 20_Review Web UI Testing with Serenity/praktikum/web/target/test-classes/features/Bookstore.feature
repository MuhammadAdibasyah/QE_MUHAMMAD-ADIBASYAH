Feature: As a user I want to visit bookstore So that i can see existing book in store

  Scenario: As user i have be able to choose existing book
    Given i am on the bookstore page
    When i click one of existing book
    Then i can see about this book
