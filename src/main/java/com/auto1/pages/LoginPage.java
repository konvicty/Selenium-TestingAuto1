package com.auto1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends Auto1MainPage{

	public static final By EMAIL_ADDRESS = By.id("login-email");
	public static final By PASSWORD = By.id("login-password");
	public static final By LOGIN_BUTTON = By.className("btn-primary");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void writeEmailAdressToLogin(String emailAddress) {
		WebElement emailInputBox = driver.findElement(EMAIL_ADDRESS);
		emailInputBox.sendKeys(emailAddress);
	}
	
	public void writePasswordToLogin(String password) {
		WebElement passwordInputBox = driver.findElement(PASSWORD);
		passwordInputBox.sendKeys(password);
	}
	
	public LoginPage clickOnLoginButton() {
		WebElement element = driver.findElement(LOGIN_BUTTON);
		element.click();
		return new OurCarsPage(driver);
	}
}
