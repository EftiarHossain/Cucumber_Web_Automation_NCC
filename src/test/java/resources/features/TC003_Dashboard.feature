Feature: Dashboard

  Scenario: Validate Dashboard, Account Details, Statement, DPS, FDR, Loan & Card Details
    When I navigate to my dashboard
    Then I can see my Accounts
    When I click on any Account
    Then I can see mini details of my Account
    When I click on View Statement from the mini details
    Then I can see the Statement search by Account and able to download statements
    When I navigate to my dashboard
    Then I can click on the Card Tab to see my Credit Cards
    When I click on any Card
    Then I can see mini details of the card
    When I click on the Info button
    Then I can see Card details
    Then I can see Card Endorsement Info
    Then I can see and download Card Transaction History
    Then I can see Card Unbilled Transaction






