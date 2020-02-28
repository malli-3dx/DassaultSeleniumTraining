package com.dassault.qa.seleniumlearning;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookWindows {

	public static void main(String[] args) {

ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "/Users/ameya/Tools/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.linkText("Data Policy")).click();
		driver.findElement(By.linkText("Cookie Policy")).click();
		
		String mainwindow = driver.getWindowHandle();
		
		String termswindow = null, cookiewindow=null, datawindow=null;
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String h : handles) {
			driver.switchTo().window(h);
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().contains("Terms")) {
				 termswindow = h;
			}
			
			if(driver.getTitle().contains("Cookie")) {
				 cookiewindow = h;
			}
			
			if(driver.getTitle().contains("Data")) {
				 datawindow = h;
			}
			
		}
		
		driver.switchTo().window(termswindow);
		
		String expectedTerms = "Terms of Service";
		
		String actualTerms = driver.findElement(By.tagName("h2")).getText();
		
		if(actualTerms.equals(expectedTerms)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed" + "Actual text is: "+actualTerms);
		}
		
		driver.close();
		
		driver.switchTo().window(datawindow);
		
		if(driver.findElement(By.tagName("h2")).getText().contains("Data")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		driver.close();
		
		driver.switchTo().window(cookiewindow);
		
		if(driver.findElement(By.tagName("h2")).getText().contains("Cookie")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		driver.close();
	}

}
