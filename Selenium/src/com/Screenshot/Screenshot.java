package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = null;
		String url="http://bing.com";
				
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
				
		driver.get(url);		
		
		Thread.sleep(10000);
		// TakesScreenshot - is an interface in Selenium
		// OutputType - is an interface in Selenium
		// Type casting
		File bingScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bingScreenShot, new File("./ScreenShot/bing1.png"));
		
		driver.quit();
		
	}

}


