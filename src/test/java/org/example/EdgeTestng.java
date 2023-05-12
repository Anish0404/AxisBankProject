package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeTestng {
    @Test
    public void edge() {
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\edgedriver_win64");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.moneycontrol.com/");

        System.out.println("Title of the web page is"+ driver.getTitle());
        System.out.println("URL of the webpage is "+ driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
    }
}
