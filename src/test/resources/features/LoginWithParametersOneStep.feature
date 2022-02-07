#TC#3:
#Task summary:
#-> Create new scenario in LoginWithParameters.feature named:
#Login as librarian in the same line
#-> Implement the same logic you created before. But you should handle login in one scenario step.
#-> Create new snippets and implement them in Login_StepDefinitions class and implement these 2 scenarios.
#Note: Follow POM for any web element locating in any page.

  @loginWithPrmtrsOneStep
  Feature: Login

    Background: //user should be one right login page
      Given User is on login page

    Scenario: Student User is able to login the account using correct credentials
      When Student enters username "student123466@library" and password "31pZflAG"
      Then Student should see "Book Management"

    Scenario: Librarian User is able to login the account using correct credentials
      When Librarian enters username "librarian123453@library" and password "8WNbLka6"
      Then Librarian should see "Dashboard"