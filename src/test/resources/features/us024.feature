@us024 @SmokeTest1
Feature: US_24 System should allow to create new states using api endpoint
  Scenario: User can Just create each state 1 by 1 / TC_2401 before POST request
    Given Use api end point "http://gmibank.com/api/tp-states"
    When User sends a POST request to REST API endpoint "http://gmibank.com/api/tp-states" as "Angara"


