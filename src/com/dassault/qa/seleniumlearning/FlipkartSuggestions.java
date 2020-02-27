package com.dassault.qa.seleniumlearning;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlipkartSuggestions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ameya/Tools/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		String searchstring = "Iphone";
		
		driver.findElement(By.name("q")).sendKeys(searchstring);
		
		//Explicit Wait
		WebDriverWait mywait = new WebDriverWait(driver, 10);
		mywait.pollingEvery(1, TimeUnit.SECONDS);
		//mywait.ignoring(ElementNotReachable.exception);
		WebElement lastsuggestion = driver.findElement(By.xpath("//li[@class='_1va75j'][last()]"));
		mywait.until(ExpectedConditions.textToBePresentInElement(lastsuggestion, "iphone"));
		
		
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='_1va75j']"));
		
		for(WebElement suggestion: suggestions) {
			System.out.println(suggestion.getText());
		}
		
	}

}
