@login

  Feature: Login as user


    Scenario: login as a different user
      Given the user is on the login page
      Given the user logged in as "BankManager"
      And the title contains "Zero - Account Summary"



