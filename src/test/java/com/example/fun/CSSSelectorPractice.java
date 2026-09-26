package com.example.fun;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import java.util.List;
import java.util.Set;

public class CSSSelectorPractice {

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
                    driver.manage().window().maximize();
                    driver.get("https://trytestingthis.netlify.app/");

                    driver.findElement(By.cssSelector("#fname")).sendKeys("Happy");// Using id value
                    watch();
                    driver.findElement(By.cssSelector(".pop-up-alert")).click(); // Using class name
                    driver.switchTo().alert().accept();

                    List<WebElement> labels = driver.findElements(By.cssSelector("label")); // Using tag name
                    for (WebElement label : labels) System.out.println("Label: " + label.getText());
                    List<WebElement> radioBtns = driver.findElements(By.cssSelector("[type = 'radio']"));// Using attribute
                    for (WebElement btn: radioBtns) System.out.println("Radio Buttons: " + btn.getText());
                    List<WebElement> options = driver.findElements(By.cssSelector("input option"));// Using Descendent
                    for (WebElement option : options) System.out.println("Options: " + option.getAttribute("value"));
                    List<WebElement> datalist = driver.findElements(By.cssSelector("datalist > option"));// Using DirectChild
                    for (WebElement data : datalist) System.out.println("DataList values: " + data.getAttribute("value"));
//                    driver.findElement(By.cssSelector(("h6 + button")).click());// Using Adjacent Sibling
                    WebElement opt = driver.findElement(By.cssSelector("datalist option:nth-child(4)"));// Using nth Child
                    opt.click();
                    System.out.println("Clicked " + opt.getText());

            } finally {
                    driver.quit();
            }
        }
    }