package com.Facebookqaf.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSearch {
	WebDriver driver; 

	@Given("I am on facebook homepage")
	public void i_am_on_facebook_homepage() {
		WebDriverManager.chromedriver().setup(); //setting up browser
		driver = new ChromeDriver(); //create object using driver
		driver.get("https://www.facebook.com/"); //browse link from driver
		driver.manage().window().fullscreen();
	   
	}

	@When("I enter my {string} and {string}")
	public void i_enter_my_and(String string, String string2) {
		WebElement jahed = driver.findElement(By.name("email"));
		jahed.sendKeys(string);
		WebElement jahed1 = driver.findElement(By.name("pass"));
		jahed1.sendKeys(string2);
	    
	}

	@When("I click on login")
	public void i_click_on_login() {
		WebElement jahed2 = driver.findElement(By.name("login"));
		jahed2.click();
	    
	}

	@Then("I see my facebook profile pop up")
	public void i_see_my_facebook_profile_pop_up() {
		//driver.close();
	    
	}


}
