Feature: FizzBuzz Game play

  Scenario: Play FizzBuzz to get FizzBuzz
    Given Create a FizzBuzz game play
    When I play with number 15
    Then The result is "FizzBuzz"