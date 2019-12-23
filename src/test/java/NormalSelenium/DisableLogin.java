package NormalSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class DisableLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		driver.findElement(By.xpath("//input[@id='fname']"));
		JavascriptExecutor je= (JavascriptExecutor)driver;
		//je.executeScript("document.getElementById('pass').setAttribute('value', 'Here you can put the value for Password')");
		WebElement findElement = driver.findElement(By.xpath("//input[@type='submit']"));
	
je.executeScript("document.getElementById('pass').setAttribute('value','hello')")	;
je.executeScript("arguments[0].click()",findElement);
	
	
	}
	//div[@id='ui-datepicker-div']/table/class="ui-datepicker-calendar"

}
