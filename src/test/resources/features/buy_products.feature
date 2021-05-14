#Autor: gabrielfva
#email: gabrielfva@gmail.com

Feature: buy products from the Sauce Store
  As a user of the Sauce Store platform
  I want to buy some of their products
  To supply a need

  Background:
    Given that Nicolas wants to buy a product from the store
    When he logs into the platform

  Scenario: See all the available products
    Then he should see all the available products in the virtual store

#  Scenario: Buy some products
#    And choose the products he wants to buy
#    And provides his personal information
#    Then he should be able to buy the products
#
#  Scenario: Compare products prices
#    And choose the products he wants to buy
#    And provides his personal information
#    Then he could compare the prices of the products