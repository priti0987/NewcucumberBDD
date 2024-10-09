package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	  features = ".\\src\\test\\java\\feature\\ComplexLogin.feature",
	  glue = "steps", 
	  plugin = {"pretty","html:Report1"},
	  //dryRun=false,
	  monochrome=true
	 // dryRun = true,
	 //tags = "@Login and @SmokeTest"
	 // tags="@Orange"
	  //name="Logout"
	        )
	public class TestRunner {

	}




