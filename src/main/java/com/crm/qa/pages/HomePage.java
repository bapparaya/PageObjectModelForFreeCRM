package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"top-header-menu\"]/div[2]/span[1]")
	WebElement usernamelabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Task')]")
	WebElement taskLink;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePagetitle() {
		return driver.getTitle();
	}
	
	public boolean verifyUsername() {
		return usernamelabel.isDisplayed();
	}
	
	public ContactPage clickoncontactslink(){
		
		contactsLink.click();
		return new ContactPage();
	}
	
	public DealsPage clickondealslink() {
		dealsLink.click();
		return new DealsPage();
	}
	
	public TaskPage clickontasklink() {
		taskLink.click();
		return new TaskPage();
	}
	
	

}
