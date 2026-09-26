package com.example.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPractice {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        try{
            driver.get("https://trytestingthis.netlify.app/");
            WebElement button = driver.findElement(By.className("pop-up-alert"));
            button.click();
            LocatorPractice.watch();
            System.out.println("I clicked a button");
        } finally {
            driver.quit();
        }
    }
}
