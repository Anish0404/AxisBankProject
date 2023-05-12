package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class RegistrationPageTask {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Anish");

        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Mandhare");

        WebElement phoneNo = driver.findElement(By.name("phone"));
        phoneNo.sendKeys("7738443024");

        WebElement email = driver.findElement(By.id("userName"));
        email.sendKeys("anishmandhare7738@gmail.com");

        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("Navi Mumbai,maharashtra");

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Thane");

        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("Maharashtra");

        WebElement PostalCode = driver.findElement(By.name("postalCode"));
        PostalCode.sendKeys("400708");

        WebElement country = driver.findElement(By.name("country"));
        Select countryDropdown = new Select(country);
        countryDropdown.selectByVisibleText("ALBANIA");

        WebElement UserName = driver.findElement(By.id("email"));
        UserName.sendKeys("anish0404");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("anish@8373");

        WebElement ConfirmPassword = driver.findElement(By.name("confirmPassword"));
        ConfirmPassword.sendKeys("anish@8373");

        WebElement Submit = driver.findElement(By.name("submit"));
        Submit.click();

        String expectedTitle = "Register: Mercury Tours";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Registration failed.");
        } else {
            System.out.println("Registration successful.");
        }



        // Close the browser
        driver.quit();

    }
}
