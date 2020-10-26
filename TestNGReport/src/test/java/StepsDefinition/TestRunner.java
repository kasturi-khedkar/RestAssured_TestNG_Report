package StepsDefinition;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Features",glue= {"StepsDefinition"},
				plugin= {"pretty","testng:target/testNG-reports/testng.html"},
				monochrome = true)
public class TestRunner extends TestNGReport{

}
