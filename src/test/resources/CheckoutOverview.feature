Feature: Verify the item total after adding products to the cart
  Background: User login into Sauce Demo
    Given I am in sauce demo web page
    When I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  #Scenario Outline: Verify item total with different customer details
   # And I add Sauce Labs Bike Light and Sauce Labs Fleece Jacket to the cart
    #And I proceed to the cart
   # And I proceed to checkout
   # And I fill in the customer information with first name "<firstName>", last name "<lastName>", and postal code "<postalCode>"
   # Then The item total should be "<expectedTotal>"

    #Examples:
     # | firstName | lastName | postalCode | expectedTotal                   |
      #| Nicolas | Moscoso | 0000 | Item total: $59.980000000000004 |
      #| Nicolas | Moscoso | 0000 | Item total: $59.98 |

  Scenario Outline: Verify succesfully purchase
    And I add Sauce Labs Bike Light and Sauce Labs Fleece Jacket to the cart
    And I proceed to the cart
    And I proceed to checkout
    And I fill in the customer information with first name "<first_name>", last name "<last_name>", and postal code "<postal_code>"
    And I click on finish button
    Then The purchase should be successful
    Examples:
      | first_name | last_name | postal_code |
      | Nicolas    | Moscoso   | 0000        |
      | John       | Doe       | 1234        |

