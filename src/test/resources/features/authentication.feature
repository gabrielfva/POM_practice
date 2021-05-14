#Autor: gabrielfva
#email: gabrielfva@gmail.com

Feature: User authentication in souce demo web site
  As a user of the Sauce Store platform
  I want to login
  To see the products I want to buy

  Background:
    Given that Nicolas is on Sauce Demo home page

  Scenario Outline: successful authentication
    When he enters his "<user>" and "<password>"
    Then he should log in correctly
    Examples:
      | user          | password           |
      | standard_user | secret_sauce       |
      | problem_user  | secret_sauce       |
      | performance_glitch_user | secret_sauce|

    Scenario Outline: login with blocked user
      When he enters his "<user>" and "<password>"
      Then he should see the message: "Epic sadface: Sorry, this user has been locked out."
      Examples:
        | user           | password        |
        |locked_out_user | secret_sauce    |