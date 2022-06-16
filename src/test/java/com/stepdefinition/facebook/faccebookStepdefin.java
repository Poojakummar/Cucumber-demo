package com.stepdefinition.facebook;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.facebook.helper.PageObjectManager;
import com.runner.facebook.TestRunner;

import io.cucumber.core.backend.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class faccebookStepdefin extends BaseClass {
	
	public static WebDriver driver=TestRunner.driver;
	PageObjectManager pom=new PageObjectManager(driver);
	@Before
	public void afterHook(Scenario scenario ) throws IOException{ 
		String name=scenario.getName();
		System.out.println("scenarioName:"+name);
	}
		@After
	public void afterHooks(Scenario scenario) throws IOException {
       io.cucumber.java.Status status =scenario.getStatus();	
       System.out.println("scenarioStatues:+statues");
       if (scenario.isFailed()) {
    	   getscreenshot(scenario.getName());     
       }
	@Given ("user launches the application")
	public void user_launches_the_application() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	 driver.get("https://www.facebook.com");
	 driver.manage().window().maximize();
	 System.out.println("user launched the application"); 
	}
	//@When("user enter valid {string} in the application")
	//public void user_enter_the_below_for_login_the_application(DataTable datatable) {
	 //List<Map<String, String>> asMaps= datatable.asMaps(String.class,String.class);
	 //String user =asMaps.get(0).get("username");
	// String pass =asMaps.get(0).get("password");
		//driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		System.out.println("user entered the username and password");}
	
	
	  private void getscreenshot(String name) {
		
	}
	 @When("user click the login button")
	public void user_click_the_login_button() {
     WebElement login = driver.findElement(By.name("login-button"));
     login.click();
     System.out.println("user clicked the login button");
	  }
	  
	
	 @Then ("user verifies the product homepage")
	public void user_verifies_the_product_homepage() {
		System.out.println("product homepage is varified");
	}	
	   
	}


	
	
	
	
	


