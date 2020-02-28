package com.dassault.qa.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearch extends Base{

	public static void main(String[] args) throws InterruptedException {
		
		new Base();
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		String searchstring = "Iphone";
		
		driver.findElement(By.name("q")).sendKeys(searchstring);
		
		driver.findElement(By.name("q")).submit();
		
		Thread.sleep(5000);
		
		String actual = driver.findElement(By.xpath("//div[@class='_1xHtJz xufquN']")).getText();
		
		String expected = "Relevance";
		System.out.println(actual);
		
		//String mytitle = actual.substring(searchstring.length()+2, searchstring.length()+2+3);
		
		//System.out.println(mytitle);
		
		if(actual.equals(expected)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
	}

}
