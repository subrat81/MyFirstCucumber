package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"FeatureFiles"},tags={"@EmployeeMultipleData"},glue={"stepDefination"},monochrome=true,format={"pretty", "html:target/cucumber-reports"})
public class EmployeeRunner {

}
