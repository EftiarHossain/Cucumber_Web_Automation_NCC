Feature: Other Credit Card Bill Payment

  Scenario: Verify Successful Other Credit Card Bill Payment
    When I navigate to "https://abdirectcloud.abbl.com/project/bank-account"
    Then I navigate to my dashboard
    Then I navigate to the Card Bill Payment
    Then I navigated to the Other credit card details screen for Other card bill payment and select a from account and available balance populated
    Then I select Bank Name, Input Card Number "323456789876543", Card Holder name "S M EFTIAR HOSSAIN", Payment Amount "50", Remarks "aUTOMATEDtEST" and confirm next to continue
    Then I can see transaction details screen for Other Card Payment, select OTP channel, accept the terms and click confirm to continue by OTP verification "1111"
    Then I can see transaction confirmation screen with success or fail status and the details of the transactions
    Then I can download the payment receipt
    Then I can navigate to home clicking Go To Home