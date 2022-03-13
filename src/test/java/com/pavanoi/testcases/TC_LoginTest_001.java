package com.pavanoi.testcases;

import org.testng.annotations.Test;

import com.pavanoi.pageobjects.BaseClass;
import com.pavanoi.pageobjects.LoginPage;

import freemarker.template.utility.CaptureOutput;
import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() {
		driver.get(baseURL);
		logger.info("URL opened Prasanth");
		
		/*LoginPage login = new LoginPage(driver);
		login.setUserName(username);
		logger.info("Enter Username");
		
		login.setPassword(password);
		logger.info("Enter Password");
		login.clickSubmit();*/
		logger.info("Page Opened Prasanth");
		logger.info("Getting Title Prasanth");
		logger.info(driver.getTitle());
		
		if(driver.getTitle().contains("rashmoni")) {
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else 
		{
			//captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
	
	

}
