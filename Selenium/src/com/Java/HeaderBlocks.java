package com.Java;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderBlocks {

	public static void main(String[] args) {
		
		
		
						
				WebDriver driver = null;
				String url="https://www.tsrtconline.in/oprs-web/";
						
				System.setProperty("webdriver.chrome.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
				driver = new ChromeDriver();
						
				driver.get(url);

						// Maximizing the Browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				// Identifying the Header Block with the Properties
				// class="menu-wrap" - Property of HeaderBlock
				// Reaching the Header Block - since the Elements under test are within it
				WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
				
				// Since all the Elements in the HeaderBlock are of Type Links
				// Going to the Header block and getting all the Elements in the Header Block
				List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
				
				int headerBlockLinksCount=headerBlockLinks.size();
				
				System.out.println(" The number of links in the headerBlock are : "+headerBlockLinksCount);
				
				for(int p=0;p<headerBlockLinksCount;p++)// displaying linkNames in the headerBlock
				{
					String headerBlockLinkName=headerBlockLinks.get(p).getText();
					System.out.println(p+" "+headerBlockLinkName);
				}

				//driver.quit();


	}

}
