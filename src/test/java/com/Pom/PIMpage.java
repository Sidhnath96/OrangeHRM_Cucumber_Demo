package com.Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMpage {

    WebDriver ldriver;

    public PIMpage(WebDriver driver) {
        ldriver = driver;
        PageFactory.initElements(ldriver, this);

    }

    /**
     * Elements from add employee page
     */

    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[2]")
    public WebElement pimbutton;

    @FindBy(xpath = "//div[@class='oxd-topbar-body']//a[contains(text(),'Employee List')]")
    public WebElement employeelistbtn;

    @FindBy(xpath = "//div[@class='oxd-topbar-body']//a[contains(text(),'Add Employee')]")
    public WebElement addemployeebtn;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstnametxtbox;


    @FindBy(xpath = "//input[@name='lastName']")
   public  WebElement lastnametxtbox;

    @FindBy(xpath = "//div[@class='orangehrm-employee-form']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div/input")
    public WebElement empidtxtbox;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement savebtn;

    /**
     * Elements from personal details page
     */

    @FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    public WebElement nationalitydrpdown;

    @FindBy(xpath = "//label[normalize-space()='Male']")
    public WebElement maleradiobtn;


    /**
     * methods for performing action on given elements on this page
     */
    public void clickNationalitydrpDwn()
    {
        nationalitydrpdown.click();

    }

    public void clickPIMbutton()
    {
        pimbutton.click();

    }

}



