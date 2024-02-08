Feature: facebook application

  Scenario Outline: fb login functinality
    Given user is on login page come
    When user enter valid "<username>" and valid "<password>"
    Then user is on Homepage opration

    Examples: 
      | username  |  | password  |
      | username1 |  | password1 |
      | username2 |  | password2 |
      | username3 |  | password3 |
      | username4 |  | password4 |
      | username5 |  | password5 |
