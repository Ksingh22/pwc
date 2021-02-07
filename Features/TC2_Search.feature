Feature: Magnifying glass search
  Scenario: click on magnifying glass icon to perform search
    Given I navigate to the PwC Digital Plus website
    When I click on the Magnifying glass icon to perform a search
    And I Enter the text "Single page applications" and submit the search
    And I submit the search
    Then I am taken to the search result page
    And I am presented with at least one search result