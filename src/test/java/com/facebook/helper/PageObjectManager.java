package com.facebook.helper;

import org.openqa.selenium.WebDriver;

public class PageObjectManager<LoginPage> {
	public static WebDriver driver;
	private LoginPage Ip;
	
}
    public PageObjectManager(WebDriver driver1) {
	
	PageObjectManager.driver =driver1;
    }
   public LoginPage getLp() {
	   Ip =new LoginPage(driver);
	   return Ip;
	   
	   
   }
}
