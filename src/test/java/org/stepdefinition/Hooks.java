package org.stepdefinition;

import org.utilities.BaseClass;

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
	public void afterScenario() {
		quitBrowser();
	}

}
