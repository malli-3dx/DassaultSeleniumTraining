package com.dassault.qa.seleniumlearning;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrginizedFacebookWindows extends Base{

	public static void main(String[] args) {

		new Base();
		
		//Main Navigation
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
		
		
		//Test Case 1
		driver.switchTo().window(termswindow);
		
		String expectedTerms = "Terms of Service";
		
		String actualTerms = driver.findElement(By.tagName("h2")).getText();
		
		if(actualTerms.equals(expectedTerms)) {
			System.out.println("Test Case 1: Passed");
		} else {
			System.out.println("Failed" + "Actual text is: "+actualTerms);
		}
		
		driver.close();
		
		
		//Test Case 2
		driver.switchTo().window(datawindow);
		
		if(driver.findElement(By.tagName("h2")).getText().contains("Data")) {
			System.out.println("Test Case 1: Passed");
		} else {
			System.out.println("Failed");
		}
		
		driver.close();
		
		
		//Test Case 3
		driver.switchTo().window(cookiewindow);
		
		if(driver.findElement(By.tagName("h2")).getText().contains("Cookie")) {
			System.out.println("Test Case 1: Passed");
		} else {
			System.out.println("Failed");
		}
		
		driver.close();
	}

}
