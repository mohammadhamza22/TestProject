package com.pages;

import org.openqa.selenium.WebDriver;

public class Somethingnewpage {
	private WebDriver driver;
	public Somethingnewpage(WebDriver driver) {
		this.driver=driver;
		}
	//page action
	public String gethomepagetitle() {
		return driver.getTitle();
		
	}
	
	

	
	

}
