package com.qa.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.ecomPages.Computers;
import com.qa.ecomPages.Electronics;
import com.qa.ecomPages.HomePage;
import com.qa.ecomPages.LoginPage;

public class ElectronicsTest extends BaseClass {

	
	LoginPage lp;
	HomePage homePage;
	Electronics electronic;
	
	public ElectronicsTest(){
		 super();
		 
	}
	

	@BeforeMethod
	public void setUp(){
		initialization();
		lp = new LoginPage();
		electronic  = new Electronics();
		
		homePage = lp.login(prop.getProperty("Email"),prop.getProperty("Password"));
	
		electronic = homePage.Elc();
	}
	
//	@Test(priority=1)
//	public void verifyComputerlabel(){
//		Assert.assertTrue(computer.verifyTitle(),"label missing");
//	}computer
	
	
	
//	@Test(priority=2)
//	public void clickDesktop1(){
//		
//		computer.clickDesktop1();
//	}
	
	

@AfterMethod
	
	public void tearDown(){
	//	driver.quit();
	}
	
	

}
