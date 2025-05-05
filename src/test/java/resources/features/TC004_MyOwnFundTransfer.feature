#Feature: Own Account Fund Transfer
#
#  Scenario: Verify Successful Own Account FT Conventional to Islamic
#    When I navigate to the Own Account Fund Transfer
#    Then I can see my Account list to transfer money
#    Then I select an Account "7022010001185" to transfer money
#    Then I select from account "ACCOUNT - 0027-0250001161 / CONVENTIONAL" and available balance populated
#    Then I input transfer amount "100" below my available balance and remarks and confirm next to continue
#    Then I can see transaction details screen, select OTP channel, accept the terms and confirm next to continue by OTP verification
#    Then I can see transaction confirmation screen for "OWN_ACCOUNT" transfer with success or fail status and the details of the transactions
#    Then I can download the transaction receipt for "OWN_ACCOUNT" transfer
#    Then I can add the "OWN_ACCOUNT" transfer transaction to favourite "ownFav"
#    Then I can navigate to home clicking Go To Home for "OWN_ACCOUNT" transfer
#
#  Scenario: Verify Successful Own Account FT Conventional to Conventional
#    When I navigate to the Own Account Fund Transfer
#    Then I can see my Account list to transfer money
#    Then I select an Account "0103-0450000085" to transfer money
#    Then I select from account "ACCOUNT - 0027-0250001161 / CONVENTIONAL" and available balance populated
#    Then I input transfer amount "100" below my available balance and remarks and confirm next to continue
#    Then I can see transaction details screen, select OTP channel, accept the terms and confirm next to continue by OTP verification
#    Then I can see transaction confirmation screen for "OWN_ACCOUNT" transfer with success or fail status and the details of the transactions
#    Then I can download the transaction receipt for "OWN_ACCOUNT" transfer
#    Then I can add the "OWN_ACCOUNT" transfer transaction to favourite "OwnFav"
#    Then I can navigate to home clicking Go To Home for "OWN_ACCOUNT" transfer