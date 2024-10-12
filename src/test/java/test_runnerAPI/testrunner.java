package test_runnerAPI;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = ".\\src\\test\\java\\features\\ProdFeature.feature",
  glue = {"steps"}, //step definiton files
  plugin = {"pretty","json:Report2"},
  dryRun=false,
  monochrome=true
  //tags = "@setCookies",
  //name="Logout"
		)
public class testrunner {

}
