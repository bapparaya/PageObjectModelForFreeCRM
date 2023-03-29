package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactpagelabel;
	
	/*@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[2]/td[1]/div/label")
	WebElement checkbox*/
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifycontactslabeltest() {
		return contactpagelabel.isDisplayed();
	}
	
	public void selectcontacts() {
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/thead/tr/th[1]/div/input")).click();
	}

}
