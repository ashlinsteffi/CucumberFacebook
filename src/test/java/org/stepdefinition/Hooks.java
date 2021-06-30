package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public void beforeScenario() {
		launchBrowser();
		maximize();
		applyWait();
	}
	
	@After
	public void afterScenario(Scenario s) throws IOException {
		if(s.isFailed());
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshotAs, "image/png");
		//String name=s.getName();
		//screenShot(name);
		quitBrowser();
	}

}
