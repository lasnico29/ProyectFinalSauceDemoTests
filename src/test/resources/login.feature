Feature: Login Sauce Demo App

  Background: User login into Sauce Demo
    Given I am in sauce demo web page

  Scenario: Login into Sauce Demo with valid credentials
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    When I click on the login button
    #Then The home page should be displayed