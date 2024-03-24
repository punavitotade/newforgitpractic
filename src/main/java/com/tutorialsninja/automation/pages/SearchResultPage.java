package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class SearchResultPage {
	 
	public SearchResultPage() {
		
		PageFactory.initElements(Base.driver,this);
	}
	
	
	@FindBy(linkText="Samsung SyncMaster 941BW")
	public static WebElement Samsungsyncmasterserachresult;
	
	@FindBy(css="input[id=button-search]+h2+p")
	public static WebElement noproductmessage;
	
	
	@FindBy(xpath="//span[text()='Add to Cart'][1]")  
	public static WebElement firstaddtocartoption;
	
	@FindBy(id="button-cart")
	public static WebElement clikonAddToCartHPL3065;
	
	
	public static void addsearchProductIntoSearchResultToCart() {
		
		 Elements.click(SearchResultPage.firstaddtocartoption);
		 Elements.click(clikonAddToCartHPL3065);
		 
		
		
	}

}
