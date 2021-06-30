package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles" ,glue="org.stepdefinition", dryRun=false,
monochrome=true, tags= {"@login"}, strict=false, snippets=SnippetType.CAMELCASE)


public class TestRunner {

}
