package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationNavigation {

	public static void main(String[] args) {
		WebDriver hi=null;
				String url="http://www.bing.com";
				System.setProperty("webdriver.chrome.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
				hi=new ChromeDriver();
				hi.get(url);
		

	}

}
