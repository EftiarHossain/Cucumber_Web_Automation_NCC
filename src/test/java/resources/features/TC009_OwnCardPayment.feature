Feature: Own Card Bill Payment

  Scenario: Verify Successful Own Card Bill Payments
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