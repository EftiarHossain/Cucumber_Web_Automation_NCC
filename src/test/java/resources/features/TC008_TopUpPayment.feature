Feature: MFS Fund Transfer

  Scenario: Verify Successful bKash FT
    When I navigate to "https://abdirectcloud.abbl.com/project/bank-account"
    Then I navigate to my dashboard
    Then I navigate to the TopUp Payment
    Then I click on Continue Without Beneficiary to Transfer Money via TopUp
