@LoginDataDriven
Feature: Login fueature (Data Driven)

  Scenario Outline: Validate Login Functionality with different set of credentials
    Given user is on login page
    When user enters "<emailId>" in Email address field
    And user enters "<password>" in Password field
    And user clicks on signin button
    Then Validate "<outcome>" related to given emailid and password criteria

    Examples: 
      | emailId                       |  | password           |  | outcome |
      | nagalakshmi.s@TestPerform.com |  | How2trainurdr@gon2 |  | valid   |
      | nagalakshmi.s@TestPerform.com |  | fdadss             |  | invalid |
      |                               |  |                    |  | invalid |

  