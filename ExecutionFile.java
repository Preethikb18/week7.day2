package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import stepdef.BaseClass;


@CucumberOptions(features ="src/main/java/features/deletelead.feature",glue="stepdef",monochrome =true,publish=true,snippets=SnippetType.CAMELCASE)
//dry run is used to get implmentation of non implemented method
public class ExecutionFile extends BaseClass {
	
	

}
