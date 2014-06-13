Feature: I want to test a simple feature

        Scenario Outline: I want to add 2 number and get the result
        Given there are <start> cucumbers
        When I <eat> cucumbers
        Then there are these many <left> cucumbers
        Examples:
        |start|eat|left|
        |  12   |  5|  7  |
          |    20   | 10  |  10   |