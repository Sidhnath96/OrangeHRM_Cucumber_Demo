package com.StepDefinition;

import com.Pom.LoginPage;
import io.cucumber.java.en.*;

import java.io.IOException;

public class CreateEmployeeSteps {

    private LoginSteps logstpes = new LoginSteps();

    /**
     * steps for create new employee
     */
    @Given("I logged into the system as i clicked on PIM option from left pannel, it opened PIM page")
    public void i_logged_into_the_system_as_i_clicked_on_pim_option_from_left_pannel_it_opened_pim_page() throws IOException {
        logstpes.i_have_opened_the_chrome_browser_and_opened_the_url_as(BaseClass.readconfig.getURL());
        logstpes.i_landed_on_login_page_i_have_provided_username_as_and_password_as(BaseClass.readconfig.getValidUserName(), BaseClass.readconfig.getValidPassword());
        logstpes.i_clicked_on_login_button();

        BaseClass.waithelper.waitForElementToBeClickable(BaseClass.pimpage.pimbutton);
        BaseClass.pimpage.clickPIMbutton();

    }

    @When("I clicked on Add Employee button and I provided first name an lastname along with emplyee id")
    public void i_clicked_on_add_employee_button_and_i_provided_first_name_an_lastname_along_with_emplyee_id() {

        BaseClass.waithelper.waitForElementToBeClickable(BaseClass.pimpage.addemployeebtn);
        BaseClass.pimpage.addemployeebtn.click();

        BaseClass.waithelper.waitForElementToBeClickable(BaseClass.pimpage.firstnametxtbox);
        BaseClass.pimpage.firstnametxtbox.sendKeys("baburao");

        BaseClass.pimpage.lastnametxtbox.sendKeys("apate");

    }

    @When("As i clicked on save button i can see employee details page")
    public void as_i_clicked_on_save_button_i_can_see_employee_details_page() {

        BaseClass.pimpage.savebtn.click();

    }

    @Then("On employee details page i added the personal details,contact details, emenrgency contact, dependents information and click save button for each section")
    public void on_employee_details_page_i_added_the_personal_details_contact_details_emenrgency_contact_dependents_information_and_click_save_button_for_each_section() {


        BaseClass.waithelper.waitForElementToBeVisible(BaseClass.pimpage.nationalitydrpdown);
        BaseClass.waithelper.scrollToView(BaseClass.pimpage.nationalitydrpdown);

        BaseClass.pimpage.clickNationalitydrpDwn();
    }

    @Then("again i clicked on Add Employee button")
    public void again_i_clicked_on_Add_Employee_button() {

    }

    /**
     * steps for Search employee by Employee id
     */


    @When("I clicked on Employee list button")
    public void i_clicked_on_employee_list_button() {

    }

    @When("entered the employee id  and clicked search button")
    public void entered_the_employee_id_and_clicked_search_button() {

    }

    @Then("I found the employee entry into the table and then i clicked in Reset button")
    public void i_found_the_employee_entry_into_the_table_and_then_i_clicked_in_reset_button() {

    }


    /**
     * steps for Search employee by Employee name
     */

    @When("entered the employee name and clicked search button")
    public void entered_the_employee_name_and_clicked_search_button() {

    }

    @Then("I found the employee entry into the table")
    public void i_found_the_employee_entry_into_the_table() {

    }


}
