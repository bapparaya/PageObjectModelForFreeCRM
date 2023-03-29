package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	ContactPage contactspage;
	HomePage homepage;
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		contactspage = new ContactPage();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactspage=homepage.clickoncontactslink();
		
	}
	
	@Test(priority=1)
	public void verifycontactspagelabeltest() {
	Assert.assertTrue(contactspage.verifycontactslabeltest(), "contacts label is missing");
	}
	
	@Test(priority=2)
	public void selectcontactsTest() {
		contactspage.selectcontacts();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
