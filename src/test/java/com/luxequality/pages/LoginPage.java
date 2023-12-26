package com.luxequality.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    // =============
    // Locators
    // =============
    public WebElement inputUsername() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement inputPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement btnLogin() {
        return driver.findElement(By.id("login-button"));
    }

    // =============
    // Methods
    // =============

    /**
     * Open login page
     */
    public void open() {
        super.open();
    }

    /**
     * Log in
     */
    public void login(String username, String password) {
        inputUsername().sendKeys(username);
        inputPassword().sendKeys(password);
        btnLogin().click();
    }
}
