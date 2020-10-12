


package com.Java;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;//webdriver is a interface class
		String url="https://www.tsrtconline.in/oprs-web/";
				
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
		driver = new ChromeDriver();
				
		driver.get(url);

				// Maximizing the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// id="searchBtn" - Check Availability Button Property
		WebElement checkAvailabilityButton=driver.findElement(By.id("searchBtn"));
		checkAvailabilityButton.click();
		
		//Thread.sleep(10000);
		
		// Alert is an inerface in Selenium
		org.openqa.selenium.Alert alert= driver.switchTo().alert();
		
		// getting the text message of an alert 
		String alertMessage=alert.getText();
		System.out.println(" The text of an Alert is : "+alertMessage);
				
		// accepting the OK button
		alert.accept();
		
		// accepting the cancel button
		//alert.dismiss();
		
		// sending the Test data into alert	
		// alert.sendKeys("Testing");	
				
	driver.quit();
	
	
	}


}
