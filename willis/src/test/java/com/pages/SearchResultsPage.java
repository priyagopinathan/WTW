package com.pages;

import org.openqa.selenium.By;

import com.runners.BaseClass;

public class SearchResultsPage extends BaseClass{
	private static By DATE_SORT_OPTION=By.cssSelector(".CoveoSort.coveo-selected");
	
	public void selectDateSort() {
		
		if(driver.findElement(DATE_SORT_OPTION).isDisplayed()) {
			driver.findElement(DATE_SORT_OPTION).click();
		}
		
	}

}
