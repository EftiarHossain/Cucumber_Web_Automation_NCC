Feature: Within NCC Bank Fund Transfer

  Scenario: Verify Successful Within Account FT
    When I navigate to the Within Account Fund Transfer
    Then I click on Continue Without Beneficiary to Transfer Money
    Then I navigated to the transfer details screen for Within FT with a selected from account and available balance populated
    Then I input To Account Number "0103-0250007260", transfer amount "50" below my available balance and remarks and confirm next to continue
    Then I can see transaction details screen, select OTP channel, accept the terms and confirm next to continue by OTP verification
    Then I can see transaction confirmation screen with success or fail status and the details of the transactions
    Then I can download the transaction receipt
    Then I can add the transaction to favourite "WithinFT"
    Then I can navigate to home clicking Go To Home