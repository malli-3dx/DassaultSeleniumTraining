package com.dassault.qa.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public static ChromeOptions options = new ChromeOptions();
	public static WebDriver driver;
	
	public Base() {
		launchBrowser();
	}
	
	public static void launchBrowser() {
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "/Users/ameya/Tools/Selenium/chromedriver");	
		driver = new ChromeDriver(options);	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	

}
