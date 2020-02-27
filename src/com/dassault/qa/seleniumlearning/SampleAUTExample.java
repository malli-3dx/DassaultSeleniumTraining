package com.dassault.qa.seleniumlearning;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleAUTExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ameya/Tools/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://destinationqa.com/aut-samplepersonalinformationform/");
		
		Select mydropdown = new Select(driver.findElement(By.name("Colors")));
		mydropdown.selectByVisibleText("Blue");
		
		
		List<String> actualResult = new ArrayList<String>();
		List<WebElement> actualoptions = mydropdown.getOptions();
		
		
		for(WebElement option : actualoptions) {
			actualResult.add(option.getText());
			System.out.println(option.getText());
		}
		
		List<String> expectedResult = new ArrayList();
		
		expectedResult.add("Yellow");
		expectedResult.add("Green");
		expectedResult.add("Blue");
		expectedResult.add("Black");
		expectedResult.add("White");
		expectedResult.add("Brown");
		expectedResult.add("Red");
		
		
		if(actualResult.containsAll(expectedResult)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
	}

}
