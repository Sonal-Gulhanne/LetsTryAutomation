Feature: I want to test REST services

  Scenario: I want to test a GET request
    Given I have a REST end point ""
    When I do a "GET" request
    Then I should see the result