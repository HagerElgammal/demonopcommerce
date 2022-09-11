@smoke
Feature: F04_Search.feature| users could use different parameters to search for products

  Scenario Outline: user could search using product name


    When user clicks on search field
    And user search with "<productName>"
    Then user search find "<productName>" relative results

    Examples:
    |productName|
    |book |
    |laptop|
    |nike|

  Scenario Outline: user could search for product using sku
    When user clicks on search field
    And user search with "<sku>"
    Then user search finds "<sku>" relative results

    Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|