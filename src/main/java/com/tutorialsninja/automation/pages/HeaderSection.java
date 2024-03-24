package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;

public class HeaderSection {
	
	public HeaderSection (){
		
		PageFactory.initElements(Base.driver, this);
		
		
	}
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")  
	public static WebElement MyAccountlink;
	
	
	@FindBy(linkText="Login")
	public static WebElement Login;
	
	
	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(name="search")
	public static WebElement searchFeild;
	
	@FindBy(xpath="//span[@class='input-group-btn']//button[@type='button']")
	public static WebElement searchbutton;
	
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement viewShoppincartOption;
	
	public static void navigateToLoginPage() {
	
	Elements.click(HeaderSection.MyAccountlink);
	Elements.click(HeaderSection.Login);

	}
	
	public static void searchAProduct() {
		
		Elements.TypeText(searchFeild, Base.reader.getProduct());
		Elements.click(searchbutton);
		
	}
	
	public static void navigatetoShoppingCartPage() {
		
	Elements.click(viewShoppincartOption);
	}
	

}
