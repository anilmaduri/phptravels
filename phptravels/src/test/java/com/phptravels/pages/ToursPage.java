package com.phptravels.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToursPage extends BasePage{

	public ToursPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"TOURS\"]//button[@type='submit']")
	private WebElement toursSearchButton;
	
	public void toursSearch() {
		toursSearchButton.click();
	}
}
