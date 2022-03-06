package com.Facebookqaf.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "Features", 
		glue = "com.Facebookqaf.step"
		
		)





public class TestRunner extends AbstractTestNGCucumberTests{

}
