package com.dassault.qa.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPromptExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ameya/Tools/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert myalert = driver.switchTo().alert();
		
		myalert.sendKeys("Ameya");
		
		myalert.accept();
		
		//Exception Handling
		try {
			myalert = driver.switchTo().alert();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert no more present");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException i) {
			System.out.println("Thread.sleep exception");
		}
		
		
		String actualmessage = driver.findElement(By.id("demo")).getText();
		String expectedmessage = "Hello Ameya";
		
		if(actualmessage.contains(expectedmessage)) {
			System.out.println("Accepted: Passed");
		} else {
			System.out.println("Failed");
		}
		
	}

}
