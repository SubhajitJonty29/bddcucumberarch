package apphooks;


import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import pageactions.PageNameActions;
import testbase.Testbase;

public class Hooks {
	 
	Testbase testbase = new Testbase();
	Logger log = Logger.getLogger(Hooks.class);
	
	@Before(order = 1)
	public void opendriver() {
		
		testbase.driverinitialization();
		log.info("--> Initializing Driver ");
	}
	
	@After(order = 0)
	public void quitBrowser() {
		testbase.closeDriver();
		log.info("--> Destroying Driver ");
	}
	
	
	@After(order = 1)
	public  void tearDown(Scenario scenario) {
		 
		    //validate if scenario has failed
		 if(scenario.isFailed()) {
		        final byte[] screenshot = ((TakesScreenshot) testbase.GetDriver()).getScreenshotAs(OutputType.BYTES);
		        scenario.attach(screenshot, "image/png", "Check Failed Scenario screenshot"); 
		        log.info("--> Adding Failed Scenario Screenshot ");
		        } 
	}

	
	
	@BeforeStep
	public void step() {
		log.info("--> Starting to exececute nextstep");
	}
	
	
	@AfterStep
	public void attachscreenshotof(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) testbase.GetDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "Check Step screenshot");
        log.info("--> Added Step Screenshot ");
        
	}
	
	}


