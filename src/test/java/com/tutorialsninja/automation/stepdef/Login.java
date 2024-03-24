package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.*;


public class Login {
	
	HeaderSection headersection = new HeaderSection();
	LoginPage loginpage = new  LoginPage();
	MyAccountPage myaccountpage = new MyAccountPage ();
	ForgotPasswordPage forgotpasswordpage = new ForgotPasswordPage ();
	
	
	@Given("^I navigate to Account login page$")
	public void i_navigate_to_Account_login_page()  {
		
		Elements.click(HeaderSection.MyAccountlink);
		Elements.click(HeaderSection.Login);
	    
	}

	@When("^I login to the Application using \"([^\"]*)\" and enter password \"([^\"]*)\"$")
	public void i_login_to_the_Application_using_and_enter_password(String email, String password) {
		
		LoginPage.doLogin(email, password);
	   
	}

	@When("^I should see user is able to login successfully$")
	public void i_should_see_user_is_able_to_login_successfully()  {
		
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.Registeraffiliatedaccount));
		  
	}
	

   @When("^I should see error messege that credentials are invalid$")
   public void i_should_see_error_messege_that_credentials_are_invalid()  {
	   
	  Assert.assertTrue( Elements.VerifyTextEquals(LoginPage.mainwarning, "Warning: No match for E-Mail Address and/or Password."));
    
}
   
   @When("^I  reset the forgotten password for email\"([^\"]*)\"$")
   public void i_reset_the_forgotten_password_for_email(String email)  {
       
		   Elements.click(LoginPage.forgotpassword);
		   Elements.TypeText(ForgotPasswordPage.emailfield,email  );
		   Elements.click(ForgotPasswordPage.contineubutton);
		  
		  
   }
   
   
       
   
   @When("^I should see messege informing user that information related to setting passwrd have been sent to email$")
   public void i_should_see_messege_informing_user_that_information_related_to_setting_passwrd_have_been_sent_to_email()  {
       
        Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainwarning, "An email with a confirmation link has been sent your email address."));

   }
}
