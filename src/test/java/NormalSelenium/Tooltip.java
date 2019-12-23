package NormalSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demoqa.com/tooltip-and-double-click/");
	Actions acc= new Actions(driver);
WebElement age = driver.findElement(By.id("tooltipDemo"));
acc.moveToElement(age).perform();
String attribute = driver.findElement(By.xpath("//span[@class='tooltiptext']")).getText();
	
	System.out.println(attribute);
	}
}