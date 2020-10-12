package com.Java;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class XpathAdvance {

	public static void main(String[] args) {
		
	 
	
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    String	URL="https://money.rediff.com/gainers/bse/daily/groupa";
    
     driver.get(URL);
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	
	
	
	String Text=driver.findElement(By.xpath("//a[contains(text(),'Tata Consultancy')]")).getText();
	System.out.println(Text);
	
	//self
	String Text1=driver.findElement(By.xpath("//a[contains(text(),'Tata Consultancy')]/self::a")).getText();
	System.out.println(Text1);
	
	//parent
	String Text2=driver.findElement(By.xpath("//a[contains(text(),'Tata Consultancy')]/parent::td")).getText();
	System.out.println("The parent no is : " + Text2);
	
	//child
	// //a[contains(text(),'Tata Consultancy')]/child::*
	
	//ancestor
	String Text3=driver.findElement(By.xpath("//a[contains(text(),'Tata Consultancy')]/ancestor::tr")).getText();
	System.out.println("The amcestor no is : " + Text3);
	

	//child
	
	List<WebElement> child=driver.findElements(By.xpath("//a[contains(text(),'Tata Consultancy')]/ancestor::tr/child::td")) ;
	System.out.println("The child no is : " + child);
	
	
	//desendant
	

	
	List<WebElement> Text4=driver.findElements(By.xpath("//a[contains(text(),'Tata Consultancy')]/ancestor::tr/descendant::*"));
	System.out.println("The descendant is : " +Text4.size());
	
	
	List<WebElement> Text5=driver.findElements(By.xpath("//a[contains(text(),'Tata Consultancy')]/ancestor::tr/descendant::td"));
	System.out.println(Text5.size());
	
	//following
	
	List<WebElement> follow=driver.findElements(By.xpath("//a[contains(text(),'Tata Consultancy')]/ancestor::tr/following::tr"));
	System.out.println("The following is :" + follow.size());
	
	//following sibling
	List<WebElement> followsibling=driver.findElements(By.xpath("//a[contains(text(),'Tata Consultancy')]/ancestor::tr/following-sibling::tr"));
	System.out.println("The following sibling is :" + followsibling.size());
	
	//preceding
	
	List<WebElement> preceding=driver.findElements(By.xpath("//a[contains(text(),'Tata Consultancy')]/ancestor::tr/preceding::tr"));
	System.out.println("The following sibling is :" + preceding.size());
	
	//preceding-sibling

	List<WebElement> precedingsibling=driver.findElements(By.xpath("//a[contains(text(),'Tata Consultancy')]/ancestor::tr/preceding-sibling::tr"));
	System.out.println("The following sibling is :" + precedingsibling.size());
	
driver.quit();
	
	}
}
