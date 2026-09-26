package com.example.fun;

//import static hooks.Hooks;
import static hooks.Hooks.driver;

import hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class LoginPage extends Page {
    public LoginPage(WebDriver driver) {
        super(driver);

    }
    public void openPage(String url){
        driver.manage().window().maximize();
        driver.get(url);
    }
    public Page loginWith(String user, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("username")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("signInBtn")).click();

        wait.until(ExpectedConditions.or(
                ExpectedConditions.urlContains("shop"),
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'Incorrect')]")),
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'Empty')]"))));

        if (Objects.requireNonNull(driver.getCurrentUrl()).contains("https://rahulshettyacademy.com/loginpagePractise/")){
            return this;
        }  else if (Objects.requireNonNull(driver.getCurrentUrl()).contains("shop")){
            return new ShopPage(driver);
        } else {
            throw new IllegalStateException("Unexpected login outcome");
        }
    }
    public String readErrorMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessageText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),' username/password.')]")));
        return errorMessageText.getText();
    }

}
