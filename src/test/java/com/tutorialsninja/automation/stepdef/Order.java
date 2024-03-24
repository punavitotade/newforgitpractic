package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.*;


public class Order {
	    
	
	HeaderSection headersection = new HeaderSection();
	LoginPage loginpage = new LoginPage();
	SearchResultPage searchresultpage = new SearchResultPage();
	ShoppingCartPage shoppingcartpage = new ShoppingCartPage();
	CheckoutPage checkoutpage = new CheckoutPage();
	OrderSuccessPage ordersuccesspage = new OrderSuccessPage();
	
	
	
 	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		
		Browser.OpenApplicationURL();
	    HeaderSection.navigateToLoginPage();
	    LoginPage.doLogin();
	}
	
	

   @When("^I add any produt in bad and checkout$")
   public void i_add_any_produt_in_bad_and_checkout() {
	
	   HeaderSection.searchAProduct();
	   SearchResultPage.addsearchProductIntoSearchResultToCart();
	   HeaderSection.navigatetoShoppingCartPage();
	   ShoppingCartPage.navigatetocheckoutPage();
	   
	   
	 
   }

    @When("^I place the order$")
    public void i_place_the_order() {
    	
    	CheckoutPage.palceAnOrder();
    	
    	
    
  }

@Then("^I should see that the order is placed successfully$")
public void i_should_see_that_the_order_is_placed_successfully()  {
	
	
	Waits.waitUntilElementLocated(10, OrderSuccessPage.SuccessBreadcrumb);
	
	Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.SuccessBreadcrumb));
    
}



}
