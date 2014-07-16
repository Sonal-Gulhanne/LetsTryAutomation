Feature: I want to test a simple feature

  Scenario Outline: I want to add 2 number and get the result
    Given there are <start> cucumbers
    When I <eat> cucumbers
    Then there are these many <left> cucumbers
  Examples:
    | start | eat | left |
    | 12    | 5   | 7    |
    | 20    | 10  | 10   |

  Scenario Outline: : I want to search on google page
    Given I am on the site "http://google.co.uk"
    When I type "<name>" in the "gbqfq" box
    And I click search button
    Then I should see search results for "<name>"
  Examples:
    | name    |
    | Abhinav |
    | Vaid    |