Feature: Creator Login

  Scenario: Validate Creator Login
    Given user is on login page
    When user enters Email address 
    And user enters Password 
    And user clicks on Signin button
    When user clicks on Creator Login button
    Then user should able to see creator home page
    
    Scenario: Validate Search Customer in Queue Management system
     Given user is on login page
    When user enters Email address 
    And user enters Password
    And user clicks on Signin button
    When user clicks on Creator Login button
    And user enters CustomerId in Search Customer box
    And user press ENTER key
    Then validate results based on customerId in data table
    
