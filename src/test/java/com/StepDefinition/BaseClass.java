package com.StepDefinition;

import com.Pom.DashboardPage;
import com.Pom.LoginPage;
import com.Utility.ReadConfig;
import com.Utility.WaitHelper;
import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class BaseClass {

    public static WebDriver driver;

    LoginPage loginpage;
    DashboardPage dashboardpage;
    WaitHelper waithelper;
    ReadConfig readconfig;
    public void setup() throws IOException {

        readconfig = new ReadConfig();

        //get the browser name and accordingly open the required browser
        String browser = readconfig.getBrowser();
       switch (browser)
       {
           case "chrome":
               WebDriverManager.chromedriver().setup();

               ChromeOptions options = new ChromeOptions();
               options.addArguments("enable-automation");
//        options.addArguments("--headless");
               options.addArguments("--no-sandbox");
               options.addArguments("--disable-extensions");
               options.addArguments("--dns-prefetch-disable");
               options.addArguments("--disable-gpu");
               options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

               driver = new ChromeDriver(options);
               break;

           case "firefox":
               System.out.print("please setup the firefox browser");
               break;


           case "edge":
               System.out.print("please setup the edge browser");
               break;

           default:
               System.out.print("wrong entry in config.properties for for browseName");
               break;

       }

        driver.manage().window().maximize();

        /*
            after initialise driver do initialize the pom classes and required utilities here

         */
        waithelper = new WaitHelper(driver, 15);
        loginpage = new LoginPage(driver);
        dashboardpage = new DashboardPage(driver);

    }

    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
