Feature:login functionality

  Background: Below are the common steps for all the scenarios in this feature file
    Given I have opened the chrome browser and opened the url as "myUrl"


  @smoke
# test login with valid credentials
  Scenario: Test login for application with valid credentials
    When I landed on login page I have provided valid username as "myValidUserName" and valid password as "myValidPassword"
    And I clicked on login button
    Then I logged in successfully, showing page title as "OrangeHRM"
    And I clicked on logout button from dashboard


# test login with invalid credentials
  Scenario: Test login for application with invalid credentials
    When I landed on login page I have provided invalid username as "myInvalidUserName" and invalid password as "myInvalidPassword"
    And I clicked on login button
    Then I got error message

