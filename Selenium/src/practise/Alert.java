package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="https://www.tsrtconline.in/oprs-web";
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement CheckButton=driver.findElement(By.id("searchBtn"));
		CheckButton.click();
		org.openqa.selenium.Alert alt=driver.switchTo().alert();
		String altMsg=alt.getText();
		System.out.println("the text of alert:"+altMsg); 
		alt.accept();
		
		WebDriver hi=new ChromeDriver();
		//hi(object)->represents to the class....always points to the current browser
		hi.get("http://www.google.com");
		System.out.println("chromebrowser");
		hi.get("http://facebook.com");
		System.out.println("facebookpage");
		hi.get("http://bing.com");
//		<a class="gb_g" data-pid="23"
//		href="https://mail.google.com/mail/?tab=wm&amp;ogbl" target="_top">Gmail</a>
		////*[@id="gbw"]/div/div/div[1]/div[1]/a
//		WebElement gmail=hi.findElement(By.xpath("*[@id='gbw']"));
//		System.out.println(gmail);
	
		
		
		
		

	}

}
