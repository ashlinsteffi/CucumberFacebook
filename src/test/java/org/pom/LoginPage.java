package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="pass")
	private WebElement  txtPassword;
	
	@FindBy(name="login")
	private WebElement clkLogin;
	
	@FindBy(xpath="//span[text()='Ashlin Steffi']")
	private WebElement txtAshlin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getClkLogin() {
		return clkLogin;
	}

	public WebElement getTxtAshlin() {
		return txtAshlin;
	}
	
	
}
