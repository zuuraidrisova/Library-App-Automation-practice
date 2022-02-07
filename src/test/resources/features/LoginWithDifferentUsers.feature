#LOGIN TASKS TC#6: Scenario Outlines/Scenario Templates
#Task summary: Data driven testing with different user accounts ->
# Create a new feature file named LoginWithDifferentUsers.feature
#-> As a user, I should be able to login with different users using
# their correct emails and passwords.
# When I login, I should be able to see username in the account username section.

  @loginWithDifferentUsers
  Feature: Login with different users

    Scenario Outline:
      Given As a user I should be on login page  to login with different users
      When User logins using username "<email>" and "<password>"
      Then User should be able to see "<username>" in the account section

      @students
      Examples:
        | email                 | password | username      |
        | student123466@library | 31pZflAG | Student 123466 |
        | student123467@library | jJ1BAIkM | Student 123467 |
        | student123468@library | GRiTBxkP | Student 123468 |
        | student123469@library | DUpz7jk4 | Student 123469 |
        | student123470@library | Xxhzor2O | Student 123470 |
        | student123471@library | wfr2pQ7X | Student 123471 |
        | student123472@library | IgZ5aL3h | Student 123472 |
        | student123473@library | Msqpp4gz | Student 123473 |
        | student123474@library | ZX8PewQW | Student 123474 |




      @librarians
      Examples:
        | email                   | password | username        |
        | librarian123453@library | 8WNbLka6 | Librarian 123453 |
        | librarian123454@library | j0Xy9fUJ | Librarian 123454 |
        | librarian123455@library | QoyNEHxI | Librarian 123455 |
        | librarian123456@library | gq4SgEeP | Librarian 123456 |
        | librarian123457@library | OrFv8hMg | Librarian 123457 |
        | librarian123458@library | KDwUSCWw | Librarian 123458 |
        | librarian123459@library | InoGjVne | Librarian 123459 |
        | librarian123460@library | XnRJddEA | Librarian 123460 |
        | librarian123461@library | 3msVIdaA | Librarian 123461 |
        | librarian123462@library | dWgOVIrc | Librarian 123462 |