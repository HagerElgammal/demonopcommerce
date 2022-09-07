@smoke
Feature: F04_Search.feature| users could use search functionality to search for products

  Scenario: user could search using product name
    Given user search for "laptop"
    When user clicks on search button
    Then user go to search page
    And user search shows the result
    And user found correct name of search in search result


  Scenario: user could search for product using sku
    Given user search for "M8_HTC_5L"
    When user clicks on search button
    And user find the product
    Then user clicks on product name
    And user match the search sku successfully