Feature: check data table

  Scenario: login fuctinality
    Given user is on login page
    When user enter data
      | Admin  | admin123 |
      | Vishal | ghule    |
      
    Then user is home page
