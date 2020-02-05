package NormalSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPratice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		/*
		 * WebElement findElement =
		 * driver.findElement(By.xpath("//button[contains(text(),'Prompt Pop up')]"));
		 * ((JavascriptExecutor) driver).executeScript("arguments[0].click()",
		 * findElement); Thread.sleep(3000); Alert alert = driver.switchTo().alert();
		 * alert.sendKeys("yes");
		 * 
		 * 
		 * alert.dismiss();;
		 */
	
		WebElement findElement = driver.findElement(By.xpath("//button[@id='timingAlert']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",findElement);
		WebDriverWait wait= new WebDriverWait(driver, 8);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert= driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alert.accept();
		
		
}
}