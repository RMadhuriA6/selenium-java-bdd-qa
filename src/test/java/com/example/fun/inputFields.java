package com.example.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class inputFields {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
         try{
             driver.get("https://trytestingthis.netlify.app/");
             List<WebElement> allInputFields = driver.findElements(By.tagName("input"));
            System.out.println("Total number of Inputs: " + allInputFields.size());
            for (WebElement fields : allInputFields){
                System.out.println("Input tag name: " + fields.getTagName() + " --> Input field type: " + fields.getAttribute("type"));
            }
         } finally {
             driver.quit();
         }
    }
}
