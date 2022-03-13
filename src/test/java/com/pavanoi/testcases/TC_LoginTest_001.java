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
		logger.info("URL opened");
		
		/*LoginPage login = new LoginPage(driver);
		login.setUserName(username);
		logger.info("Enter Username");
		
		login.setPassword(password);
		logger.info("Enter Password");
		login.clickSubmit();*/
		logger.info("Page Opened");
		logger.info("Getting Title");
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
