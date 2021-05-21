package step;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features ="/Users/pradeep/Documents/Stack/src/features",
        glue ={"step"},
        //plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true
       )
public class Run extends AbstractTestNGCucumberTests {
}
