package com.qa.ecomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass {

	
  //Page factory
	@FindBy(name="Email")
	WebElement Email;
	
	@FindBy(name="Password")
	WebElement Password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Register')]")
	WebElement registerBtn;
	
	@FindBy(xpath="//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement logo;	
	
	//constructor class
	
	public LoginPage(){
		//pagefactory -it will initialize with the driver and THIS means current class objects i.e. above variable will initialize with  driver
		PageFactory.initElements(driver, this);
	}
	
	//method statrted
	//actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
		
	}
	
	public boolean validateImg(){
		return logo.isDisplayed();
	}
	
	//1 more method for login
	
	public HomePage login(String mail, String pwd){
		Email.sendKeys(mail);
		Password.sendKeys(pwd);
		loginBtn.click();
		
		//now it will navigate to homepage so the return type will be
		return new HomePage();
	}
}
