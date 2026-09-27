package com.example.tests;

import com.example.fun.TryTestingThisHomePage;
import io.github.rmadhuria6.automation.utils.DriverFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginTest {

    @Test

    public void OpenShettyPage() {

        WebDriver driver = DriverFactory.createChrome(false); // headed mode

        try {
            TryTestingThisHomePage home = new TryTestingThisHomePage(driver);
            home.open();
            assertTrue(home.title().toLowerCase().contains("test"));
            System.out.println(home.title());
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
//        driver.findElement(By.id("inputUsername")).sendKeys("madhuri");
//        driver.findElement(By.name("inputPassword")).sendKeys("learning");
//        driver.findElement(By.className("signInBtn")).click();
        } finally {
            driver.quit();
        }


    }
}
