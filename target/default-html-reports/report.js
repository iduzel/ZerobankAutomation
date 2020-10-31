$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivityNavigation.feature");
formatter.feature({
  "name": "Navigating to specific accounts in Accounts Activity",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AccountActivity"
    }
  ]
});
formatter.scenarioOutline({
  "name": "\u003cAccountSummaryActivities\u003eAccount Redirect",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@try"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"\u003cAccountSummaryActivities\u003e\" link on the Account Summary page",
  "keyword": "When "
});
formatter.step({
  "name": "the Account Activity page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "Account drop down should have \"\u003cAccountSummaryActivities\u003e\" selected",
  "keyword": "And "
});
formatter.step({
  "name": "account closed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "AccountSummaryActivities"
      ]
    },
    {
      "cells": [
        "Savings"
      ]
    },
    {
      "cells": [
        "Brokerage"
      ]
    },
    {
      "cells": [
        "Checking"
      ]
    },
    {
      "cells": [
        "Credit Card"
      ]
    },
    {
      "cells": [
        "Loan"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user logged in as \"bankManager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "SavingsAccount Redirect",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AccountActivity"
    },
    {
      "name": "@try"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Savings\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Account Activity page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.the_Account_Activity_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Account drop down should have \"Savings\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "account closed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user logged in as \"bankManager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "BrokerageAccount Redirect",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AccountActivity"
    },
    {
      "name": "@try"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Brokerage\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Account Activity page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.the_Account_Activity_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Account drop down should have \"Brokerage\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "account closed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user logged in as \"bankManager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "CheckingAccount Redirect",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AccountActivity"
    },
    {
      "name": "@try"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Checking\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Account Activity page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.the_Account_Activity_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Account drop down should have \"Checking\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "account closed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user logged in as \"bankManager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Credit CardAccount Redirect",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AccountActivity"
    },
    {
      "name": "@try"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Credit Card\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Account Activity page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.the_Account_Activity_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Account drop down should have \"Credit Card\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "account closed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user logged in as \"bankManager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "LoanAccount Redirect",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AccountActivity"
    },
    {
      "name": "@try"
    }
  ]
});
formatter.step({
  "name": "the user clicks on \"Loan\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Account Activity page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.the_Account_Activity_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Account drop down should have \"Loan\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccActNavStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "account closed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});