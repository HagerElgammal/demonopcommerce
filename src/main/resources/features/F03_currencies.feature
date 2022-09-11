@smoke
Feature: F04_currencies | user could choose and verify Euro Currencies in products

  Scenario: user could choose Euro and feature of 4 products will show prices in Euro

    When user select Euro from list on the top of home page
    Then featured 4 products will be displayed in Euro currency

