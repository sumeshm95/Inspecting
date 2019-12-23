package NormalSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootStrap {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//li[@role=\"presentation\"]/a"));
		for (WebElement webElement : findElements) {
			//System.out.println(webElement.getText());
			if(webElement.getText().equalsIgnoreCase("javascript"))
				wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();	
		}
		
}

	
	
	
	
	
}