package com.auto1.tests;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import com.auto1.pages.Auto1MainPage;
import com.auto1.pages.LoginPage;
import com.auto1.pages.OurCarsPage;
import com.auto1.settings.SeleniumTestsHelper;

public class Test1 extends SeleniumTestsHelper{

	@Test
	public void test1() {
		Auto1MainPage mainPage = new Auto1MainPage(driver);
		
		
		LoginPage loginPage = mainPage.accessLoginPanel();
		loginPage.writeEmailAdressToLogin(getUsername());
		loginPage.writePasswordToLogin(getPassword());
		loginPage.waitFor(1000);
		OurCarsPage loggedInPage = (OurCarsPage) loginPage.clickOnLoginButton();
		loggedInPage.waitFor(5000);
		loggedInPage.scrollDown();
		loggedInPage.waitFor(5000);
		loggedInPage.clickOnDesiredMerchant();
		loggedInPage.waitFor(5000);
		loggedInPage.getSelectedManufacturerFilter();
		
		Assert.assertTrue(loggedInPage.getSelectedManufacturerFilter().contains("BMW"));
		
		ArrayList<WebElement> selectedItemsList = loggedInPage.getAllDisplayedCarsOffers();
		  for (WebElement item: selectedItemsList) {
		   Assert.assertTrue(item.getText().contains("BMW")); 
		  }
		  
		ArrayList<WebElement> displayedStockNumbers = loggedInPage.getAllDisplayedStockNumbers();
		  for (WebElement item: displayedStockNumbers) {
		   Assert.assertFalse(item.getText().isEmpty()); 
		  }
		  
		ArrayList<WebElement> displayedMileages = loggedInPage.getAllDisplayedMileages();
		  for (WebElement item: displayedMileages) {
		   Assert.assertFalse(item.getText().isEmpty()); 
		  }
		  
	    ArrayList<WebElement> displayedFirstRegistrations = loggedInPage.getAllDisplayedFirstRegistrations();
		  for (WebElement item: displayedFirstRegistrations) {
		   Assert.assertFalse(item.getText().isEmpty()); 
		  }
		  
	    ArrayList<WebElement> displayedHorsePowerInfo = loggedInPage.getAllDisplayedHorsePowerInfo();
		  for (WebElement item: displayedHorsePowerInfo) {
		   Assert.assertFalse(item.getText().isEmpty()); 
		  } 
		  
	    ArrayList<WebElement> displayedFuelTypes = loggedInPage.getAllDisplayedFuelTypes();
		  for (WebElement item: displayedFuelTypes) {
		   Assert.assertFalse(item.getText().isEmpty()); 
		  }    
		  
	    ArrayList<WebElement> displayedGearBosInfo = loggedInPage.getAllDisplayedGearBoxInfo();
		  for (WebElement item: displayedGearBosInfo) {
		   Assert.assertFalse(item.getText().isEmpty()); 
		  }   		  
	}
}
