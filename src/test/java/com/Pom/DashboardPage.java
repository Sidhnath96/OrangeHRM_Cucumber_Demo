package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    WebDriver ldriver;
    public DashboardPage(WebDriver driver)
    {
        ldriver=driver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(className = "oxd-userdropdown-tab")
   public  WebElement profile_dropdown;

    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li//a[@role='menuitem'][text()='Logout']")
    public WebElement logout_btn;



    /*
    Action methods for above elelemnts

     */

    public void clickProfileOnDashboard()
    {
        profile_dropdown.click();
    }

   public void clickLogoutbtn()
    {
        logout_btn.click();

    }
}
