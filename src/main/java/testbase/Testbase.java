package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Scenario;
import stepdefinations.Steps;

public class Testbase {

	public static WebDriver driver;
	public static WebElement element;
	public static Properties prop;
	public static ChromeOptions co = new ChromeOptions();
	public static Scenario scenarioname ;
	
	Logger log = Logger.getLogger(Testbase.class);
	
	public Testbase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("src\\main\\java\\featurefiles\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public WebDriver GetDriver() {
		return Testbase.driver;
		
		
	}

	
	public WebDriver driverinitialization(){
		
		try {
			
			String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
				
			driver = new ChromeDriver(co.addArguments("--remote-allow-origins=*")); 
			log.info("-->opening Chrome Driver");
		}
		else if(browserName.equals("FF")){
			driver = new FirefoxDriver();
			log.info("Open Firefox Driver");
		}
		}
		catch(Exception e) {
			
			driver = new ChromeDriver(co.addArguments("--remote-allow-origins=*"));
			log.info("-->opening Chrome Driver");
		}
		finally {
			
			driver.manage().window().maximize();
			log.info("-->Maximizing Browser");
			driver.manage().deleteAllCookies();
			log.info("-->Deleting All cookies");
			
		}
		return driver;
	 
}
	public WebDriver openURL(String URL) {
		driver.get(URL);
		return driver;
		
	}
	
	public void  closeDriver() {
		driver.close();
		driver.quit();	
	}
	
	
        
        
	
	}
	

