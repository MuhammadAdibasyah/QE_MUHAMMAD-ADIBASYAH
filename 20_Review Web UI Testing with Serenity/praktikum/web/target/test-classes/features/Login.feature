@login
Feature: As user I want see home page So that i can buy books

  Background:
    Given i am on the home page
    When i click feature bookstore
    And i click login button in bookstore page

  Scenario: As user i have be able to success login
    Given i am on the login page
    When i input valid username
    And i input valid password
    And i click login button
    Then i success login