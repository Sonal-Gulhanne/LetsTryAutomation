Feature: I want to test the Internet site

  Scenario: I want to test AB Testing link
    Given I am on the site "http://the-internet.herokuapp.com/"
    When I click on "//a[.='A/B Testing']" link
    Then I should be able to verify the page text
