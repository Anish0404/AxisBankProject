package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //navigation to URL
        driver.navigate().to("https://www.facebook.com/login/");

        //navigate backword in browser history
        driver.navigate().back();

        //refresh page
        driver.navigate().refresh();

        //navigate to forward
        driver.navigate().forward();
    }
}
