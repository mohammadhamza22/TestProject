package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	private WebDriver driver;
	// By Locators:
	private By emailId = By.id("username");
	private By password = By.name("pw");
	private By loginButton = By.name("Login");
	private By forgotpwdlink = By.linkText("Forgot Your Password?");

	// Constructors of the page class
	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	// page actions
	public String getLoginPageTitle() {
		return driver.getTitle();

	}

	public boolean isForgotPassowrdLinkExists() {
		return driver.findElement(forgotpwdlink).isDisplayed();
	}

	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(loginButton).click();

	}

	public Somethingnewpage doLogin(String un, String pwd) {
		System.out.print("Login with" + un + "and" + pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
		return new Somethingnewpage(driver);
	}
}
