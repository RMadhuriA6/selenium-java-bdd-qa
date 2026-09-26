package com.example.fun;


import hooks.Hooks;
import org.openqa.selenium.WebDriver;

public abstract class Page {

    WebDriver driver;

    public Page( WebDriver driver){
        this.driver = driver;
    }

}
