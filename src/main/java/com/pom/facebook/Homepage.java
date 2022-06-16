package com.pom.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	public WebDriver driver;
	
	@FindBy(name="username")
	private WebElement user;
	@FindBy(id ="password")
	private WebElement pass;
	@FindBy(name ="login")
	private WebElement log;
	
	public Homepage(WebDriver driver2) {
		this.driver =driver2;
            . intElements(driver, this);
		
		
	}
	

}
