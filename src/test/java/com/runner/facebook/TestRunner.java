package com.runner.facebook;


import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pom.facebook.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 @RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/com/feature/facebook/Facebook.feature",
		glue    = "com/stepdefinition",
		dryRun   = false,
		monochrome = true,
		stepNotifications= true,
		publish= true)
 
public class TestRunner {
	 public static WebDriver driver;
	 @BeforeClass
	 public static void launch()throws IOException {
		 
		 driver= BaseClass.setUp("lanchBroswer");
	 }
	 
	   @AfterClass
	   		public static void broswerClose() {
		    driver.quit();
	   }
}
	 
	 


