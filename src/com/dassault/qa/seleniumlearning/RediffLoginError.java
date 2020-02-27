package com.dassault.qa.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLoginError {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ameya/Tools/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com");
		
		driver.findElement(By.linkText("Rediffmail")).click();
		
		driver.findElement(By.id("login1")).sendKeys("ameya");
		
		driver.findElement(By.id("password")).sendKeys("abcd");
		
		Boolean remembercheckboxstatus = driver.findElement(By.id("remember")).isSelected();
		
		if(remembercheckboxstatus == true) {
			driver.findElement(By.id("remember")).click();
		}
		
		driver.findElement(By.name("proceed")).click();
		
		//driver.findElement(By.id("login1")).submit();
		
		String expected = "Wrong username and password combination.";
		
		String actual = driver.findElement(By.className("div_login_error")).getText();
		
		if(actual.equals(expected)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		
		
	}

}
