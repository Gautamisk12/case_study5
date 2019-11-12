Feature: Test Registration

Description: User stories

Scenario: Test Registration with valid date

Given user open application newtours.demoaut.com
When user clicks registration
Then users validates registration page
When user enter firstname as "Gautami" in firstname field
And user enter lastname as "Keskar" in lastname field
And user enters pssword as "password" in password field
And user enters confirm password as "password" in confirm password field
And user click on register button
Then user validates registration success