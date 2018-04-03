package com.phptravels.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.phptravels.pages.HomePage;
import com.phptravels.pages.VisaPage;
import com.phptravels.utils.TestBase;

public class VisaTests extends TestBase{
	
	HomePage homePage;
	
	@Test
	public void verify_visaPage() throws InterruptedException{
		
		homePage.clickOnVisaTab();
		Thread.sleep(10000);
		//comment
		
		
	}
	
	

	@BeforeClass
	public void setup(){
		homePage= new HomePage(getDriver());
		
	}
	
}
