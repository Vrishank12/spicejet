package com.Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_validating {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    String	URL="http://google.com";
	    
driver.get(URL);
	    
	    driver.manage().window().maximize();
	    /*driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    */
		
	 // <a class="gb_e"  href="https://mail.google.com/mail/?tab=wm&amp;ogbl">Gmail</a>		
	 // <a class="gb_e"  href="https://www.google.co.in/">Images</a>
	    
	    //<a class="gb_g" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;
	    //tab=wi&amp;ogbl" target="_top">Images</a>
	 	
	    
	    //<a class="gb_g" data-pid="23" href="https://mail.google.com/mail/?tab=wm&amp;ogbl"
	    //target="_top">Gmail</a>
	    //<a class="gb_g" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi&amp;"
	    //		+ ogbl" target="_top">Images</a>
	 	WebElement imagesElement=driver.findElement(By.className("gb_g"));
	 	imagesElement.click();

	 // if multiple elements on the WebPage have similar properties - then Selenium WebDriver
	 	// will automated the very First Element on the Webpage which it identifies with the
	 // given property - in such cases we should consider a unique property of the Element
	 	// under test to automate

	}
}
