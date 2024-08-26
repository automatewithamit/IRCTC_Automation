Feature: irctc login feature

  Scenario: Search Train
    Given User navigates to "https://www.irctc.co.in/"
    When user enters "PNQ" Station in From field
    And user enters "LKO" Station in To field
    And Click on Search
    Then User should be presented with train list from "PNQ" to "LKO"
