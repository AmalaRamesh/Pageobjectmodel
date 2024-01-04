package runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void jvmreport(String json) {
		File file = new File("Reports/Pom-Cucumber/Reports/Pom-Cucumber/Reports/jvmreport");
		Configuration config = new Configuration(file,"jvmreports");		
		config.addClassifications("name", "mugesh");
		config.addClassifications("project name", "webshop");
		List<String> list = new ArrayList<String>();
		list.add(json);
		ReportBuilder reportMaking = new ReportBuilder(list,config);
		reportMaking.generateReports();
	}
}
