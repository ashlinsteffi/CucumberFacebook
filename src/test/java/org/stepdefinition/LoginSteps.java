package org.stepdefinition;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.LoginPage;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.datatable.DataTable;

public class LoginSteps extends BaseClass{
	
	
	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
		url("https://www.facebook.com/");
	
	}

	@When("User click login button")
	public void user_click_login_button() throws InterruptedException {
		LoginPage l2=new LoginPage();
		clicks(l2.getClkLogin());
		Thread.sleep(3000);
	}
	
	@When("User enter invalid username and password")
	public void user_enter_invalid_username_and_password(DataTable d) {
	    Map<String, String> map = d.asMap(String.class, String.class);
	    String user = map.get("username");
	    String pass = map.get("password");
		LoginPage l1=new LoginPage();
		fillText(l1.getTxtEmail(),user);
		fillText(l1.getTxtPassword(),pass);
	}

	@Then("User must be in invalid credentials page")
	public void user_must_be_in_invalid_credentials_page() {
	    invalidUrl();
	}


}
