package com.Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperations_FacebookAppl {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://facebook.com";
				
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
				
		driver.get(url);

				// Maximizing the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("srini@gmail.com");
		
		Actions actions = new Actions(driver);
		
		// Performing KeyBoard related Key operation - TAB 
		actions.sendKeys(Keys.TAB).perform();
		
// Automating Password Element - without identifying the Properties of the Password element
			actions.sendKeys("Testing").perform();
	
// Automating LogIn Element - Without identifying the LogIn Button Properties- using "ENTER"
			// key of the KeyBoard
		actions.sendKeys(Keys.ENTER).perform();


	}

}
