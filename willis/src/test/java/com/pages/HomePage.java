package com.pages;

import org.openqa.selenium.By;

import com.runners.BaseClass;

public class HomePage extends BaseClass{
	
	private static By ACCEPT_COOKIE=By.cssSelector(".call");
	private static By SEARCH_TEXTBOX=By.cssSelector("#site_search");
	private static By SEARCH_BUTTON=By.cssSelector(".input-group-addon button");
	public void acceptCookiesIfDisplayed() {
		
		if(driver.findElement(ACCEPT_COOKIE).isDisplayed()) {
			
			driver.findElement(ACCEPT_COOKIE).click();
			driver.findElement(ACCEPT_COOKIE).click();
		}
	}
	
	public void searchProduct(String searchWord) {
		driver.findElement(SEARCH_TEXTBOX).clear();
		driver.findElement(SEARCH_TEXTBOX).sendKeys(searchWord);
		driver.findElement(SEARCH_BUTTON).click();
	}

}
