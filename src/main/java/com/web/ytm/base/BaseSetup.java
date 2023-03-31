package com.web.ytm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSetup {
    public static WebDriver driver;

    public static Properties properties;

    public BaseSetup() {

        try {
            // code logic here
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream("src/main/java/com/web/ytm/config/config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(properties.getProperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
