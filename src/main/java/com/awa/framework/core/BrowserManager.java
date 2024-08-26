package com.awa.framework.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {

    private OptionManager options = new OptionManager();
    private static WebDriver driver;

    // Method to start the browser based on the specified browser name
    public WebDriver startBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            // Setting up WebDriver for Chrome
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options.getChromeOptions());
        } else if (browserName.equalsIgnoreCase("edge")) {
            // Setting up WebDriver for Edge
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver(options.getEdgeOptions());
        } else {
            throw new IllegalArgumentException("Browser " + browserName + " is not supported");
        }

        System.out.println(browserName + " Browser Started");
        return driver;
    }

    // Method to quit the browser
    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser Closed");
        } else {
            System.out.println("No browser session to quit");
        }
    }
}
