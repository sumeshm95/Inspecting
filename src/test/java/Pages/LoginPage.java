package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	WebDriver driver;
	WebDriverWait wait= new WebDriverWait(driver, 10);
	
	//By username=By.id("mobileNoInp");
	By Help =By.xpath("//a[contains(text(),'Help')]");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	
			
	}
	
			
		public void click() {
			WebElement findElement = driver.findElement(Help);
			
			 wait.until(ExpectedConditions.elementToBeClickable(findElement)).click();
		
		
		
	}

	
}