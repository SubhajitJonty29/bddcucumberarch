package pageloactor;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.Testbase;

public class PageNameLocator {
	
	Testbase testbase = new Testbase();
	
	@FindBy(xpath ="//input[@placeholder='Email ID']")
	public WebElement Emailaddress_input;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement EmailID_input;
	
	@FindBy(xpath = "//button[text()='Log in']")
	public WebElement login_button;
	
	
	public PageNameLocator() {
		PageFactory.initElements(testbase.GetDriver(), this);
	}
	
	
	
	
}
	

	
