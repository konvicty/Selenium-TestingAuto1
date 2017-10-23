package com.auto1.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OurCarsPage extends LoginPage{

	public static final By LOGGED_IN_USER_DROPDOWN = By.className("user");
	public static final By BMW_CHECKBOX = By.xpath(".//div[@class='form-group']//label[@class='checkbox-filter-item']//span[contains(@class,'bmw')]");
	public static final By CAR_OFFERS = By.xpath(".//div[@class='big-car-card__header']//span[1]");
	public static final By SELECTED_MANUFACTURER_FILTER = By.xpath(".//div[@class='selected-filter']//span[2]");
	public static final By CAR_IMAGES = By.xpath(".//div[contains(@class,'image-gallery-slide center')]");
	public static final By STOCK_NUMBER = By.xpath(".//div[@class='big-car-card__footer']//div[@class='car-specs-list']//tr[1]//td");
	public static final By MILEAGE = By.xpath(".//div[@class='big-car-card__footer']//div[@class='car-specs-list']//tr[2]//td");
	public static final By FIRST_REGISTRATION = By.xpath(".//div[@class='big-car-card__footer']//div[@class='car-specs-list']//tr[3]//td");
	public static final By HORSE_POWER = By.xpath(".//div[@class='big-car-card__footer']//div[@class='car-specs-list']//tr[4]//td");
	public static final By FUEL_TYPE = By.xpath(".//div[@class='big-car-card__footer']//div[@class='car-specs-list']//tr[5]//td");
	public static final By GEAR_BOX = By.xpath(".//div[@class='big-car-card__footer']//div[@class='car-specs-list']//tr[6]//td");
	
	public void scrollDown() {
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
	}
	
	public OurCarsPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnBMWMerchant() {
		driver.findElement(BMW_CHECKBOX).click();
	}
	
	public ArrayList<WebElement> getAllDisplayedCarsOffers() {
		return (ArrayList<WebElement>) driver.findElements(CAR_OFFERS);
	}
	
	public ArrayList<WebElement> getAllDisplayedCarImages() {
		return (ArrayList<WebElement>) driver.findElements(CAR_IMAGES);
	}
	
	public ArrayList<WebElement> getAllDisplayedStockNumbers() {
		return (ArrayList<WebElement>) driver.findElements(STOCK_NUMBER);
	}
	
	public ArrayList<WebElement> getAllDisplayedMileages() {
		return (ArrayList<WebElement>) driver.findElements(MILEAGE);
	}
	
	public ArrayList<WebElement> getAllDisplayedFirstRegistrations() {
		return (ArrayList<WebElement>) driver.findElements(FIRST_REGISTRATION);
	}
	
	public ArrayList<WebElement> getAllDisplayedHorsePowerInfo() {
		return (ArrayList<WebElement>) driver.findElements(HORSE_POWER);
	}
	
	public ArrayList<WebElement> getAllDisplayedFuelTypes() {
		return (ArrayList<WebElement>) driver.findElements(FUEL_TYPE);
	}
	
	public ArrayList<WebElement> getAllDisplayedGearBoxInfo() {
		return (ArrayList<WebElement>) driver.findElements(GEAR_BOX);
	}
	
	public String getCarMerchant(int index) {
		return getAllDisplayedCarsOffers().get(index).getText().trim();
	}
	
	public void clickOnDesiredMerchant() {
		
		List<WebElement> expandButtons = driver.findElements(BMW_CHECKBOX);
		WebElement expandButton = expandButtons.get(0);
		Actions moveMouseOver = new Actions(driver);
		moveMouseOver.moveToElement(expandButton).build().perform();
		String script = "document.getElementsByClassName('car-icon bmw')[0].click();";
		((JavascriptExecutor) driver).executeScript(script);
	}
	
	public String getSelectedManufacturerFilter() {
		return driver.findElement(SELECTED_MANUFACTURER_FILTER).getText();
	}
}
