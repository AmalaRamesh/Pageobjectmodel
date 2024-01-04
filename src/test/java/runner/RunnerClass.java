package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\amala\\eclipse-workspace\\Pom-Cucumber\\src\\test\\resources\\Feature\\jewellry.feature",
                glue= {"stepdefinition","hooks"},  
//              dryRun = true,
                monochrome=true,tags="@chain",
                plugin= {
                		"html:Reports/Pom-Cucumber/Reports/htmlreport/report.html",
                		"json:Reports/Pom-Cucumber/Reports/jsonreport/report.json",
                		"junit:Reports/Pom-Cucumber/Reports/junitreport/Cucumber.xml",
                		}
		)
public class RunnerClass {
	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.jvmreport(
				"Reports/Pom-Cucumber/Reports/jsonreport/report.json");
		
	}
}
