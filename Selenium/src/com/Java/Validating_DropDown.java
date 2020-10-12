package com.Java;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_DropDown {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://my.monsterindia.com/sponsered_popup.html";
				
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
				
		driver.get(url);

				// Maximizing the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// identifying the dropDown "current location"
		// class="border_grey1" - property of Current location
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));

		// finding all Elements in the DropDown - Current Location - using "option" tag
List<WebElement>currentLocationElements=currentLocation.findElements(By.tagName("option"));
		
		int currentLocationElements_Count=currentLocationElements.size();
		
		
		
		System.out.println(" The number of elements in the current location dropDown are : "+currentLocationElements_Count);
		
		for(int i=0;i<currentLocationElements_Count;i++)
		{
			String currentLocationElementName=currentLocationElements.get(i).getText();
			System.out.println(currentLocationElementName);
		}

		driver.quit();
}}