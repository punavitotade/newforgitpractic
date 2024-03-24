package com.tutorialsninja.automation.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;




public class RegisterPage {
	
	public RegisterPage() {
		
		PageFactory.initElements(Base.driver,this);
	}
	
	@FindBy(id="input-firstname")
	public static WebElement Firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	public static WebElement lastname;
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(id="input-telephone")
	public static WebElement telephone;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	
	@FindBy(name="agree") 
	public static WebElement PrivacyPolicy;
	
	@FindBy(xpath= "//input[@type='submit']")
	public static WebElement ContinueButton;
	
	@FindBy(linkText="Register")
	public static WebElement RegisterBreadcrumb;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement firstnamewarning ;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement lastnamewarning ;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement emailwarning;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement telephonewarning;
	
	@FindBy(css="input[id='input-password']+div")
	public static WebElement passwordwarning;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainwarning;
	
	@FindBy (css="input[name='newsletter'][value='1']")
	public static WebElement yestonewsletter;
	
	
	
	
	
	


}
