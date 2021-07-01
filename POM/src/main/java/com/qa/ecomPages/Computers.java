package com.qa.ecomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class Computers extends BaseClass{

//	@FindBy(xpath="/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[1]/h1[1]")
//	WebElement ComputerLabel;
	
//	@FindBy(xpath="/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
//	WebElement Desktop;
	
	
	public Computers(){
		PageFactory.initElements(driver, this);
	}
	
//	public boolean verifyTitle(){
//		return ComputerLabel.isDisplayed();
//	}
//	
	public void clickDesktop() throws InterruptedException{
		//driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
	}

}
