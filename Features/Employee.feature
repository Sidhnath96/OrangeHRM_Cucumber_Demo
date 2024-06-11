# This feature file will contains scenarios related to employee like
#  @add_multiple_employee
#  @search_employee
#  @delete_employee
#  @update_employee_profile

Feature: Add new Employee into the system

  Background: following steps are common for scenarios in this feature file
    Given I logged into the system as i clicked on PIM option from left pannel, it opened PIM page
    
@implemented
  Scenario: Add the new employee into the system and verify its added successfully
    When I clicked on Add Employee button and I provided first name an lastname along with emplyee id
    And As i clicked on save button i can see employee details page
    Then On employee details page i added the personal details,contact details, emenrgency contact, dependents information and click save button for each section
    And again i clicked on Add Employee button


  Scenario: Search employee by Employee id
    When I clicked on Employee list button
    And entered the employee id  and clicked search button
    Then I found the employee entry into the table and then i clicked in Reset button


  Scenario: Search employee by Employee name
    When I clicked on Employee list button
    And entered the employee name and clicked search button
    Then I found the employee entry into the table
    Then I found the employee entry into the table and then i clicked in Reset button


















