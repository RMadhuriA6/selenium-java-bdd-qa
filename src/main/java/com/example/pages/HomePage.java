package com.example.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private final String url = "https://trytestingthis.netlify.app/";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }

    public String title() {
        return driver.getTitle();
    }
}
