#Feature: Metlife Bill Payment
#
#  Scenario: Verify Successful Metlife Bill Payment
#    Then I navigate to my dashboard
#    When I navigate to "https://abdirectcloud.abbl.com/project/bank-account"
#    Then I navigate to my dashboard
#    Then I navigate to the Bill Payment
#    Then I navigated to the Metlife bill payment details screen for bill payment and input Policy Name "Eftiar Hossain", Policy Number "4123456", Select purpose of payment, Input Payment Amount "100", Input Remarks "MetlifeTest" and click on the Next to navigate review page
#    Then I can see Bill Payment details on the review page with selected from account and available balance click on the confirm and select OTP channel, accept terms and condition and click on Send OTP for 2fa Verification by "1111"
#    Then I can see transaction confirmation screen with success or fail status and the details of the transactions
#    Then I can download the transaction receipt
#    Then I can add the transaction to favourite "MetlifeBillPayment"
#    Then I can navigate to home clicking Go To Home