package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homepage;
	ContactPage contactspage;
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePagetitle = homepage.verifyHomePagetitle();
		Assert.assertEquals(homePagetitle, "Cogmento CRM", "homepage title is not matched");
	}
	
	@Test(priority=2)
	public void verifyusernametest() {
		Assert.assertEquals(homepage.verifyUsername(), true);
	}
	
	@Test(priority=3)
	public void verifycontactslinktest() {
		contactspage=homepage.clickoncontactslink();
	}
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	

}
