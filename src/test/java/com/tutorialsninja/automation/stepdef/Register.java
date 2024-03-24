package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	
	HeaderSection headersection = new HeaderSection ();
	RegisterPage registerPage = new RegisterPage();
	AccountSuccessPage accountsuccesspage = new AccountSuccessPage();
	
	@Given("^I launch the Application$")
	public void i_launch_the_Application()  {
		Base.driver.get(Base.reader.getUrl());
	    
	}
	
	

	@And("^I navigate to the registration page$")
	public void i_navigate_to_the_registration_page()  {
		Elements.click(HeaderSection.MyAccountlink);
		Elements.click(HeaderSection.register);
	    
	}

	@When("^I provide the below details$")
	public void i_provide_th_below_details(DataTable DataTable)  {
		
		Map<String,String> map = DataTable.asMap(String.class,String.class);
	    Elements.TypeText(RegisterPage.Firstname, map.get("Firstname"));
		Elements.TypeText(RegisterPage.lastname, map.get("Lastname"));
		Elements.TypeText(RegisterPage.email, System.currentTimeMillis()+map.get("Email"));
	    Elements.TypeText(RegisterPage.telephone, map.get("Telephone"));
	    Elements.TypeText(RegisterPage.password, map.get("Password"));
	    Elements.TypeText(RegisterPage.confirmPassword, map.get("Password"));
	    
	}
		

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy()  {
		
		Elements.click(RegisterPage.PrivacyPolicy);
	   
	}
	
	@And("^I Click on Continue button$")
	public void i_Click_on_Continue_button() {
		
		Elements.click(RegisterPage.ContinueButton);
	    
	}

	@Then("^I should see the user account succesfully created$")
     public void i_should_see_the_user_account_succesfully_created() {
		
		
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.SuccessBreadcrub));
	    
		
	}
	
	
	@Then("^I should see the user Account should not created$")
	public void i_should_see_the_user_Account_should_not_created()  {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.RegisterBreadcrumb));
		
	    
	}

	@Then("^I should see the error messages informing user to fill the mandetory fields$")
	public void i_should_see_the_error_messages_informing_user_to_fill_the_mandetory_fields() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstnamewarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastnamewarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailwarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephonewarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordwarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.mainwarning));
		
	    
	}
	
	@When("^I subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter()  {
		
		Elements.click(RegisterPage.yestonewsletter);
	   
	}
	
	@When("^I provide the below duplicate deatils$")
	public void i_provide_the_below_duplicate_deatils(DataTable DataTable)  {
		

		Map<String,String> map = DataTable.asMap(String.class,String.class);
	    Elements.TypeText(RegisterPage.Firstname, map.get("Firstname"));
		Elements.TypeText(RegisterPage.lastname, map.get("Lastname"));
		Elements.TypeText(RegisterPage.email, map.get("Email"));
	    Elements.TypeText(RegisterPage.telephone, map.get("Telephone"));
	    Elements.TypeText(RegisterPage.password, map.get("Password"));
	    Elements.TypeText(RegisterPage.confirmPassword, map.get("Password"));
		
		
		
	   
	}

	@Then("^I should see the user is restricted from creating account$")
	public void i_should_see_the_user_is_restricted_from_creating_account()  {
		
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.mainwarning, "Warning: E-Mail Address is already registered!"));
	   
	}



}
