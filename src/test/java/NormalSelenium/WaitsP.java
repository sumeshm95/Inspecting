package NormalSelenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WaitsP {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demoqa.com/tooltip-and-double-click/");
		WebElement age = driver.findElement(By.id("tooltipDemo"));
		/*
		 * Wait wait = new FluentWait(driver) .withTimeout(30, SECONDS) .pollingEvery(5,
		 * SECONDS) .ignoring(NoSuchElementException.class);
		 */
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).
				pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOf(age));
}
}