package com.luxequality.helpers;

import com.luxequality.pages.LoginPage;
import com.luxequality.pages.InventoryPage;

public class PageInitializer {
    public LoginPage loginPage;
    public InventoryPage inventoryPage;

    /**
     * Initialize pages
     */
    public void initializer() {
        loginPage = new LoginPage();
        inventoryPage = new InventoryPage();
    }
}