package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class Hplp3065Page {
	
	public Hplp3065Page() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	
	
	
	@FindBy(id="button-cart")
	public static WebElement clikonAddToCartHPL3065;
	

}
