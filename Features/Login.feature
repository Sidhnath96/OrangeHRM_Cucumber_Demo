Feature:login functionality

  Background: Below are the common steps for all the scenarios in this feature file
    Given I have opened the chrome browser and opened the url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


  @smoke
# test login with valid credentials
  Scenario: Test login for application with valid credentials
    When I landed in login page I have provided username as "Admin" and password as "admin123"
    And I clicked on login button
    Then I logged in successfully, showing page title as "OrangeHRM"
    And I clicked on logout button from dashboard


# test login with invalid credentials
  Scenario: Test login for application with invalid credentials
    When I landed in login page I have provided username as "Admin1" and password as "admin123"
    And I clicked on login button
    Then I got error message

