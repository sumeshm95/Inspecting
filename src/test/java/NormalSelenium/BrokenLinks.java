package NormalSelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class BrokenLinks {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		for (WebElement webElement : findElements) {
			String attribute = webElement.getAttribute("href");
			verifyLinks(attribute);
		}
		
	

}

	public static void verifyLinks(String attribute) throws IOException {
		
		 URL url = new URL(attribute);
         
         HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
         
         httpURLConnect.setConnectTimeout(3000);
         
         httpURLConnect.connect();
		if (httpURLConnect.getResponseCode()==200) {
			 System.out.println(attribute+" - "+httpURLConnect.getResponseMessage());
			
		}
		if (httpURLConnect.getResponseCode()==404) {
			 System.out.println(attribute+" - "+httpURLConnect.getResponseMessage());
			
		}
		
		
		
		
		
		
		
	}
}