package testutility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import testbase.Testbase;

public class Testutils extends Testbase {
	
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT_TIMEOUT = 20;
	public static long EXPLICIT_WAIT_TIMEOUT = 20;
	
	//screenshots
	public static void takeScreenshotAtEndOfTest( String name) throws IOException {
		File scrFile = ((TakesScreenshot) Testbase.driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "\\src\\main\\java\\Screenshots\\screenshot" + name + System.currentTimeMillis() +".png"));
	}
	
	

	
		 
		
	
//wait
	
public void Implicitlywait() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT_TIMEOUT));
	}
	
public void pageloadTimeoutwait() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
	}
	
public void explicitlywaitfor(WebElement e) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
	wait.until(ExpectedConditions.visibilityOf(e));
	
}





}
