package com.example.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssVsXpathPractice {
    public static void watch(){
        // To watch what's happening, because it moves too fast
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        try{
            driver.manage().window().maximize();
            driver.get("https://trytestingthis.netlify.app/");
            WebElement fNameCss = driver.findElement(By.cssSelector("#fname"));// Using id value
            fNameCss.sendKeys("Happy");
            watch();
            fNameCss.clear();
            WebElement fNameXpath = driver.findElement(By.xpath("//input[@id='fname']"));
            fNameXpath.sendKeys("Madhuri");
            watch();
        } finally {
            driver.quit();
        }
    }
}
