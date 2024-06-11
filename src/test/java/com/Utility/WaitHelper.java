package com.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.StepDefinition.BaseClass.driver;

public class WaitHelper {

    WebDriverWait wait;
    JavascriptExecutor js;
    public WaitHelper(WebDriver driver, long time) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));

    }


    public void waitForElementToBeVisible(WebElement ele) {
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

    public void waitForElementToBeClickable(WebElement ele) {
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }

    public void scrollToView(WebElement ele)
    {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", ele);
    }


}
