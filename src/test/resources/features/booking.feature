Feature: Hotel reservation on Booking with login

  Scenario: Log in and reserve a hotel with filters
    Given the user opens the Booking website
    When the user logs in with valid credentials
    And the user searches for hotels using predefined filters
    Then the user selects the cheapest hotel and saves its information
