package com.Java;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    String	URL="http://www.facebook.com";
    
     driver.get(URL);
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    
    
     //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email
    //placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">
    
    
    
 //   <input type="password" class="inputtext _55r1 _6luy" name="pass" id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">
    
    
    // 1 tag and id ---#
    
     
//    // (#id) 
//    driver.findElement(By.cssSelector("#email")).sendKeys("Tulasi@gmail.com");
//    // tagname#id
//    driver.findElement(By.cssSelector("input#pass")).sendKeys("08062008");
//    
//    
//    // 2 tag and class------(.)
//    
//    //.class
//    driver.findElement(By.cssSelector(".inputtext _55r1 _6luy")).sendKeys("renukamohan58@gmail.com");
//    //tagname.class
//    driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("08062008");
//    
//    
//    // 3 tag and attribute
//    
//    //[attribute=value]
//    driver.findElement(By.cssSelector("[name=email]")).sendKeys("08062008");
//    //tagName[attribute=value]
//    driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("08062008");
//    
//    
    // 4 tagclassattribute
    
    driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("Tulasi@gmail.com");
    driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys("898989");
    
    
    
    
    
    
    
    
    
}


}
