package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class PasswordPage extends BaseClass{
	public PasswordPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement clkForget;
	
	@FindBy(xpath="//input[@placeholder='Mobile number']")
	private WebElement txtMobile;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement txtSubmit;
	
	@FindBy(xpath="//div[text()='No search results']")
	private WebElement txtResult;
	
	@FindBy(xpath="//a[@title='English (UK)']")
	private WebElement clkEnglish;

	public WebElement getClkForget() {
		return clkForget;
	}

	public WebElement getTxtMobile() {
		return txtMobile;
	}

	public WebElement getTxtSubmit() {
		return txtSubmit;
	}

	public WebElement getTxtResult() {
		return txtResult;
	}

	public WebElement getClkEnglish() {
		return clkEnglish;
	}
		

}
