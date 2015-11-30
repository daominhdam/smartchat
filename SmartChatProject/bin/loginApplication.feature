Feature: Log in application
  
  In order to use SmartChat application
  As a user
  I want to be able to login to application

  Scenario: Login by leaving all fields empty
    Given I am on the "Login" page
    When I leave all fields empty on "Login" page
    And I click on Login button on Login page
    Then The error "Please fill all the fields" should be displayed on "Login" page

  Scenario: Login by entering incorrect login information
    Given I am on the "Login" page
    When I fill in username textbox on "Login" page with "invalid"
    And I fill in password textbox on "Login" page with "invalid"
    And I click on Login button on Login page
    Then The error "invalid login parameters" should be displayed on "Login" page

  Scenario: Login by entering correct login information
    Given I am on the "Login" page
    When I fill in username textbox on "Login" page with "testing01"
    And I fill in password textbox on "Login" page with "123456"
    And I click on Login button on Login page
    Then The Home page should be displayed
