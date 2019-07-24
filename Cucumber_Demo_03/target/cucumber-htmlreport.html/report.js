$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features_01/MyDemo_01.feature");
formatter.feature({
  "name": "My validation on American Express",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I want to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "I have an account",
  "keyword": "Given "
});
formatter.match({
  "location": "Definition_01.i_have_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will provide the data",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_01.i_will_provide_the_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My login is scuccess",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition_01.my_login_is_scuccess()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to view my membership",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "I have logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Definition_01.i_have_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Reward points",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition_01.i_click_on_Reward_points()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will check for myrewards",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_01.i_will_check_for_myrewards()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to refer my friend",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "I am offered with referal bonus",
  "keyword": "Given "
});
formatter.match({
  "location": "Definition_01.i_am_offered_with_referal_bonus()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I share the link with my friend",
  "keyword": "When "
});
formatter.match({
  "location": "Definition_01.i_share_the_link_with_my_friend()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will get some zeta points",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition_01.i_will_get_some_zeta_points()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will enjoy my friday party",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_01.i_will_enjoy_my_friday_party()"
});
formatter.result({
  "status": "passed"
});
});