package com.Java;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewToursAppl_dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
		driver = new ChromeDriver();
						
						
						
				driver.get(url);

						// Maximizing the Browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				// <a href="mercuryregister.php">REGISTER</a>
				
				WebElement register=driver.findElement(By.linkText("REGISTER"));
				register.click();
				
				// name="country" - Country Element Property
				WebElement country=driver.findElement(By.name("country"));
				
				List<WebElement>countries=country.findElements(By.tagName("option"));
				
				int countries_Count=countries.size();
				System.out.println(" The number of countries are : "+countries_Count);
				
				for(int i=0;i<countries_Count;i++)
				{
					if(countries.get(i).isDisplayed())
					{
						String countryName=countries.get(i).getText();
						System.out.println(countryName);
					}
				}
				
				
				driver.quit();


	}

}
