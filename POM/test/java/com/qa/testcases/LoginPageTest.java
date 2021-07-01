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
import com.qa.ecomPages.HomePage;
import com.qa.ecomPages.LoginPage;

public class LoginPageTest extends BaseClass{

	LoginPage lp;
	HomePage homePage;
	//Create a const.
	public LoginPageTest(){
		//calling superclass constructor
		//Super keyword - it is compulsory to call baseclass constructor
		 super();
		 //after calling super keyword, then it will come
		 //under setup method & then initialization method
	}
	@BeforeMethod

	
	public void setUp(){
		/*call the initilization method from Baseclass
		browser
		but before initilization, it will 
		call super class construtor  */
		initialization();
		//it will lauch browser & all on basecass
		
		//create object of loginpage class & login page variable is defined at class level (above)
		 lp = new LoginPage();
		 
	}
	
	//wite all testcase
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = lp.validateLoginPageTitle();
		AssertJUnit.assertEquals(title, "nopCommerce demo store. Login");
	}
	
	@Test(priority=2)
	public void checkLogo(){
		boolean flag = lp.validateImg();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest(){
		//after login- home page will open so given
		homePage = lp.login(prop.getProperty("Email"),prop.getProperty("Password")); 
			
	
	}
	

	@AfterMethod
	
	public void tearDown(){
		driver.quit();
	}
}
