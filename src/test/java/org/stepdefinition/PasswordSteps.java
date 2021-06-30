package org.stepdefinition;

import org.pom.PasswordPage;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PasswordSteps extends BaseClass{
	
	@Given("User click forgot password link")
	public void user_click_forgot_password_link() {
	   url("https://www.facebook.com/");
	   PasswordPage p1=new PasswordPage();
	   clicks(p1.getClkEnglish());
	   clicks(p1.getClkForget());
	}

	@When("User enter invalid email idfor finding the connected account")
	public void user_enter_invalid_email_idfor_finding_the_connected_account() {
		PasswordPage p2=new PasswordPage();
	    fillText(p2.getTxtMobile(), "asa@123");
	}

	@When("User click search button")
	public void user_click_search_button() {
		PasswordPage p3=new PasswordPage();
		clicks(p3.getTxtSubmit());
	    
	}

	@Then("User must validate the error message")
	public void user_must_validate_the_error_message() {
	    PasswordPage p4=new PasswordPage();
	    invalidEmail(p4.getTxtSubmit());
	}

	@When("User enter invalid mobile number for finding the connected account")
	public void user_enter_invalid_mobile_number_for_finding_the_connected_account() {
		PasswordPage p5=new PasswordPage();
	    fillText(p5.getTxtMobile(), "345678");
	}

	@Then("User must validate the error message for invalid mobile number")
	public void user_must_validate_the_error_message_for_invalid_mobile_number() {
		PasswordPage p6=new PasswordPage();
	    invalidEmail(p6.getTxtSubmit());
	}


}
