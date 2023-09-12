@LoginPage
Feature: Login Feature1

  Scenario: Validate Login with valid credentials
    Given user is on login page
    When user enters Email address 
    And user enters Password 
    And user clicks on Signin button
    Then user should see Eco-System Management Portal

  Scenario: Vaidate HSBC home page title
    Given user is on login page
    Then title should be "HSBC - SSAP"

  Scenario Outline: Validate Email address feild
    Given user is on login page
    When user enters invalid "<emailId>" in Email address
    And user clicks on password field
    Then user should able see "Please enter a valid email address" error message below the Email address text box

    Examples: 
      | emailId |
      | abcd    |

  Scenario: Validate Eye Icon in password field
    Given user is on login page
    When user enters Email address
    And user enters Password 
    And user clicks on eye icon in password field
    Then user should able to see hidden password

 