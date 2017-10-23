package com.auto1.settings;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTestsHelper {

	protected static WebDriver driver;
	
	// In a more complex framework, this information should be stored in config.properties files
    private String username = "fonoffakoh-9231@yopmail.com";
    private String password = "Tester123#";
    private String url = "https://www.auto1.com/en/";
    
    public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\com\\auto1\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(getUrl());
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);	
	}
	
	@After
	public void closeBrowserSilent() {
		if(driver != null) {
			driver.quit(); 
		}
	}
}
