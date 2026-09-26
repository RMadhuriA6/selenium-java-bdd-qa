package com.example.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Locators {
    private WebDriver driver;
    public Locators(WebDriver driver) {
        this.driver = driver;
    }
    public void enterfName(String fn){
    driver.findElement(By.id("fname")).sendKeys(fn);
    }

    public String readfName(){
        return driver.findElement(By.id("fname")).getDomProperty("value");
    }

    public void clearfName(){
        driver.findElement(By.id("fname")).clear();
    }

    public void selectGender(String gender){
        driver.findElement(By.id(gender)).click();
    }

    public String selectedGender(){
        if(driver.findElement(By.id("female")).isSelected()) {
            return driver.findElement(By.cssSelector("input#female+label")).getText();
        }else if(driver.findElement(By.id("male")).isSelected()){
            return driver.findElement(By.cssSelector("input#male+label")).getText();
        }else if(driver.findElement(By.id("other")).isSelected()){
           return driver.findElement(By.cssSelector("input#other+label")).getText();
        }else{
            return "Not Selected";
        }
    }

}
