package com.luxequality.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luxequality.constants.Endpoints;
import com.luxequality.constants.TestUsers;
import com.luxequality.helpers.Hooks;

public class Login extends Hooks {

    @Test
    public void LoginToWebsite() {
        // open the Login page
        loginPage.open();

        // enter a valid username and password and click the Login button
        loginPage.login(TestUsers.standardUser, TestUsers.password);

        // wait for the sidebar of the Inventory page,
        // which means that we have successfully logged in
        waitForVisibility(inventoryPage.btnExtendSidebarMenu());

        // verify that the URL is correct
        Assert.assertEquals(driver.getCurrentUrl(), baseUrl + "/" + Endpoints.inventoryPage);
    }
}
