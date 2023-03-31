package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageactions.PageNameActions;
import pageloactor.PageNameLocator;
import testbase.Testbase;
import testutility.Testutils;



public class Steps {

	Testbase testbase = new Testbase();
	Testutils testutils = new Testutils();
	PageNameLocator pagenamelocator = new PageNameLocator();
	
PageNameActions pagenameactions = new PageNameActions();

@Given("I enter URL {string}")
public void i_enter_URL(String URL) {
	testutils.openURL(URL);
	
}
		

@When("I am on home page")
public void i_am_on_home_page() {
	testutils.Implicitlywait();
	
	
}

@Then("I get home tiltle")
public void i_get_home_tiltle() {
   
}

@Then("I click on My account")
public void i_click_on_My_account() {
  
}

@Then("I enter emailadderss {string}")
public void i_enter_emailadderss(String EMAILADDRESS) {
	pagenameactions.enter_Email(EMAILADDRESS);
	//pagenamelocator.enter_Email(EMAILADDRESS);
}

@Then("I enter password {string}")
public void i_enter_password(String PASSWORD) {
	pagenameactions.enter_Password(PASSWORD);
}

@Then("I click on Login")
public void i_click_on_Login() {
	pagenameactions.Click_on_login();
}
}

