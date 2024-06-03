package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PIMpage {

    WebDriver ldriver;
    public PIMpage(WebDriver driver)
    {
        ldriver=driver;
        PageFactory.initElements(ldriver,this);

    }



}
