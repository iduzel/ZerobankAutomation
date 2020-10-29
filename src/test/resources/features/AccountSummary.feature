@AccountSummary
Feature:

  Scenario: Account Summary Page Info


  Scenario:
    Given the user is on the login page
    Given the user logged in as "bankManager"
    Then the title contains "Zero - Account Summary"
    And user sees the following options
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
