Feature: Fist choose Flight

  Scenario: Choose Flight
    Given the user stay in the page despegar
    When the user fills out the form
    And choose rooms and pay
    Then the user validation that he purchased the flight