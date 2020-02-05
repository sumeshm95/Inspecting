package NormalSelenium;

import org.openqa.selenium.By;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		 System.out.println("The total number of iframes are " + iframeElements.size());
		 WebDriver frame = driver.switchTo().frame("IF1");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 JavascriptExecutor je= (JavascriptExecutor)driver;
	WebElement findElement = frame.findElement(By.xpath("(//span[contains(text(),'Selenium C Sharp')])[1]"));
	je.executeScript("arguments[0].click()", findElement);

	
	
		
	}
	}
	 
	
	
	
	
	
	

