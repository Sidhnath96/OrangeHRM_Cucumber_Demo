package com.StepDefinition;

import com.Pom.DashboardPage;
import com.Pom.LoginPage;
import com.Pom.PIMpage;
import com.Utility.ReadConfig;
import com.Utility.WaitHelper;
import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BaseClass {

    public static WebDriver driver;

    public static LoginPage loginpage;
    public static DashboardPage dashboardpage;
    public static WaitHelper waithelper;
    public static ReadConfig readconfig;
    public static PIMpage pimpage;
    @Before
    public void setup() throws IOException {

        /**
         * I have configured the required properties here using ReadConfig class
         * simply call the method using BaseClass reference
         */
        readconfig = new ReadConfig();


        String browser = readconfig.getBrowser();
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();

                ChromeOptions options = new ChromeOptions();
                options.addArguments("enable-automation");
//              options.addArguments("--headless");
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
                System.out.print("wrong entry in config.properties for browseName");
                break;

        }

        driver.manage().window().maximize();


        /*
            after initialise driver do initialize the pom classes and required utilities here

         */
        waithelper = new WaitHelper(driver, 15);
        loginpage = new LoginPage(driver);
        dashboardpage = new DashboardPage(driver);
        pimpage = new PIMpage(driver);


    }


    @After(order = 1)
    public void takesScreenshot(@org.jetbrains.annotations.NotNull Scenario scenario) {
        /**
         * This method will use the scenario object and based on status of scenario we will capture the shot
         */

        if (scenario.isFailed()) {
            // Create a timestamp
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());

            // Define the file name with timestamp
            String fileName = scenario.getName().replace(" ", "_") + timeStamp + ".png";

                      // Define the file path
            File filePath = new File("./Screenshots", fileName);

            // Take the screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            File srcFile = ts.getScreenshotAs(OutputType.FILE);

            try {
                // Save the screenshot
                FileHandler.copy(srcFile, filePath);
                System.out.println("Screenshot saved as " + filePath.getAbsolutePath());
            } catch (IOException e) {
                System.err.println("Error saving the screenshot: " + e.getMessage());


            }


        }


    }


//    @After(order = 0)
    public void tearDown () {
        if (driver != null)
            driver.quit();
    }



}
