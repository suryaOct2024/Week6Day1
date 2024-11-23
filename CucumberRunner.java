package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/feature/LoginSalesForce.feature",
							 "src/test/java/feature/SalesForceCreateAccount.feature"},
					glue = {"steps"}, //pkg where defn is available
					publish = true, //will generate report
					monochrome = true)  //will remove junk character from report link

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
