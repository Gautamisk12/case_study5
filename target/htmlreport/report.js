$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Example1.feature");
formatter.feature({
  "name": "Test Registration",
  "description": "Description: User stories",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test Registration with valid date",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user open application newtours.demoaut.com",
  "keyword": "Given "
});
formatter.match({
  "location": "Test1.user_open_application_newtours_demoaut_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks registration",
  "keyword": "When "
});
formatter.match({
  "location": "Test1.user_clicks_registration()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users validates registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "Test1.users_validates_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter firstname as \"Gautami\" in firstname field",
  "keyword": "When "
});
formatter.match({
  "location": "Test1.user_enter_firstname_as_in_firstname_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter lastname as \"Keskar\" in lastname field",
  "keyword": "And "
});
formatter.match({
  "location": "Test1.user_enter_lastname_as_in_lastname_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters pssword as \"password\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Test1.user_enters_pssword_as_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters confirm password as \"password\" in confirm password field",
  "keyword": "And "
});
formatter.match({
  "location": "Test1.user_enters_confirm_password_as_in_confirm_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on register button",
  "keyword": "And "
});
formatter.match({
  "location": "Test1.user_click_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates registration success",
  "keyword": "Then "
});
formatter.match({
  "location": "Test1.user_validates_registration_success()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/Example2.feature");
formatter.feature({
  "name": "Login test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with valid test data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user open application",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter username as \"\u003cusername\u003e\" in userName field",
  "keyword": "When "
});
formatter.step({
  "name": "user enters password as \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "name": "validates login success",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ]
    },
    {
      "cells": [
        "mercury",
        "dfsa"
      ]
    },
    {
      "cells": [
        "sdja",
        "mercury"
      ]
    },
    {
      "cells": [
        "grkeg",
        "fhbjhrg"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with valid test data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user open application",
  "keyword": "Given "
});
formatter.match({
  "location": "Test2.user_open_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username as \"mercury\" in userName field",
  "keyword": "When "
});
formatter.match({
  "location": "Test2.user_enter_username_as_in_userName_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"mercury\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Test2.user_enters_password_as_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signin",
  "keyword": "And "
});
formatter.match({
  "location": "Test2.click_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validates login success",
  "keyword": "Then "
});
formatter.match({
  "location": "Test2.validates_login_success()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid test data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user open application",
  "keyword": "Given "
});
formatter.match({
  "location": "Test2.user_open_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username as \"mercury\" in userName field",
  "keyword": "When "
});
formatter.match({
  "location": "Test2.user_enter_username_as_in_userName_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"dfsa\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Test2.user_enters_password_as_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signin",
  "keyword": "And "
});
formatter.match({
  "location": "Test2.click_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validates login success",
  "keyword": "Then "
});
formatter.match({
  "location": "Test2.validates_login_success()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat Testcases.Test2.validates_login_success(Test2.java:42)\r\n\tat ✽.validates login success(src/test/resources/features/Example2.feature:9)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Login with valid test data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user open application",
  "keyword": "Given "
});
formatter.match({
  "location": "Test2.user_open_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username as \"sdja\" in userName field",
  "keyword": "When "
});
formatter.match({
  "location": "Test2.user_enter_username_as_in_userName_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"mercury\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Test2.user_enters_password_as_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signin",
  "keyword": "And "
});
formatter.match({
  "location": "Test2.click_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validates login success",
  "keyword": "Then "
});
formatter.match({
  "location": "Test2.validates_login_success()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat Testcases.Test2.validates_login_success(Test2.java:42)\r\n\tat ✽.validates login success(src/test/resources/features/Example2.feature:9)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Login with valid test data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user open application",
  "keyword": "Given "
});
formatter.match({
  "location": "Test2.user_open_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username as \"grkeg\" in userName field",
  "keyword": "When "
});
formatter.match({
  "location": "Test2.user_enter_username_as_in_userName_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"fhbjhrg\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Test2.user_enters_password_as_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signin",
  "keyword": "And "
});
formatter.match({
  "location": "Test2.click_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validates login success",
  "keyword": "Then "
});
formatter.match({
  "location": "Test2.validates_login_success()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat Testcases.Test2.validates_login_success(Test2.java:42)\r\n\tat ✽.validates login success(src/test/resources/features/Example2.feature:9)\r\n",
  "status": "failed"
});
formatter.uri("src/test/resources/features/Example3.feature");
formatter.feature({
  "name": "Testme application login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user enters valid login credentials",
  "keyword": "* "
});
formatter.match({
  "location": "Test3.user_enters_valid_login_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Searching available products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Search"
    }
  ]
});
formatter.step({
  "name": "search for the available products",
  "keyword": "* "
});
formatter.match({
  "location": "Test3.search_for_the_available_products()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add to cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Cart"
    }
  ]
});
formatter.step({
  "name": "adding product to cart",
  "keyword": "* "
});
formatter.match({
  "location": "Test3.adding_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "payment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@payment"
    }
  ]
});
formatter.step({
  "name": "payment process",
  "keyword": "* "
});
formatter.match({
  "location": "Test3.payment_process()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Logout",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Logout"
    }
  ]
});
formatter.step({
  "name": "Logout from application",
  "keyword": "* "
});
formatter.match({
  "location": "Test3.logout_from_application()"
});
formatter.result({
  "status": "passed"
});
});