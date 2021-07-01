package com.qa.ecomPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseClass;

public class RegisterPage extends BaseClass{
	@FindBy(id = "FirstName")
	WebElement FN;
	
	@FindBy(id = "LastName")
	WebElement LN;
	
	@FindBy(xpath = "//button[@type='submit' and @class='button-1 save-customer-info-button']")
	WebElement SubmitBtn;
	
	
	
	public RegisterPage(){
		PageFactory.initElements(driver, this);
	}
	
//	public boolean verifyTitle(){
//		return ComputerLabel.isDisplayed();
//	}
//	
	public void clickMyAccount(int num, String fName, String lName) throws InterruptedException, FileNotFoundException, IOException {
	
	Select select = new Select(driver.findElement(By.name("DateOfBirthDay")));
	select.selectByIndex(num);
	FN.sendKeys(fName);
	LN.sendKeys(lName);
	SubmitBtn.click();
	}
}
