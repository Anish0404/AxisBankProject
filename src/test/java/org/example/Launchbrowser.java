package org.example;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launchbrowser {
    @Test
    public void chrome() {
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.moneycontrol.com/");

        System.out.println("Title of the web page is"+ driver.getTitle());
        System.out.println("URL of the webpage is "+ driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
    }
}
