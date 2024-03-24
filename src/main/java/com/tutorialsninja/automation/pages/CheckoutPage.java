package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	
	public  CheckoutPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	
	
	@FindBy(id="button-payment-address")
	public static WebElement checkoutButtonofBillingDeatilsOption; 
	
	
	@FindBy(id="button-shipping-address")
	public static WebElement checkoutbuttonofDEliveryDeatilsOption;
	
	
	@FindBy(id="button-shipping-method")
	public static WebElement checkoutbuttonofDEliveryMethodOption;
	
	
	@FindBy(name="agree")
	public static WebElement termsAndconditionsCheckbox;
	
	
	@FindBy(id="button-payment-method")
	public static WebElement checkoutbuttonofPaymentMethodOption;
	
	
	@FindBy(id="button-confirm")
	public static WebElement confirmOrderOption;
	
	public static void palceAnOrder() {
		//Elements.click(CheckoutbuttonofCheckoutOption);
		Elements.click(checkoutButtonofBillingDeatilsOption);
    	Elements.click(checkoutbuttonofDEliveryDeatilsOption);
    	Elements.click(checkoutbuttonofDEliveryMethodOption);
    	Elements.click(termsAndconditionsCheckbox);
    	Elements.click(checkoutbuttonofPaymentMethodOption);
    	Elements.click(confirmOrderOption);
		
		
	}

}
