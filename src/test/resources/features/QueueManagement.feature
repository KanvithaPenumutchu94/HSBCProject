Feature: QueueManagement feature

  Scenario: Validate QueueManagement functionality
    Given user is on login page
    When user enters Email address 
    And user enters Password 
    And user clicks on Signin button
    When user clicks on Creator Login button
    And user clicks on Upload Statement button
    And user clicks on Upload Statement PDF button
    When user picks customer from pick customer dropdown
    And user clicks on upload statement button below the dropdown
    And user uploads Pdf Statement
    And user clicks on Upload button
    Then validate Attention alert on top right corner
    Then validate Success alert on top right corner
 	  Then validate new result added in customerId data table
 	  When user clicks on new result in customer table
 	  Then user should see Recompute button in Stock Information page
 	  
 	  
    
