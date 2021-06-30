package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles" ,glue="org.stepdefinition", dryRun=false,
monochrome=true, tags= {"@login"},snippets=SnippetType.CAMELCASE,
plugin= {"pretty",
		"html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\output.json",
		"junit:src\\test\\resources\\Reports\\fb.xml",
		"rerun:src\\test\\resources\\Failed\\failedfile.txt"
})


public class TestRunner {
	
	@AfterClass
	public static void jvmReportGenerators() {
		JvmReport.generateJvmReport("C:\\Users\\ASHLINSHILIN\\Documents\\Selenium\\New folder\\CucumberFacebook\\src\\test\\resources\\Reports\\output.json");
	}

}
