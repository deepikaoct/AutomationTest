package com.E2E.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\deepi\\my-E2E\\src\\test\\java\\data.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String browsername = pro.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		return driver;
	}
}
