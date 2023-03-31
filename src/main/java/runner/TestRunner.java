package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src\\main\\java\\featurefiles", //the path of the feature files
			glue={"stepdefinations","apphooks"}, //the path of the step definition files
			plugin= {"pretty",
					"json:cucumber-output/json_output/cucumber.json",
					"junit:cucumber-output/junit_output/cucumber.xml",
					"html:cucumber-output/html_output/cucumber.html",
					"timeline:cucumber-output/timelineoutput-thread/",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					},//to generate different types of reporting
			stepNotifications = true,
			//monochrome = true,//display the console output in a proper readable format
			//strict = true,//it will check if any step is not defined in step definition file
			//dryRun = true //to check the mapping is proper between feature file and step def file
			tags ="@SmokeTest" 		
			)
	 
	public class TestRunner {
	 
	}