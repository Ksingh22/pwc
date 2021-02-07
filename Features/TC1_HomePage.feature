Feature: Pwc Home page
  Scenario: Navigate through Pwc Home page
    Given I navigate to the PwC digital Pulse website
    When I am viewing the Home page
    Then I am presented with a carousel displaying three featured articles
    And Clicking next button on the carousel will load next three featured articles
    And Clicking previous button on the carousel will load previous three featured articles