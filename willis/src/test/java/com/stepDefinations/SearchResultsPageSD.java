package com.stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runners.BaseClass;

import cucumber.api.java.en.When;


public class SearchResultsPageSD extends BaseClass{
	
	@When("^I should see the search results page$")
	public void i_Should_See_The_Search_Results_Page() throws Throwable {
		
		Assert.assertEquals(HomePageSD.expectedSearchTerm, driver.findElement(By.cssSelector(".CoveoQuerySummary Strong")).getText());
	    
	}
	
	@When("^I Select date sort option$")
	public void i_Select_Date_Sort_Option() throws Throwable {
		
		searchResultsPage.selectDateSort();
	    
	}
	
	@When("^I should see results sorted on date$")
	public void i_Should_See_Sesults_SortedOn_Date() throws Throwable {
		
		Assert.assertEquals("Pay-for-Performance Analytics and Alignment", driver.findElements(By.cssSelector(".coveo-results-title")).get(0).getText());
	    
	}
	
	
	

}
