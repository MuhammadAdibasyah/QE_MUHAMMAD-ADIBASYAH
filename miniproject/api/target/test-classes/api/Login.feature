@login
Feature: As user I want to see home page So that i can buy product

@login @positive
Scenario: POST - As a user I success to login with valid data
Given user set endpoint for login
When user send POST HTTP request with valid data
Then user see status code 200
And get valid data

@login @negative
Scenario: POST - As a user I failed to login with empty data
Given user set endpoint for login
When user send POST HTTP request with empty data
Then user see status code 400 and fail to login
And user get error message