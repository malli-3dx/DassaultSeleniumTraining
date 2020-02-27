package com.dassault.qa.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CleatTripExample {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "/Users/ameya/Tools/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com");
		
		driver.findElement(By.id("RoundTrip")).click();
		
		driver.findElement(By.id("FromTag")).sendKeys("Pune");
		
		driver.findElement(By.id("ToTag")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("(//a[@class='calendarIcon']/i)[1]")).click();
		
		driver.findElement(By.xpath("//td[@data-month='1']/a[text()='28']")).click();
		
		driver.findElement(By.xpath("(//a[@class='calendarIcon']/i)[2]")).click();
		driver.findElement(By.xpath("//td[@data-month='1']/a[text()='29']")).click();
		
		//driver.findElement(By.name("adults")).click();
		//Thread.sleep(2000);
		
		WebElement adultsdropdown = driver.findElement(By.name("adults"));
		
		Select mydropdown = new Select(adultsdropdown);
		
		mydropdown.selectByVisibleText("2");
		
		
		//driver.findElement(By.xpath("//select[@name='adults']/option[@value='2']")).click();
		
		//*[@id="Adults"]/option[2]
		
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.className("totalAmount")).getText());
		
	}

}
