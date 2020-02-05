package NormalSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Arilogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor je= (JavascriptExecutor)driver;
		 Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).
				  pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		 driver.get("https://linkus.autorobinc.com/");
		 driver.findElement(By.xpath("//b[contains(text(),'Sign in')]")).click();
		 driver.findElement(By.xpath("//input[@id='login']")).sendKeys("smohandass");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='openerp oe_kanban_view hr_dash col-xs-12 col-md-12 col-lg-12 col-sm-8 oe_view oe_cannot_create oe_kanban_ungrouped']//div[@class='dash-box-action leaves-left']//button[contains(text(),'More Info')]"))).click();;
		driver.findElement(By.xpath("//span[contains(text(),'Human Resources')]")).click();
		//span[contains(text(),'Leave Request')]
		WebElement findElement = driver.findElement(By.xpath("//span[contains(text(),'Leave Request')]"));
		je.executeScript("arguments[0].click()", findElement);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='oe_calendar_view']//tr[2]//td[4]")).click();
		Thread.sleep(4000);
		WebElement findElement2 = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div/div/div/div[3]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/span/div/span[2]/img"));
		/*
		 * //wait.until(ExpectedConditions.elementToBeClickable(findElement2)).click();
		 * wait.until(ExpectedConditions.visibilityOf(findElement2));
		 */
		
		findElement2.click();
		
		
		List<WebElement> findElements = driver.findElements(By.xpath("//ul[@id='ui-id-110']//li"));
        for (WebElement webElement : findElements) {
        	System.out.println(webElement.getText());
          
			/*
			 * if(webElement.getText().equalsIgnoreCase("Privilege Leave"))
			 * wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
			 */
		

}
}
}