#C#1:
#Task summary:
#-> Create a new feature file named Login.feature
#-> Create 2 scenarios for different user logins for: librarian, student.
#-> Create new step definition named Login_StepDefinitions class and implement these
#2 scenarios.


@login
Feature: Login

  Background: Users are at login page
    Given User is on login page


  Scenario: Student User is able to login the account using correct credentials
    When Student enters correct username
    When Student enters correct password
    When Student clicks on sign in button
    Then Student should be able to see Dashboard


  Scenario: Librarian User is able to login the account using correct credentials
    When Librarian enters correct username
    When Librarian enters correct password
    When Librarian clicks on sign in button
    Then Librarian should be able to see Dashboard