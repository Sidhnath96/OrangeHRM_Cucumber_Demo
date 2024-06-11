package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;
    public LoginPage(WebDriver driver)
    {
        ldriver = driver;

        PageFactory.initElements(ldriver,this);
    }

    @FindBy(name="username")
   public  WebElement username_textbox;


    @FindBy(xpath="//input[@placeholder='Password']")
    public WebElement password_textbox;

    @FindBy(xpath="//button[@type='submit']")
    WebElement login_btn;

    @FindBy(xpath="//div[@class='oxd-alert oxd-alert--error' and @role='alert']//p")
    public WebElement alermsg;


    /*
    Action methods for above elelemnts

     */

    public void setUserName(String uname)
    {
        username_textbox.sendKeys(uname);
    }

    public void setPassword(String pass)
    {
        password_textbox.sendKeys(pass);
    }

    public void clickLogin()
    {
        login_btn.click();
    }


    public void doLogIn(String uname, String pass)
    {
        setUserName(uname);
        setPassword(pass);
        clickLogin();
    }

}
