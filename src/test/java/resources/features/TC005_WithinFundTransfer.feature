Feature: Within ABBL Fund Transfer

  Scenario: Verify Successful WithIn Account FT
    Given I open the browser
    When I navigate to "https://abdirectcloud.abbl.com/welcome-page"
    Then I should see the page title "ABDirect"
    When I click on the Login Button
    Then I navigate to the Login Page and can see login title "Log In to Your Account"
    When I login with "eftitestcard" and "123456@Aa"
    Then I should see OTP Channel Selection Modal for Device Binding "We found a new device, would you like to bind it to continue?"
    When I verify 2fa Successfully With SMS "1111"
    Then I navigate to my dashboard
    When I navigate to "https://abdirectcloud.abbl.com/project/bank-account"
    Then I navigate to my dashboard
    Then I navigate to the Within Account Fund Transfer
    Then I click on Continue Without Beneficiary to Transfer Money
    Then I navigated to the transfer details screen for Within FT with a selected from account and available balance populated
    Then I input To Account Number "4006539385300", transfer amount "50" below my available balance and remarks and confirm next to continue
    Then I can see transaction details screen, select OTP channel, accept the terms and confirm next to continue by OTP verification "1111"
    Then I can see transaction confirmation screen with success or fail status and the details of the transactions
    Then I can download the transaction receipt
    Then I can add the transaction to favourite "WithinFT"
    Then I can navigate to home clicking Go To Home