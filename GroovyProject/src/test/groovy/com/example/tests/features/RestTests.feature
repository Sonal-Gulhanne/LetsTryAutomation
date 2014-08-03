Feature: I want to test rest services

  Scenario: i want to do a get request
    Given There is an end point
    And I do a "GET" request
    Then I should see this response