$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Amazon.feature");
formatter.feature({
  "name": "Login Amazon.in",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RunAll"
    }
  ]
});
formatter.background({
  "name": "Open Amazon Website",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch  Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonSteps.user_Launch_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Url",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonSteps.user_Enter_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "With Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RunAll"
    },
    {
      "name": "@withLogin"
    }
  ]
});
formatter.step({
  "name": "User Click On SignUp Button",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonSteps.userClickOnSignUpButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Email and Password",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSteps.userEnterEmailAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Login",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSteps.clickOnLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select The Prime Delivery Checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonSteps.selectThePrimeDeliveryCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get The First Item Delivery Date",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSteps.getTheFirstItemDeliveryDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Your Order",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonSteps.clickOnYourOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Past One Year Order",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSteps.selectPastOneYearOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Account",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonSteps.clickOnAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Add Payment Option",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSteps.clickOnAddPaymentOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Payment Option",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonSteps.verifyPaymentOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Account",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonSteps.clickOnAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Add Address Option",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSteps.clickOnAddAddressOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add The Address With All Details",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSteps.addTheAddressWithAllDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Address is Added",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonSteps.verifyAddressIsAdded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSteps.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});