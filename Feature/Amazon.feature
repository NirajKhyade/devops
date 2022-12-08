@RunAll
Feature: Login Amazon.in

  Background: Open Amazon Website
    Given User Launch  Browser
    When User Enter Url

  @withoutLogin
  Scenario: Without Login
    When User Click On Today's Deal
    And User CLick On Third Deal
    And User Click On Product
    And Click On Add To Cart Button
    And Verify Quantity as "1"
    When User Search The "mobile"
    Then Product Page Is Visible
    When Scroll Down The Page
    And Get The Last Displayed Item Details
    And Click On Left Navigation
    And Close The Browser

  @withLogin
  Scenario: With Login
    When User Click On SignUp Button
    And User Enter Email and Password
    And Click On Login
    Then Select The Prime Delivery Checkbox
    And Get The First Item Delivery Date
    When Click On Your Order
    And Select Past One Year Order
    When Click On Account
    And Click On Add Payment Option
    Then Verify Payment Option
    When Click On Account
    And Click On Add Address Option
    And Add The Address With All Details
    Then Verify Address is Added
    And Close Browser



