package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\Users\\1852199\\eclipse-workspace\\eclipse2021\\Cucumber_with_Docker_jenkins_and_complete_latest\\src\\test\\resources\\appFeatures\\Somethingnew.feature" },
//path of the feature file
		glue = { "stepdefinitions", "AppHooks" }, // path of the step definition file
		plugin = { "pretty" }, monochrome = true,
		dryRun=false
// display the console output in a readable format

//tags= {"~@SmokeTest","@RegressionTest"}
)

public class Mytestrunner {

}
