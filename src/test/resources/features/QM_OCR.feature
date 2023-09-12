Feature: OCR Process in Queue Management

  Scenario: Queue Management OCR Process
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
    And user selects date on statement
    And user enters HSBC sanctioned fund based limit
    And user clicks on details section
    And user clicks on stock value details and enters the values
    And user clicks on creditors value details and enters the values
    And user clicks on post margin deductions value details and enters the values
    And user clicks on ageing details-domestic and enters the values
    And user clicks on ageing details-export and enter the values
