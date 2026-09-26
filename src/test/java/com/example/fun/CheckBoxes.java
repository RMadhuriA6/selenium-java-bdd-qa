package com.example.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        try{
            driver.manage().window().maximize();
            driver.get("https://trytestingthis.netlify.app/");
            List<WebElement> inputFields = driver.findElements(By.tagName("input"));
            for (WebElement checkBox : inputFields){
                if (checkBox.getAttribute("type").equals("checkbox") && !checkBox.isSelected()){
                    checkBox.click();
                    System.out.println("Selected checkbox: " + checkBox.getAttribute("name"));

                }
            }
        } finally {
            driver.quit();
        }
    }
}
