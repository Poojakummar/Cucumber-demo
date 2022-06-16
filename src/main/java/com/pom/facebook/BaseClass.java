package com.pom.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
 public static WebDriver driver;
  //Browser
 public static WebDriver Broswerlaunch(String broswer) {
  try { 
  
//	if(browser.equalsIgnoreCase("chrome")){
	//  	//System.setProperty("webdriver.chrome.driver","C:\Users\ADMIN\eclipse-workspace\FacebookProject\Driver\chromedriver.exe" )	;	
//	          		WebDriverManager.chromedriver().setup();

                       driver=new ChromeDriver();{
	if (broswer.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup().
		 // driver =new FirefoxDriver();
	//}else}
        //  System.out.println("Invalid Broswer");
  //    	{
    	//	driver.manage().window().maximize();
    	//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	//	return driver;
    		
		
		//get url frome user
		//public static void get_url(String url1) {
	//		driver.get(url1);
		}
			//navigation
		//	public static void navigate(String url1);{
			//	d.navigate().to(url1);
}
     public static void name (String value) {
    	 driver.findElement(By.name(value));}	 	
    	
 }
public static WebDriver setUp(String string) {
	// TODO Auto-generated method stub
	return null;
}
	
        		
		
	}