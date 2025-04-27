#Feature: MFS Fund Transfer
#
#  Scenario: Verify Successful bKash FT
#    When I navigate to "https://abdirectcloud.abbl.com/project/bank-account"
#    Then I navigate to my dashboard
#    Then I navigate to the MFS Fund Transfer
#    Then I click on Continue Without Beneficiary to Transfer Money via MFS
#    Then I navigated to the transfer details screen for MFS bKash FT with a selected from account and available balance populated
#    Then I input To Account Number "01777666213" for bkash, transfer amount "50" below my available balance and remarks and confirm next to continue
#    Then I can see transaction details screen for MFS, select OTP channel, accept the terms and click confirm to continue by OTP verification "1111"
#    Then I can see transaction confirmation screen with success or fail status and the details of the transactions
#    Then I can download the transaction receipt
#    Then I can add the transaction to favourite "MFSbKash"
#    Then I can navigate to home clicking Go To Home