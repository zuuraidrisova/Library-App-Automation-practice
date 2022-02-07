#TC#2:
#Task summary:
#-> Create new feature file named LoginWithParameters.feature
#-> Create 2 scenarios for different user logins for: librarian, student, with
#parameterization.
#-> Create new snippets and implement them in Login_StepDefinitions class and
#implement these 2 scenarios.

@loginWithPrmtrs
Feature: Login With Parameters

  Background:
    Given User is on the login page

  Scenario: Student User is able to login the account using correct credentials
    When Student enters username "student123466@library"
    When Student enters password "31pZflAG"
    When Student clicks on signIn button
    Then Student should be able to see "Book Management"

  Scenario: Librarian User is able to login the account using correct credentials
    When Librarian enters username "librarian123453@library"
    When Librarian enters password  "8WNbLka6"
    When Librarian clicks on signIn button
    Then Librarian should be able to see "Dashboard"