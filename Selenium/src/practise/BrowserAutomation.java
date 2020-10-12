package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {

	public static void main(String[] args) {	WebDriver driver=null;
	String url="https://www.tsrtconline.in/oprs-web";
	System.setProperty("webdriver.chrome.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	//firefoxdriver
//	System.setProperty("webdriver.gecko.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
	FireFoxDriver fi=new FireFoxDriver();
	//EdgeBrowser
	System.setProperty("webdriver.edge.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
	EdgeDriver ed=new EdgeDriver();
	
	//interexplorer
	System.setProperty("webdriver.ie.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
	InternetExplorerDriver ed=new InternetExplorerDriver();
	

		

	}

}
