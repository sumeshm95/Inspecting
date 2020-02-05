package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.How;

public class SimplePage {
	WebDriver driver;
	
	public SimplePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Help')]")
	WebElement help;
	
	/*
	 * @FindBy(how=How.ID,using="mobileNoInp" ) WebElement id;
	 */

	public void click() {
		help.click();
	}
	
	
	
}
