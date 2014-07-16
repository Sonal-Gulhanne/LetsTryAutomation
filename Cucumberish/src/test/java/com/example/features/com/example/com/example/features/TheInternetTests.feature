Feature: I want to test the Internet site

  Background: I want to open herokuapp site everytime
    Given I am on the site "http://the-internet.herokuapp.com/"

  Scenario: I want to test AB Testing link
    When I click on "A/B Testing" link
    Then I should be able to verify the page text


  Scenario: I want to test the dynamic loading on the hero kuapp site
    When I click on "Dynamic Loading" link
    And I click on "Example 1: Element on page that is hidden" link
    Then I verify that Hello World! element is present and is visible false
    When I click on "Start" button
    Then I verify that Hello World! element is present and is visible true