package XpathAndCss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		
		driver.get("http://demo.guru99.com/test/upload/");
		////C:\Users\smohandass\Desktop  terms
		driver.findElement(By.id("uploadfile_0")) .sendKeys("C:\\Users\\smohandass\\Desktop");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
	}

}
