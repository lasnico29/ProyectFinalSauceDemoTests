Feature: Home Page

  Background: User login into Sauce Demo
    Given I am in sauce demo web page
    When I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button


  Scenario: Check Facebook link
    When I check the Facebook link
    And I click on the Facebook link
    Then I should be redirected to the Sauce Labs Facebook page

  Scenario: Verify product sorting by price from high to low
    And I sort the products by price from high to low
    Then The products should be sorted by price from high to low

  Scenario: User logs out and is redirected to the login page
    When I open the menu
    And I click on the logout button
    Then The login button should be displayed
