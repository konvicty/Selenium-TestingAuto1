package com.auto1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Auto1MainPage {
	
	protected WebDriver driver;
	public static final By LOGIN = By.xpath("//a[@class=\"signin-link\"]");
	
	public Auto1MainPage(WebDriver driver) {
		this.driver = driver;
	}
		
	public void goToMainPage(String url) {
		driver.get(url);
	}
	
	public LoginPage accessLoginPanel() {
		WebElement element = driver.findElement(LOGIN);
		element.click();
		return new LoginPage(driver);
	}
	
	public void waitFor(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            System.out.printf(e.getMessage(), e);
        }
    }
}
