package com.example.fun;

import org.openqa.selenium.WebDriver;

public class TryTestingThisHomePage {
    private final WebDriver driver;
    private final String url = "https://trytestingthis.netlify.app/";

    public TryTestingThisHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }

    public String title() {
        return driver.getTitle();
    }
}
