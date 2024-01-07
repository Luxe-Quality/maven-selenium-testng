package com.luxequality.helpers;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods extends PageInitializer {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Logger logger = Logger.getLogger(CommonMethods.class.getName());
    public static Properties properties = new Properties();
    public static final String baseUrl = System.getProperty("BASE_URL");

    public void exe() {
        // load a properties file
        try {
            properties.load(CommonMethods.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // set up chrome options
        ChromeOptions chromeOptions = new ChromeOptions();
        if (Boolean.parseBoolean(properties.getProperty("browser.headless")))
            chromeOptions.addArguments("--headless=new");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--window-size=1920,1080");

        // start Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);

        // set up WebDriverWait
        wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(properties.getProperty("timeout.wait"))));

        // set up implicitlyWait. This is a timeout for waiting elements
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(Integer.parseInt(properties.getProperty("timeout.implicitly"))));

        // initialize page instances
        initializer();
    }

    /**
     * Wait for the element to become visible. Uses isDisplayed() method of the
     * element. Throws an error if element
     * 
     * @param element - element to wait
     */
    public void waitForVisibility(WebElement element) {
        wait.until(d -> element.isDisplayed());
    }
}
