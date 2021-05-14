#Autor: gabrielfva
#email: gabrielfva@gmail.com

Feature: buy products from the Sauce Store
  As a user of the Sauce Store platform
  I want to buy some of their products
  To supply a need

  Background:
    Given that Nicolas wants to buy a product from the store

  Scenario Outline: See all the available products
    When he enters his "<user>" and "<password>"
    Then he should see all the available products in the virtual store

    Examples:
      | user          | password           |
      | standard_user | secret_sauce       |

#  Scenario: Buy some products
#    And choose the products he wants to buy
#    And provides his personal information
#    Then he should be able to buy the products
#
#  Scenario: Compare products prices
#    And choose the products he wants to buy
#    And provides his personal information
#    Then he could compare the prices of the products