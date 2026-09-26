package com.example.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EvDbuttons {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        try{
            driver.manage().window().maximize();
            driver.get("https://trytestingthis.netlify.app/");

            List<WebElement> buttons = driver.findElements(By.tagName("button"));
            for(WebElement button : buttons){
                System.out.print("Button: " + button.getText());
                System.out.println(" | Enabled: " + button.isEnabled());
            }
        } finally {
            driver.quit();
        }
    }
}
