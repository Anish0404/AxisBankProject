package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeLogin extends HelperClass{
    @Test
    public void Login(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("\"https://opensource-demo.orangehrmlive.com/");

        WebElement UserName = getDriver().findElement(By.xpath("//input[@name='username']"));
        UserName.sendKeys("Admin");
        WebElement Password = getDriver().findElement(By.xpath("//input[@type='password']"));
        Password.sendKeys("admin123");
        WebElement Login = getDriver().findElement(By.xpath("//button[@type='submit']"));
        Login.click();

    }
}
