package com.StepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;

import java.io.IOException;

public class LoginSteps {

    BaseClass baseclass = new BaseClass();


    @Given("I have opened the chrome browser and opened the url as {string}")
    public void i_have_opened_the_chrome_browser_and_opened_the_url_as(String url) throws IOException {
        baseclass.setup();
        BaseClass.driver.get(url);
    }

    @When("I landed in login page I have provided username as {string} and password as {string}")
    public void i_landed_in_login_page_i_have_provided_username_as_and_password_as(String uname, String pass) {
        baseclass.waithelper.waitForElementToBeVisible(baseclass.loginpage.username_textbox);
        baseclass.loginpage.setUserName(uname);

        baseclass.waithelper.waitForElementToBeVisible(baseclass.loginpage.password_textbox);
        baseclass.loginpage.setPassword(pass);
    }

    @When("I clicked on login button")
    public void i_clicked_on_login_button() {
        baseclass.loginpage.clickLogin();
    }

    @Then("I logged in successfully, showing page title as {string}")
    public void i_logged_in_successfully_showing_page_title_as(String exptitle) {
        Assert.assertEquals(exptitle, BaseClass.driver.getTitle());

    }

    @Then("I clicked on logout button from dashboard")
    public void i_clicked_on_logout_button_from_dashboard() {
        baseclass.waithelper.waitForElementToBeClickable(baseclass.dashboardpage.profile_dropdown);
        baseclass.dashboardpage.clickProfileOnDashboard();

        baseclass.waithelper.waitForElementToBeVisible(baseclass.dashboardpage.logout_btn);
        baseclass.dashboardpage.clickLogoutbtn();

        /*
         I called this method to validate whether i navigate to loginpage

         */
        LoginSteps loginsteps = new LoginSteps();
        loginsteps.i_logged_in_successfully_showing_page_title_as("OrangeHRM");

        baseclass.tearDown();

    }

    @Then("I got error message")
    public void i_got_error_message() {

        baseclass.waithelper.waitForElementToBeVisible(baseclass.loginpage.alermsg);
        boolean flag = baseclass.loginpage.alermsg.isDisplayed();
        Assert.assertTrue(flag);
        baseclass.tearDown();
    }


}
