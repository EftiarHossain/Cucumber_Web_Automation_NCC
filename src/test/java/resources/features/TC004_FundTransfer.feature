Feature: Fund Transfer

  Scenario: Verify Successful Own Account FT
    When I login with "Shams1" and "123456@Aa"
    Then I should see OTP Channel Selection Modal for Device Binding "We found a new device, would you like to bind it to continue?"
    When I verify 2fa Successfully With SMS "1111"
    Then I navigate to my dashboard
    Then I navigate to the Own Account Fund Transfer
    Then I can see my Account list to transfer money
