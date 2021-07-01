package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.ecomPages.Computers;
import com.qa.ecomPages.HomePage;
import com.qa.ecomPages.LoginPage;

public class ComputersPageTest extends BaseClass {

	LoginPage lp;
	HomePage homePage;
	Computers computer;
	
	public ComputersPageTest(){
		 super();
		 
	}
	

	@BeforeMethod
	public void setUp(){
		initialization();
		lp = new LoginPage();
		computer  = new Computers();
		
		homePage = lp.login(prop.getProperty("Email"),prop.getProperty("Password"));
	
		computer = homePage.Comp();
	}
	
//	@Test(priority=1)
//	public void verifyComputerlabel(){
//		Assert.assertTrue(computer.verifyTitle(),"label missing");
//	}computer
	
	@Test(priority=1)
	public void clickDesktop() throws InterruptedException{
		computer.clickDesktop();
		
	}
	
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
