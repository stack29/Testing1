package com.HomePage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AW.Base.BaseClass;
import com.AW.PageObject.HomePage;
import com.AW.Utils.WebDriverUtils;

public class HomePageTest extends BaseClass {
	
	
	@Test
	public void SignUpUser() throws InterruptedException
	{
		
		HomePage homePage =  new HomePage(driver);
		homePage.clickSignup();
		Thread.sleep(5000);
	}
	
	
}
