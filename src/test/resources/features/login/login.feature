Feature: Login_check
  Testing Login from entering the phone number in the Login Screen

  Scenario: 1. Verify if relevant error message is displayed when user does not enter anything into the phoneNumber.
    Then User verifies that English language is selected by default
    And Clicks the language screen Next button
    Then verifies the phone number screen should be displayed
    Then click the phone number screen next button
    Then verify the user should not proceed further to next screen
    Then user enters an invalid number
    Then click the phone number screen next button
    Then verify the user should not proceed further to next screen


  Scenario: 2. Verify if user is  able to login to the app.
    Then User verifies that English language is selected by default
    And Clicks the language screen Next button
    Then verifies the phone number screen should be displayed
    Then user enters an valid number
    Then click the phone number screen next button
    Then verify the OTP screen is displayed
#    And user skips the complete screen and lands to the game screen