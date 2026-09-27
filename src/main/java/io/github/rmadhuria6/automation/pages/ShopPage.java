package io.github.rmadhuria6.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopPage extends Page{

    public ShopPage(WebDriver driver){
        super(driver);
    }
    public String ShopPageTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Boolean pageURL = wait.until(ExpectedConditions.urlContains("shop"));
        WebElement pageTitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Shop Name']")));
        return pageTitle.getText();
    }

    public HomePage GoHome(){
        driver.findElement(By.xpath("//a[text()='Home']")).click();
        return new HomePage(driver);
    }
}
