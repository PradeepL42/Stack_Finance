package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features ="/Users/pradeep/OiTest/src/features",
        glue ={"steps"}
       )
public class Runner extends AbstractTestNGCucumberTests {
}
