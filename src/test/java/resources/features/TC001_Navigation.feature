Feature: Splash & Login

  Scenario: Verify navigate to ABDirect Splash & Login and titles of the pages
    Given I open the browser
    When I navigate to "https://abdirectcloud.abbl.com/welcome-page"
    Then I should see the page title "ABDirect"
    When I click on the Login Button
    Then I navigate to the Login Page and can see login title "Log In to Your Account"
