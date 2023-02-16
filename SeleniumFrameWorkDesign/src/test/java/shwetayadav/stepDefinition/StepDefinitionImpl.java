package shwetayadav.stepDefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import shwetayadav.TestComponents.BaseTest;
import tcs.SeleniumFrameWorkDesign.CartPage;
import tcs.SeleniumFrameWorkDesign.CheckoutPage;
import tcs.SeleniumFrameWorkDesign.ConfirmationPage;
import tcs.SeleniumFrameWorkDesign.Landingpage;
import tcs.SeleniumFrameWorkDesign.Productcatalogue;

public class StepDefinitionImpl extends BaseTest {
	public Landingpage landingPage;
	public Productcatalogue productCatalogue;
	public ConfirmationPage confirmationPage;
//	@Given("I landed on Ecommerce Page")
//	public void I_landed_on_Ecommerce_Page() throws IOException
//	{
//		landingPage=launchApplication();
//		
//	}
// 
//	@Given("^Logged in with username (.+) and password (.+)$")
//	public void logged_in_username_and_password(String username,String password)
//	{
//		productCatalogue=landingpage.loginApplication(username,password);
//		
//	}
//	@When("I add product {string} to Cart")
//	public void i_add_product_to_cart(String productName) {
//	{
//		List<WebElement> products= productCatalogue.getProductList();
//		productCatalogue.addProductCart(productName);
//	}
//	
//	@And("Checkout {string} and submit the order")
//	public void checkout_submitOrder(String productName)
//	{
//		CartPage cartpage=productCatalogue.goToCartPage();
//		Boolean match=cartpage.VerifyProductDisplay(productName);
//		Assert.assertTrue(match);   
//		CheckoutPage checkoutPage=cartpage.goToCheckout();
//		checkoutPage.selectCountry("india");
//		confirmationPage=checkoutPage.submitOrder();
//	}
//	//@Then("Then {string}  message is displayed on confirmation page")
//	
//	@Then("^\"([^\"]*)\" message is displayed on confirmation page$")
//	public void message_displayed_confirmationPage(String strArg1)
//	{
//		String confirmMessage=confirmationPage.getConfirmationMessage();
//		Assert.assertTrue(confirmMessage.equalsIgnoreCase(strArg1));
//	}
	
	@Given("I landed on Ecommerce Page")
	public void i_landed_on_ecommerce_page() throws IOException {
		landingPage=launchApplication();
	}

	@Given("Logged in with username {string} and password {string}")
	public void logged_in_with_username_and_password(String username, String password) {
		productCatalogue=landingpage.loginApplication(username, password);
	}

	@When("I add product {string} to Cart")
	public void i_add_product_to_cart(String productName) {
		List<WebElement> products= productCatalogue.getProductList();
		productCatalogue.addProductCart(productName);
	}

	@When("Checkout {string} and submit the order")
	public void checkout_and_submit_the_order(String productName) {
		CartPage cartpage=productCatalogue.goToCartPage();
		Boolean match=cartpage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);   
		CheckoutPage checkoutPage=cartpage.goToCheckout();
		checkoutPage.selectCountry("india");
		confirmationPage=checkoutPage.submitOrder();
	}

	@Then("{string} message is displayed on confirmation page")
	public void message_is_displayed_on_confirmation_page(String message) {
		String confirmMessage=confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase(message));
	}


}
