package com.example.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllButtons {
    public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
        try {
        driver.manage().window().maximize();
        driver.get("https://trytestingthis.netlify.app/");

        List<WebElement> Buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : Buttons) {
            if (button.getText().isEmpty()) {
                System.out.println("No Text");
                } else {
                System.out.println(button.getText());
                }
            }
        } finally {
        driver.quit();
        }
    }
}
