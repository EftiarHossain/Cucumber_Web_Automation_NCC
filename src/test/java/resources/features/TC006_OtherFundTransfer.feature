Feature: Other Bank Account/Card Fund Transfer

  Scenario: Verify Successful NPSB Account FT
    When I navigate to "https://abdirectcloud.abbl.com/project/bank-account"
    Then I navigate to my dashboard
    Then I navigate to the Other Account Fund Transfer
    Then I click on Continue Without Beneficiary to Transfer Money
    Then I navigated to the transfer details screen for Other FT with a selected from account and available balance populated
    Then I input To Account Number "2182603692001", To Account Name "S M EFTIAR HOSSAIN", Select Account, Select Bank, Select District, Select Branch, Select NPSB, Input transfer amount "50" below my available balance and remarks and confirm next to continue
    Then I can see transaction details screen, select OTP channel, accept the terms and confirm next to continue by OTP verification "1111"
    Then I can see transaction confirmation screen with success or fail status and the details of the transactions
    Then I can download the transaction receipt
    Then I can add the transaction to favourite "OtherFT"
    Then I can navigate to home clicking Go To Home

  Scenario: Verify Successful NPSB Card FT
    When I navigate to "https://abdirectcloud.abbl.com/project/bank-account"
    Then I navigate to my dashboard
    Then I navigate to the Other Account Fund Transfer
    Then I click on Continue Without Beneficiary to Transfer Money
    Then I navigated to the transfer details screen for Other FT with a selected from account and available balance populated
    Then I input To Account Number "2182603692001", To Account Name "S M EFTIAR HOSSAIN", Select Card, Select Bank, Select District, Select Branch, Select NPSB, Input transfer amount "50" below my available balance and remarks and confirm next to continue
    Then I can see transaction details screen, select OTP channel, accept the terms and confirm next to continue by OTP verification "1111"
    Then I can see transaction confirmation screen with success or fail status and the details of the transactions
    Then I can download the transaction receipt
    Then I can add the transaction to favourite "OtherFT"
    Then I can navigate to home clicking Go To Home

  Scenario: Verify Successful BFTN Account FT
    When I navigate to "https://abdirectcloud.abbl.com/project/bank-account"
    Then I navigate to my dashboard
    Then I navigate to the Other Account Fund Transfer
    Then I click on Continue Without Beneficiary to Transfer Money
    Then I navigated to the transfer details screen for Other FT with a selected from account and available balance populated
    Then I input To Account Number "2182603692001", To Account Name "S M EFTIAR HOSSAIN", Select Account, Select Bank, Select District, Select Branch, Select BEFTN, Input transfer amount "50" below my available balance and remarks and confirm next to continue
    Then I can see transaction details screen, select OTP channel, accept the terms and confirm next to continue by OTP verification "1111"
    Then I can see transaction confirmation screen with success or fail status and the details of the transactions
    Then I can download the transaction receipt
    Then I can add the transaction to favourite "OtherFT"
    Then I can navigate to home clicking Go To Home

  Scenario: Verify Successful BFTN Card FT
    When I navigate to "https://abdirectcloud.abbl.com/project/bank-account"
    Then I navigate to my dashboard
    Then I navigate to the Other Account Fund Transfer
    Then I click on Continue Without Beneficiary to Transfer Money
    Then I navigated to the transfer details screen for Other FT with a selected from account and available balance populated
    Then I input To Account Number "2182603692001", To Account Name "S M EFTIAR HOSSAIN", Select Card, Select Bank, Select District, Select Branch, Select BEFTN, Input transfer amount "50" below my available balance and remarks and confirm next to continue
    Then I can see transaction details screen, select OTP channel, accept the terms and confirm next to continue by OTP verification "1111"
    Then I can see transaction confirmation screen with success or fail status and the details of the transactions
    Then I can download the transaction receipt
    Then I can add the transaction to favourite "OtherFT"
    Then I can navigate to home clicking Go To Home