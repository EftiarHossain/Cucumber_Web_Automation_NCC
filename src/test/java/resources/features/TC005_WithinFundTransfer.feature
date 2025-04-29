#Feature: Within NCC Bank Fund Transfer

#  Scenario: Verify Successful Within Account FT
#    When I navigate to the Within Account Fund Transfer
#    Then I click on One Time Pay to Transfer Money
#    Then I select From Account Number "ACCOUNT - 0027-0250001161 / CONVENTIONAL", input To Account Number "0103-0250007260", transfer amount "500" below my available balance and remarks and confirm next to continue
#    Then I can see transaction details screen, select OTP channel, accept the terms and confirm next to continue by OTP verification
#    Then I can see transaction confirmation screen with success or fail status and the details of the transactions
#    Then I can download the transaction receipt
#    Then I can add the transaction to favourite "WithinFT"
#    Then I can navigate to home clicking Go To Home