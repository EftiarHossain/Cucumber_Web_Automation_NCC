Feature: Login

  Scenario: Verify Successful Login With Device Binding
    When I login with "sadman" and "1234"
    Then I should see OTP Channel Selection Modal for Device Binding "We have found a new device. Would you like to bind it to continue?"
    When I verify 2fa Successfully With Email
    Then I navigate to my dashboard