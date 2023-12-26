package com.luxequality.helpers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hooks extends CommonMethods {

    @BeforeClass
    public void setup() {
        exe();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
