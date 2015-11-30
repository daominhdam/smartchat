Feature: Register account
  
  In order to use SmartChat application
  As a user
  I want to be able to register new account

  Scenario: Register by leaving all fields empty
    Given I am on the "Login" page
    Then I should able to see Register button
    When I click on Register button on "Login" page
    Then The Register page should be displayed
    When I leave all fields empty on "Register" page
    And I click on Register button on "Register" page
    Then The error "Please fill all the fields" should be displayed on "Register" page

  Scenario: Register by entering invalid email address
    Given I am on the "Register" page
    When I fill in email textbox with "invalid.com"
    And I fill in username textbox on "Register" page with "testuser"
    And I fill in password textbox on "Register" page with "testpassword"
    And I click on Register button on "Register" page
    Then The error "invalid email address" should be displayed on "Register" page

  Scenario: Register by entering valid data into all fields
    Given I am on the "Register" page
    When I fill in email textbox with "random email"
    And I fill in username textbox on "Register" page with "random user"
    And I fill in password textbox on "Register" page with "123456"
    And I click on Register button on "Register" page
    Then The Home page should be displayed

  Scenario: Register by entering an already taken user
    Given I am on the "Register" page
    When I fill in email textbox with "testing01@yopmail.com"
    And I fill in username textbox on "Register" page with "testing01"
    And I fill in password textbox on "Register" page with "123456"
    And I click on Register button on "Register" page
    Then The error "username testing01 already taken" should be displayed on "Register" page
