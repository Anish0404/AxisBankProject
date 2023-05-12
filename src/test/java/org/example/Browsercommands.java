package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommands {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");

        //maximize the window
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();
    }
}
