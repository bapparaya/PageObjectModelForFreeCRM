package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

import io.qameta.allure.Step;

public class LoginPage extends TestBase {
	
	//page Factory
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signup;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	@Step("getting login page title step")
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	@Step("verify login username:{0} and password: {1} step")
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		
		
		return new HomePage();
		
	}
	
	
	
	
	
	
	

}
