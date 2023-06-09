package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class HelperClass {protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

    public static String remote_url = "http://localhost:4444";



    @BeforeMethod

    public void setDriver() throws MalformedURLException {



        ChromeOptions options = new ChromeOptions();

        driver.set(new RemoteWebDriver(new URL(remote_url), options));

        driver.get().get("https://opensource-demo.orangehrmlive.com/");

        driver.get().manage().window().maximize();



    }



    public WebDriver getDriver() {

        return driver.get();

    }



    @AfterMethod

    public  void closeBrowser() {

        driver.get().quit();

        driver.remove();

    }
}
