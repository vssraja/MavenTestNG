package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
		

@CucumberOptions(features= {"src/test/resources/MagentoLogin.feature"},glue= {"steps"},plugin={"html:Reports.html"}, dryRun=true,tags ="@login and @positive")

public class Runner 
{
	

	
	
	
	
	
	

}
