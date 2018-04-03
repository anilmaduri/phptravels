package com.phptravels.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.phptravels.pages.HomePage;
import com.phptravels.pages.ToursPage;
import com.phptravels.utils.TestBase;

public class ToursTests extends TestBase {

	HomePage homePage;
	ToursPage toursPage;
	@Test
	public void tours_booking() throws InterruptedException{
		
		homePage.clickOnToursTab();
		Thread.sleep(3000);
		toursPage.toursSearch();
		
		
	}
	
	

	@BeforeClass
	public void setup(){
		homePage= new HomePage(getDriver());
		toursPage= new ToursPage(getDriver());
		
	}
}
