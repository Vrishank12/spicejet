package com.Java;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_jquery {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		/*WebDriver driver=null;
		String url="https://jqueryui.com/droppable/";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		

		
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		// id="draggable" 
	WebElement	Dragmetomytarget=driver.findElement(By.id("draggable"));
	String DragmeTomyTargetText=Dragmetomytarget.getText();
	System.out.println("the text of webelementis:"+DragmeTomyTargetText);
*/	
		
WebDriver driver = null;
		
		String url="https://jqueryui.com/droppable/";
		
System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
driver = new ChromeDriver();
		
driver.get(url);

		// Maximizing the Browser
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

// Identify the property of Frame of the Webpage in which Element is under Test
// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>

driver.switchTo().frame(driver.findElement(By.className("demo-frame")));


// id="draggable" - property of "Drag Me to My Target" Element

WebElement dragMeToMyTargetElement=driver.findElement(By.id("draggable"));
//<div id="droppable" class="ui-widget-header ui-droppable">
WebElement droppableElement=driver.findElement(By.id("droppable"));
//performing drapand drop operation
Actions act=new Actions(driver);
act.dragAndDrop(dragMeToMyTargetElement, droppableElement).perform();

String dragMeToMyTargetElementText=dragMeToMyTargetElement.getText();

System.out.println(" The text of the WebElement is : "+dragMeToMyTargetElementText);
driver.switchTo().defaultContent();
//<a href="https://jqueryui.com/resizable/">Resizable</a>
WebElement ResizableElement=driver.findElement(By.linkText("Resizable"));
ResizableElement.click();
//<a href="https://js.foundation/events">Events</a>
/*WebElement EventsElement=driver.findElement(By.linkText("Events"));
act.moveToElement(EventsElement).perform();
EventsElement.click();
*///<a href="https://jqueryui.com/demos/">"</a>
//<li class="menu-item"><a href="https://jqueryui.com/download/">Download</a></li>
WebElement HeaderBlock=driver.findElement(By.className("menu-item"));
List<WebElement>headerBlockLinks=HeaderBlock.findElements(By.tagName("a"));
Thread.sleep(10000);

int headerBlockLinksCount=headerBlockLinks.size();

System.out.println(" The number of links in the headerBlock are : "+headerBlockLinksCount);

for(int p=0;p<headerBlockLinksCount;p++)// displaying linkNames in the headerBlock
{
	String headerBlockLinkName=headerBlockLinks.get(p).getText();
	System.out.println(p+" "+headerBlockLinkName);
}





	
		
		

	}

}
