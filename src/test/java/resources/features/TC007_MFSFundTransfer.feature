Feature: MFS Fund Transfer

#  Scenario: Verify Successful bKash FT
#    When I click on MFS fund transfer
#    Then I click on One Time Pay to Transfer Money via MFS "bKash"
#    Then I select From Account Number "ACCOUNT - 0027-0250001161 / CONVENTIONAL", input To Account Number "01777666213" for "bkash", transfer amount "50" below my available balance and remarks and confirm next to continue
#    Then I can see transaction details screen for "bKash", select OTP channel, accept the terms and confirm next to continue by OTP verification
#    Then I can see transaction confirmation screen for "bKash" transfer with success or fail status and the details of the transactions
#    Then I can download the transaction receipt for "bKash" transfer
#    Then I can add the "bKash" transfer transaction to favourite "bKashFav"
#    Then I can navigate to home clicking Go To Home for "bKash" transfer

  Scenario: Verify Successful Rocket FT
    When I click on MFS fund transfer
    Then I click on One Time Pay to Transfer Money via MFS "Rocket"
    Then I select From Account Number "ACCOUNT - 0027-0250001161 / CONVENTIONAL", input To Account Number "016890865684" for "Rocket", transfer amount "50" below my available balance and remarks and confirm next to continue
    Then I can see transaction details screen for "Rocket", select OTP channel, accept the terms and confirm next to continue by OTP verification
    Then I can see transaction confirmation screen for "Rocket" transfer with success or fail status and the details of the transactions
    Then I can download the transaction receipt for "Rocket" transfer
    Then I can add the "Rocket" transfer transaction to favourite "RocketFav"
    Then I can navigate to home clicking Go To Home for "Rocket" transfer

  Scenario: Verify Successful Tap FT
    When I click on MFS fund transfer
    Then I click on One Time Pay to Transfer Money via MFS "Tap"
    Then I select From Account Number "ACCOUNT - 0027-0250001161 / CONVENTIONAL", input To Account Number "01550703241" for "Tap", transfer amount "50" below my available balance and remarks and confirm next to continue
    Then I can see transaction details screen for "Tap", select OTP channel, accept the terms and confirm next to continue by OTP verification
    Then I can see transaction confirmation screen for "Tap" transfer with success or fail status and the details of the transactions
    Then I can download the transaction receipt for "Tap" transfer
    Then I can add the "Tap" transfer transaction to favourite "Tap"
    Then I can navigate to home clicking Go To Home for "Tap" transfer