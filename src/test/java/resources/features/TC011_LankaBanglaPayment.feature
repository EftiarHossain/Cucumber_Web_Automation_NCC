#Feature: Lanka Credit Card Bill Payment
#
#  Scenario: Verify Successful Lanka Credit Card Bill Payment
#    When I navigate to "https://abdirectcloud.abbl.com/project/bank-account"
#    Then I navigate to my dashboard
#    Then I navigate to the Card Bill Payment
#    Then I navigated to the lanka credit card details screen for lanka card bill payment and select a from account and available balance populated
#    Then I select Card Type for lanka, Input Card Number "1234567890999900", Card Holder name "S M Eftiar", Payment Amount "50", Remarks "Test" and confirm next to continue
#    Then I can see transaction details screen for Lanka Card Payment, select OTP channel, accept the terms and click confirm to continue by OTP verification "1111"
#    Then I can see transaction confirmation screen with success or fail status and the details of the transactions
#    Then I can download the payment receipt
#    Then I can navigate to home clicking Go To Home