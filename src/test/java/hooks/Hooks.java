package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import baseclass.BaseClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	@BeforeStep
	public void beforeScenario(Scenario scenario){
		if(driver==null) {
			lanchBrowser();
			url(BaseClass.getProperties());
			waiting(CONSTANT_WAIT_TIME);
			driver.findElement(By.xpath("//*[text()='Log in']")).click();
			driver.findElement(By.id("Email")).sendKeys("mugesh1@gmail.com");
			driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Mugesh@1");
			driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
			}	
		
	}
	

	@AfterStep
	public void failureScreenshot(Scenario scenario) {
		if(scenario.isFailed())	{
			byte[] photo = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//		scenario.embed(photo, "image/png","error_image");	
			scenario.attach(photo,"image/png","error image");
			}
		
	}
}
