Feature: Payment Execution From Transaction History

  Scenario: Verify navigate to NCC Splash & Login and titles of the pages
    Given I open the browser
    When I navigate to "https://ncc-customer-web.global.fintech23.xyz/sign-in"
    Then I should see the page title "NCC Always"
    Then I can see the app logo

  Scenario: Verify Successful Login With Device Binding
    When I login with "asif" and "123456@Aa"
    Then I should see OTP Channel Selection Modal for Device Binding "We have found a new device. Would you like to bind it to continue?"
    When I verify 2fa Successfully With SMS "1111"
    Then I navigate to my dashboard

  Scenario: Mobile Recharge
    When I navigate to Transaction History Page
    Then I can see the page title "Transaction History"
    When I can select Mobile Recharge from Transaction Type
    Then I can see "Action" Column
    Then I can see "Top Up Again" button name for Mobile Recharge
    Then I can store Amount, ToAccount, From Account and GrandTotal from Transaction History for Mobile Recharge
    When I can click on Action button
    Then I can navigate to the "Top Up Details" page
    Then I can compare To Account for Mobile Recharge
    Then I can compare From Account for Mobile Recharge
#    Then I can compare amount for Mobile Recharge

  Scenario: MFS Transfer
    When I navigate to Transaction History Page
    Then I can see the page title "Transaction History"
    When I can select MFS Transfer from Transaction Type
    Then I can see "Action" Column
    Then I can see "Transfer Again" button name for MFS Transfer
    Then I can store Amount, ToAccount, From Account and GrandTotal from Transaction History for Mobile Recharge
    When I can click on Action button

