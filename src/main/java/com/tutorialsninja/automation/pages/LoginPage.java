package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	public  LoginPage() {
		
		PageFactory.initElements(Base.driver,this);
		
	}
	
	
	@FindBy(id="input-email")
	public static WebElement Emailfield;
	
	
	@FindBy(id="input-password")
	public static WebElement passwordfield;
	
	@FindBy(css="input[type='submit' ][value='Login']")
	public static WebElement loginclick;
	
	
	@FindBy(css="div[class$=' alert-dismissible']")
	public static WebElement mainwarning;
	
	
	@FindBy(linkText= "Forgotten Password")
	public static WebElement forgotpassword;
	

	
	public static void doLogin(String email,String password) {
		
		Elements.TypeText(LoginPage.Emailfield, email);
		Elements.TypeText(LoginPage.passwordfield, password);
		Elements.click(LoginPage.loginclick);	
			
		
	}
	
	public static void doLogin() {
		
		 Elements.TypeText(Emailfield, Base.reader.getUsername());
		    Elements.TypeText(passwordfield, Base.reader.getPassword());
		    Elements.click(loginclick);
	}

}
