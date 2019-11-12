Feature: Login test

Scenario Outline: Login with valid test data

Given user open application
When user enter username as "<username>" in userName field
And user enters password as "<password>" in password field
And click signin
Then validates login success

Examples:
|username|password|
|mercury|mercury|
|mercury|dfsa|
|sdja|mercury|
|grkeg|fhbjhrg|