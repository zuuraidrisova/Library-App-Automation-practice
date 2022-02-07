#TC#4: Data tables task Task summary:
#LOGIN TASKS
#-> Create a new feature file named ShowRecords.feature -> Create a new scenario.
#-> Login as a librarian
#-> Click on Users link
#-> Show records dropdown value should be 10 by default.
#-> And show records should have following options: 5, 10, 15, 50, 100, 200, 500

  @showRecords
  Feature: Show Records

    Scenario: Verify default values in users page
      Given User logs in as librarian
      When  User clicks on Users link
      Then  User should be able to see show records dropdown value is 10
      And   show records should have following options:
        | 5   |
        | 10  |
        | 15  |
        | 50  |
        | 100 |
        | 200 |
        | 500 |