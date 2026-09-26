package com.example.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
    public HomePage(WebDriver driver){
        super(driver);
    }

    public String HomePageHeader(){
        return driver.findElement(By.xpath("//h1[text()='Protractor Tutorial']")).getText();
    }
}
