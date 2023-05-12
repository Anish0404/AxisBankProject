package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxtestNg {
    @Test
    public void firefox() {
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.33.0-win32");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.moneycontrol.com/");

        System.out.println("Title of the web page is"+ driver.getTitle());
        System.out.println("URL of the webpage is "+ driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
    }
}
