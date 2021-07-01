package com.qa.ecomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(tagName = "h2")
	WebElement WelcomeText;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[2]/ul[1]/li[2]/a[1]")
	WebElement Electronics;
	
	
	//for mousehover
//	@FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
//	WebElement CamPic;
	@FindBy(xpath= "//a[@class='ico-account' and contains(text(),'My account')]")
// It create new memory & store there & It will get element from cach so that performance can be improved, or else if calling multiple times
	@CacheLookup
	WebElement MyAccount;
	

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]")
	WebElement Computers;

	@FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[4]/a[1]")
	WebElement DigitalDownloads;

	@FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
	WebElement GiftCards;

	// Initialize page Objects

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomeTitle() {
		return driver.getTitle();
	}

	public Electronics Elc() {

		Electronics.click();
		return new Electronics();
	}

	public Computers Comp() {

		Computers.click();
		return new Computers();
	}

	public DigitalDownloads DDs() {

		DigitalDownloads.click();
		return new DigitalDownloads();
	}

	public GiftCards GFs() {

		GiftCards.click();
		return new GiftCards();
	}
	
	
	
	//mousehover click

//	public void clickElectronics() {
//		Actions action = new Actions(driver);
//		action.moveToElement(Electronics).build().perform();
//		CamPic.click();
//	}
	
	public RegisterPage clickOnMyAccount(){
		MyAccount.click();
		return new RegisterPage();
	}
	
	
	
	
	
	
	
	
	
	
	
}
