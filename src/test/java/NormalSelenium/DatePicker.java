package NormalSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {
		

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement element = driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']"));
		Thread.sleep(3000);
		element.click();
	
			 
			List<WebElement> findElements = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//tr//td"));  
int size = findElements.size();
System.out.println(size);
			
			for (WebElement webElement : findElements) {
	String text = webElement.getText();
	if(text.isEmpty()) {
		System.out.println("*****");
	}else
	{
		System.out.println(text);
	}
	
		
			  if(text.equalsIgnoreCase("30")) {
			  wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
			  
			  
			  break; }
			  
			 
		
			
	}

	}
}


