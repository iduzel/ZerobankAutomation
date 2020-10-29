@AddNewPayee
Feature: Add new payee under pay bills

  Background:
    Given the user is on the login page
    Given the user logged in as "bankManager"
    Given the user accesses the "Pay Bills"



  Scenario: Add a new payee
    Then the title contains "Zero - Pay Bills"
    Given  the user accesses the Add New Payee
    When the user enters "The Law Offices of Hyde, Price & Scharks" and "100 Same st, Anytown, USA, 10001" and "Checking" and "XYZ account"
    Then message "The new payee The Law Offices of Hyde, Price & Scharks was successfully created." should be displayed











