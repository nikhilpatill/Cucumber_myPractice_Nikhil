package org.TestRunnes;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "C:\\accelaration\\workspace2\\Cucumber_myPractice_Nikhil\\src\\test\\resourse\\org.Feature",
		
		glue = "org\\StepDefination",
		
		dryRun = false,
		
		plugin = { 
				
				"html:target/Cucumber_Report.html",
				"json:target/json_report.json",
				"junit:target/junit_report.xml"
				
		}
		
		
		
		)
public class testRunner extends AbstractTestNGCucumberTests{

}
