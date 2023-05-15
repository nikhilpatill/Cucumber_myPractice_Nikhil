package Cucumber.options;



import org.junit.runner.RunWith;

import io.cucumber.junit.*;




@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="src/test/resourse/org.Feature/LoginPage.feature",
		
		glue={ "org/StepDefination" },
		
		
		plugin= {"pretty", "html:target/html_Report/Cucumber.html",
				           "junit:target/xml_Report/Cucumber.xml",
		                   "json:target/Json_Report/Cucumber.json"},
		
		dryRun=false,
		
		tags= "@nikhil"
		
	
		
		
		)










public class testRunner {
	
	
	
	

}
