$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountSummary.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AccountSummary"
    }
  ]
});
formatter.scenario({
  "name": "Account Summary Page Info",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AccountSummary"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AccountSummary"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as \"bankManager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title contains \"Zero - Account Summary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_title_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the following options",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});