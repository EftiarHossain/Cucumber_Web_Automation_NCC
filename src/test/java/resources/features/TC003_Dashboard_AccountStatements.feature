Feature: Accounts

  Scenario: Validate Dashboard, Account Details, Statement Download, DPS, FDR & Loan
    When I navigate to my dashboard
    Then I can see my Accounts
    When I click on any Account
    Then I can see mini details of my Account
    When I click on View Statement from the mini details
    Then I can see the Statement search by Account and able to download statements




