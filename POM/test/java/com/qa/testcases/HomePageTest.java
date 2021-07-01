package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.ecomPages.Computers;
import com.qa.ecomPages.DigitalDownloads;
import com.qa.ecomPages.Electronics;
import com.qa.ecomPages.GiftCards;
import com.qa.ecomPages.HomePage;
import com.qa.ecomPages.LoginPage;

public class HomePageTest extends BaseClass{

	LoginPage lp;
	HomePage homePage;
	Electronics electronic;
	Computers computers;
	DigitalDownloads dd;
	GiftCards giftcard;
	
	public HomePageTest(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		lp = new LoginPage();
		electronic = new Electronics() ;
		computers = new Computers();
		dd = new DigitalDownloads();
		giftcard = new GiftCards();
		//frame code should be wrtten before clicking on any frame after login or any
		//testUtil.switchToFrame();
		homePage = lp.login(prop.getProperty("Email"),prop.getProperty("Password"));
	//homePage.clickOnLink1();
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		
	String homePageTitle =	homePage.verifyHomeTitle();
	AssertJUnit.assertEquals(homePageTitle, "nopCommerce demo store","Title not matched");
	
	}
	
	@Test(priority=2)
	public void verifyClickElectronics(){
		electronic = homePage.Elc();
	}
	
	@Test(priority=3)
	public void verifyClickComputers(){
		computers = homePage.Comp();
	}
	
	@Test(priority=4)
	public void verifyClickDigitalDownloads(){
		dd = homePage.DDs();
	}
	
	@Test(priority=5)
	public void verifyGiftCards(){
		giftcard = homePage.GFs();
	}
	
	
	
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
