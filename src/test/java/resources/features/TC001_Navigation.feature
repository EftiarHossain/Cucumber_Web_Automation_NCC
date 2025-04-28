Feature: Splash & Login

  Scenario: Verify navigate to NCC Splash & Login and titles of the pages
    Given I open the browser
    When I navigate to "https://ibwebuat.nccbank.com.bd/sign-in"
    Then I should see the page title "NCC Always"
    Then I can see the app logo

