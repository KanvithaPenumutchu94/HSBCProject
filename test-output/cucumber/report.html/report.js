$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginPage1.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.LoginPageSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Email address \"nagalakshmi.s@TestPerform.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.LoginPageSteps.user_enters_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Password \"How2trainurdr@gon2\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.LoginPageSteps.user_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.LoginPageSteps.user_clicks_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see Eco-System Management Portal",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.LoginPageSteps.user_should_see_eco_system_management_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Login with valid credentials is completed");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Vaidate HSBC home page title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoketest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.LoginPageSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title should be \"HSBC - SSAP\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.LoginPageSteps.title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.write("Vaidate HSBC home page title is completed");
formatter.after({
  "status": "passed"
});
});