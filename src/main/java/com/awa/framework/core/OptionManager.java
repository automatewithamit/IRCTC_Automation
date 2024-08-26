package com.awa.framework.core;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class OptionManager {

    // Method to return ChromeOptions
    public ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Example argument to start Chrome maximized
        // Add more Chrome options as needed
        return options;
    }

    // Method to return EdgeOptions
    public EdgeOptions getEdgeOptions() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized"); // Example argument to start Edge maximized
        // Add more Edge options as needed
        return options;
    }
}
