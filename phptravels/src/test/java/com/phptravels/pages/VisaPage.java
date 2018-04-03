package com.phptravels.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisaPage extends BasePage{

	public VisaPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id='body-section']/div[1]/div/div/div[1]/div/ul/li[5]/a/span")
	private WebElement tabVisa;
	
	
	
	public void clickOnVisaTab(){
		tabVisa.click();
	}

}
