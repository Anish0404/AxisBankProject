package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxlaunch {

            public static void main(String[] args) {
                System.setProperty("Webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.33.0-win32");
                WebDriver driver = new FirefoxDriver();
                driver.get("https://www.facebook.com/login/");

                System.out.println("Title of the web page is"+ driver.getTitle());
                System.out.println("URL of the webpage is "+ driver.getCurrentUrl());
                System.out.println(driver.getPageSource());
            }

        }


