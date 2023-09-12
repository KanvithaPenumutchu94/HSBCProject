package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(features={"D:\\EclipseWorkspace\\BDD_Cucumber\\src\\test\\resources\\features\\QueueManagement.feature"},
					glue={"stepDefinations","AppHooks"},
					monochrome=true,
					dryRun=false,
					plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"timeline:test-output-thread/"}

		
		)

@RunWith(Cucumber.class)
public class JunitRunner {

}
