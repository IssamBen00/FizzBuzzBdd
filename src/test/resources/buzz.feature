Feature: Buzz Game play
  Scenario: Play FizzBuzz to get Buzz
    Given Create a FizzBuzz game play
    When I play with number 5
    Then The result is "Buzz"
