package com.luxequality.pages;

import com.luxequality.helpers.Hooks;

public class BasePage extends Hooks {
    /**
     * Open baseUrl
     */
    public void open() {
        driver.navigate().to(baseUrl);
    }

    /**
     * Open page
     */
    public void open(String path) {
        driver.navigate().to(baseUrl + "/" + path);
    }
}
