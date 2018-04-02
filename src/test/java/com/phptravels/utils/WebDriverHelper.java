package com.phptravels.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class WebDriverHelper {
	static WebDriver driver = null;

	public static WebDriver createDriver(String Browser) {

		String browser = "Chrome";
		switch (browser) {

		case "Chrome":
			System.setProperty("webdriver.chrome.driver",
					"C://Users//Hp//Appium_Demo//phptravels//src//test//java//resources//drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://phptravels.net");
			break;
		case "FF":
			break;
		default:

			break;
		}
		return driver;

	}

}
