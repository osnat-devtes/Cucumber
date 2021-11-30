Feature: Booking register

  Scenario: user can create an account
    Given an open browser with HotelTestlabCoderslab
    When a form is filled in with the user's data
    Then the webpage should contain 'Welcome to your account. Here you can manage all of your personal information and orders.'
