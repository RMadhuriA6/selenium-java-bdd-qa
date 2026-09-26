package com.example.fun;

import com.example.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {
public static void watch(){
    // To watch what's happening, because it moves too fast
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        try {
            String url = "https://trytestingthis.netlify.app/";
            driver.get(url);
            driver.manage().window().fullscreen();
            WebElement textBox = driver.findElement(By.id("fname"));
            textBox.sendKeys("Selenium Test");
            LocatorPractice.watch();
            textBox.clear();
            LocatorPractice.watch();
            textBox.sendKeys("Selenium Test");
            LocatorPractice.watch();

        } finally {
            driver.quit();
        }
    }
}