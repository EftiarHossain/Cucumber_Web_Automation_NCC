Feature: Own Card Bill Payment

  Scenario: Verify Successful Own Card Bill Payments
    Given I open the browser
    When I navigate to "https://abdirectcloud.abbl.com/welcome-page"
    Then I should see the page title "ABDirect"
    When I click on the Login Button
    Then I navigate to the Login Page and can see login title "Log In to Your Account"
    When I login with "efticardtest" and "123456@Aa"
    Then I should see OTP Channel Selection Modal for Device Binding "We found a new device, would you like to bind it to continue?"
    When I verify 2fa Successfully With SMS "1111"
    Then I navigate to my dashboard
    Then I navigate to my dashboard
    When I navigate to "https://abdirectcloud.abbl.com/project/bank-account"
    Then I navigate to my dashboard
    Then I navigate to the Card Bill Payment
    Then I navigated to the own credit card details screen for own card bill payment and select a from account and available balance populated
    Then I select To Currency, Select payment amount, Input Payment Amount "50", Remarks "test" and confirm next to continue
    Then I can see transaction review screen for Own Card Payment, select currency, select OTP channel, accept the terms and click confirm to continue by OTP verification "1111"
    Then I can see transaction confirmation screen with success or fail status and the details of the transactions
    Then I can download the payment receipt
    Then I can navigate to home clicking Go To Home