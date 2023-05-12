package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Edgebrowser {
    public static void main(String[] args) {
        System.setProperty("Webdriver.edge.driver","C:\\Users\\Admin\\Downloads\\edgedriver_win64");
        WebDriver driver = new EdgeDriver();
        driver.get("https://economictimes.indiatimes.com/?from=mdr");

        System.out.println("Title of the web page is"+ driver.getTitle());
        System.out.println("URL of the webpage is "+ driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
    }
}
