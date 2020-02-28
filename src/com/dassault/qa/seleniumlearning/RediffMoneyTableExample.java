package com.dassault.qa.seleniumlearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMoneyTableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ameya/Tools/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com");
		
		driver.findElement(By.linkText("Gainers / Losers")).click();
		
		WebElement table =  driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		List<WebElement> rows = table.findElements(By.xpath("./tbody/tr"));
		
		//List<String> currentpricestrings = table.findElements(By.xpath("./tbody/tr/td[3]")));
		
		
		for(WebElement r : rows) {
			
			List<WebElement> columns = r.findElements(By.tagName("td"));
			
			String pricestring = columns.get(3).getText();
			
			pricestring=pricestring.replace(",", "");
			Double pricedouble = Double.parseDouble(pricestring);
			
			if(pricedouble <=1000.00) {
				System.out.print(columns.get(0).getText()+" : ");
				System.out.println(columns.get(3).getText());
			}
				
		}
		
		
	}

}
