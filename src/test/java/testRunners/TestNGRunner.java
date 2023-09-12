package testRunners;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"D:\\EclipseWorkspace\\BDD_Cucumber\\src\\test\\resources\\features\\LoginPage1.feature"},
					glue={"stepDefinations","AppHooks"},
					monochrome=true,
					plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"timeline:test-output-thread/"}
				
				
		)
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	  @Override
      @DataProvider(parallel = true) 
      public Object[][] scenarios() { 
          return  super.scenarios(); 
          }

}
