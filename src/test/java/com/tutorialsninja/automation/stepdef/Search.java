package com.tutorialsninja.automation.stepdef;



import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.SearchResultPage;

import cucumber.api.java.en.*;


public class Search {
	
	HeaderSection headersectio = new HeaderSection();
	 SearchResultPage  searchResultPage =new  SearchResultPage();
	
	
	@Then("^I search for the product \"([^\"]*)\"$")
	public void i_search_for_the_product(String product)  {
		
		Elements.TypeText(HeaderSection.searchFeild, product  );
		Elements.click(HeaderSection.searchbutton);
	    
	}

	@Then("^I should see the product in the serach result$")
	public void i_should_see_the_product_in_the_serach_result()  {
		
		Assert.assertTrue(Elements.isDisplayed( SearchResultPage.Samsungsyncmasterserachresult));
	   
	}
	
	@Then("^I should see page displaying message \"([^\"]*)\"$")
	public void i_should_see_page_displaying_message(String message)  {
		
		Assert.assertTrue(Elements.VerifyTextEquals(SearchResultPage.noproductmessage, message));
	    
	}

}
