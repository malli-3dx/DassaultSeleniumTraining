package com.dassault.qa.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffPopUpAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ameya/Tools/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com");
		
		driver.findElement(By.linkText("Rediffmail")).click();
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(3000);
		
		Alert myalert = driver.switchTo().alert();
		
		String actualmessage = myalert.getText();
		
		String expectedmessage = "Please enter a valid user name";
		
		if(actualmessage.contains(expectedmessage)) {
			System.out.println("Alert captured");
			myalert.accept();
		} else {
			System.out.println("No Alert seen");
		}
		
	}

}
