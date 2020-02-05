package NormalSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Handles {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		  Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).
				  pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		String windowHandle = driver.getWindowHandle();
		
		
       driver.findElement(By.id("button1")).click(); 
		 
		 

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li =new ArrayList<String>();
		String string2 = li.get(3);
		driver.switchTo().window(string2);
		li.add(windowHandle);
		/*for (String string : windowHandles) {
			if(!windowHandle.equalsIgnoreCase(string)) {
				driver.switchTo().window(string);
				
			}*/
		for (String string : li) {
			if(!windowHandle.equalsIgnoreCase(string)) {
				driver.switchTo().window(string);
			
		}
			 
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("//a[@class='tp-button orange large']"))))	.click();
			 
		}
		

}
}