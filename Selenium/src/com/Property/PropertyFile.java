package com.Property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFile {
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = null;
		
		//how to read property file
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C://Users//hp//workspace//Selenium//config.properties");
		
		prop.load(file);
		
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		
		
		
		String browserName= prop.getProperty("browser");
		
		
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
			      driver= new ChromeDriver();
			     
		}else if(browserName.equals("FF"))
		{
			driver = new FirefoxDriver();
			
		}
		
		
		
		driver.get(prop.getProperty("url"));
		   driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		     
//		
//		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"));
//		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
//		driver.findElement(By.id("btnLogin")).click();
//		
		
		
		driver.findElement(By.id(prop.getProperty("username_id"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id(prop.getProperty("login_btn"))).click();
		
		Thread.sleep(10000);
		
		driver.quit();
		
}
	

}
