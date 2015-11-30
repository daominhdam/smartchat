Feature: Chat function

In order to use SmartChat application
As a user
I want to be able to send messages from an account to another

Scenario: Send messages from an account to another
Given I am on the "Login" page
When I fill in username textbox on "Login" page with "testing01"
And I fill in password textbox on "Login" page with "123456"
And I click on Login button on Login page
And I select an user "testing02" from the chat list
And I fill in message textbox with "random message"
And I click on Send button on Chat page
Then The chat message should be displayed with "random string"