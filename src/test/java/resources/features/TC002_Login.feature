Feature: Login

  Scenario: Verify Successful Login With Device Binding
    Given I open the browser
    When I navigate to "https://ibwebuat.nccbank.com.bd/sign-in"
    Then I should see the page title "NCC Always"
    Then I can see the app logo
    When I login with "asif" and "123456@Aa"
    Then I should see OTP Channel Selection Modal for Device Binding "We have found a new device. Would you like to bind it to continue?"
    When I verify 2fa Successfully With SMS
    Then I navigate to my dashboard