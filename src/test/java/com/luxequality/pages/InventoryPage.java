package com.luxequality.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.luxequality.constants.Endpoints;

public class InventoryPage extends BasePage {
    public static final String endpoint = Endpoints.inventoryPage;

    // =============
    // Locators
    // =============

    public WebElement btnExtendSidebarMenu() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }

    // =============
    // Methods
    // =============

    /**
     * Open inventory page
     */
    public void open() {
        super.open(endpoint);
    }
}
