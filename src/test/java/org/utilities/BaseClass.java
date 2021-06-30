package org.utilities;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void applyWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void fillText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void clicks(WebElement element) {
		element.click();
	}
	
	public static void invalidUrl() {
		String url=driver.getCurrentUrl();
		Assert.assertTrue("check the Url", url.contains("privacy_mutation_token"));
	}
	
	public static void validLogin(WebElement element) {


		   Assert.assertTrue("verify text",element.isDisplayed());
	}
	
	public static void invalidEmail(WebElement element) {
		Assert.assertTrue("Verify the email", element.isDisplayed());
	}
	


}
