package XpathAndCss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSample {
	public static void main(String[] args) {
		/*
		 * id----> # div#cookie-consent
		 * class--->.
		 * 
		 */
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		
		  driver.get("https://www.actitime.com/");
		   List<WebElement> findElements = driver.findElements(By.cssSelector("a,li"));
for (WebElement webElement : findElements) {
	

		  System.out.println(webElement.getText());
}
}}