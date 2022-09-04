@smoke
Feature: F03_currencies | user could verify Euro Currencies in products

  Scenario: user could choose Euro in 4 products

    Given user select Euro from list on the top of home page
    Then featured  product 1 will be in Euro currency
    And featured  product 2 will be in Euro currency
    And featured  product 3 will be in Euro currency
    And featured  product 4 will be in Euro currency
