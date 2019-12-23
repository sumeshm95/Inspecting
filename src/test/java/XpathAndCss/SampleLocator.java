package XpathAndCss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleLocator {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		
		  driver.get("https://www.actitime.com/");
		
		  driver.findElement(By.linkText("TRY FREE")).click(); WebDriverWait wait =new
		  WebDriverWait(driver, 10); wait.until(ExpectedConditions.urlToBe(
		  "https://www.actitime.com/free-online-trial"));
		  driver.findElement(By.id("first-name")).sendKeys("sumehs");
		  driver.findElement(By.id("last-name")).sendKeys("sumeh");
		  driver.findElement(By.id("email")).sendKeys("sumeshm007@gmail.com");
		  driver.findElement(By.id("company")).sendKeys("sume");
		 
		 List<WebElement> findElements = driver.findElements(By.xpath("//ul[@class='main-menu__ul']/child::li/a"));
		 for (WebElement webElement : findElements) {
			 System.out.println(webElement.getText());
		}
		 
	
		//ul[@class="main-menu__ul"]/child::li[@class="main-menu__item "]/ a[text()="Pricing"]

}
}