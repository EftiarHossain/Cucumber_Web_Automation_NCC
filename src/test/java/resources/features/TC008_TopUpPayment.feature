Feature: Top Up Bill Payment

  Scenario: Verify Successful TopUp to GP
    When I navigate to the TopUp Payment
    Then I click on One Time Pay and select operator to TopUp
    Then I navigated to the transfer details screen for Topup with a selected from account and available balance populated
    Then I input To Account Number "01777666213" for topup, transfer amount "50" below my available balance, select connection type and remarks and confirm next to continue
    Then I can see transaction details screen for Topup, select OTP channel and continue by OTP verification
    Then I can see transaction confirmation screen with success or fail status and the details of the transactions for topup
    Then I can download the transaction receipt for topup
    Then I can add the transaction to favourite "TopUpGP" for topup
    Then I can navigate to home clicking Go To Home from topup succes page