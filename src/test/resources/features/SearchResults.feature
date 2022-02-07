#TC#5: Data tables task Task summary:
#LOGIN TASKS
#-> Create a new feature file named SearchResults.feature
#-> As a user, I should be able to login as librarian.
# When I go to Users page, table should have following columns:
#• Actions
#• UserID
#• Full Name
#• Email
#• Group
#• Group

  @searchResults
  Feature: Search Results

    Scenario:
      Given As a user, I should be able to login as librarian
      When As a user, I should be able to go Users page
      Then Table should have following columns:
        | Actions   |
        | User ID    |
        | Full Name |
        | Email     |
        | Group     |
        | Status     |