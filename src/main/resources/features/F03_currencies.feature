@smoke
Feature: F03_currencies | user could verify Euro Currencies in products

  Scenario: user could choose Euro and feature of 4 products will show prices in Euro

    Given user select Euro from list on the top of home page
    Then featured 4 products will be in Euro currency
    And user print the value of 4 product
