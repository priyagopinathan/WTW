package com.stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runners.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class HomePageSD extends BaseClass{
	public static String expectedSearchTerm;
	@Given("^I am in Home Page$")
	public void i_am_in_Home_Page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver(); //Multilevel Inheritance
		driver.get("https://www.willistowerswatson.com/en");
		homePage.acceptCookiesIfDisplayed();
	    Assert.assertEquals("Global | English", driver.findElement(By.cssSelector("#btnCountrySelector")).getText());
	}

	@When("^I search for product \"([^\"]*)\"$")
	public void i_search_for_product(String searchWord) throws Throwable {
		expectedSearchTerm=searchWord;
		
	}

}
