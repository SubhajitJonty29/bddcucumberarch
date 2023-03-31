package pageactions;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pageloactor.PageNameLocator;
import testbase.Testbase;



public class PageNameActions    {

	PageNameLocator pagenamelocator = new PageNameLocator() ;
	Logger log = Logger.getLogger(PageNameActions.class);

public void enter_Email(String EMAILADDRESS) {
		
	pagenamelocator.Emailaddress_input.sendKeys(EMAILADDRESS);
	log.info("--> Entering Email Address");
		}
		
	public void enter_Password(String PASSWORD) {
			
		pagenamelocator.EmailID_input.sendKeys(PASSWORD);
		
		}

	public void Click_on_login() {
		pagenamelocator.login_button.click();
	
		}

}
