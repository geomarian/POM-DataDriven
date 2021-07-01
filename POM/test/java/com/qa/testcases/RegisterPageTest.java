package com.qa.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.ecomPages.Electronics;
import com.qa.ecomPages.HomePage;
import com.qa.ecomPages.LoginPage;
import com.qa.ecomPages.RegisterPage;
import com.qa.util.TestUtil;

public class RegisterPageTest extends BaseClass {

	
	LoginPage lp;
	HomePage homePage;
	RegisterPage MyAcc;
	
	String sheetName="Sheet1";
	
	public RegisterPageTest(){
		 super();
		 
	}
	

	@BeforeMethod
	public void setUp(){
		initialization();
		lp = new LoginPage();
		MyAcc = new RegisterPage();
		
		homePage = lp.login(prop.getProperty("Email"),prop.getProperty("Password"));
	// first time it will come on Home Page then it will click on MyAccount so it will be like
		MyAcc = homePage.clickOnMyAccount();
	}
	
	@DataProvider
	public Object[][] getDataExcel(){
		//two dimensional object array
		Object data[][] = TestUtil.getTestData(sheetName);
	return data;	
	
	}
	
	
	
	
	@Test(priority=1, dataProvider="getDataExcel")
	
	// add excel column name is variable
	public void editDetails(int sr, String fname, String lname) throws InterruptedException, FileNotFoundException, IOException{
		homePage.clickOnMyAccount();
		//MyAcc.clickMyAccount(04, "Geo", "Mariyan");
	
		MyAcc.clickMyAccount(sr, fname, lname);
	
	}

	
	

@AfterMethod
	
	public void tearDown(){
		driver.quit();
	}
	
	


}
