Feature: User authentication in souce demo web site
  As a user of the Sauce Store platform
  I want to login
  To see the products I want to buy

  Scenario Outline: successful authentication
    Given that Nicolas is on Souce Demo home page
    When he enters his "<user>" and "<password>"
    Then he should log in correctly

    Examples:
      | user          | password           |
      | standard_user | secret_sauce       |